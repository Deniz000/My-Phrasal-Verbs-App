package com.example.finalmyphrasalverbsproject;


import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class GSuggester {
    private static Retrofit instance;


    private static Retrofit getInstance() {
        if (instance==null){
            instance = new Retrofit.Builder()
                    .baseUrl("https://suggestqueries.google.com/")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return instance;
    }

    public void getSuggestions(String text, CompositeDisposable disposable, final ListView listView, final Context context) {
        final List<String>[] suggestions = new List[]{new ArrayList<>()};
        SuggestAPI myApi = getInstance().create(SuggestAPI.class);
        disposable.add(
                myApi.getSuggestFromGoogle(text,"chrome","en")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<String>() {
                            @Override
                            public void accept(String s) throws Exception {
                                if (suggestions[0].size() > 0) suggestions[0].clear();
                                JSONArray mainJsonArray = new JSONArray(s);
                                JSONArray suggestArry = new JSONArray(mainJsonArray.getString(1));
                                suggestions[0] = new Gson().fromJson(mainJsonArray.getString(1),
                                        new TypeToken<List<String>>() {
                                        }.getType());
                                ArrayAdapter<String> adapter =
                                        new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, suggestions[0]);
                                listView.setAdapter(adapter);
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                return;
                            }
                        }, new Action() {
                            @Override
                            public void run() throws Exception {
                                return;
                            }
                        })
        );
    }
    private interface SuggestAPI {
        @GET("complete/search")
        Observable<String> getSuggestFromGoogle(@Query("q") String query,
                                                @Query("client") String client,
                                                @Query("h1") String language);
    }

}
