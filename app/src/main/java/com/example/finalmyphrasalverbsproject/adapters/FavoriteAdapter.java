package com.example.finalmyphrasalverbsproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.models.Favorite;

import java.util.ArrayList;


public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.CardHolder> {

    ArrayList<Favorite> mDataListFavorite;
    LayoutInflater inflater;

    public FavoriteAdapter(Context context, ArrayList<Favorite> mfavoriteList) {
        inflater = LayoutInflater.from(context);
        this.mDataListFavorite = mfavoriteList;

    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_favorite,parent,false);
        return new CardHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {

        holder.txt_word.setText(mDataListFavorite.get(position).getLessonWord());
        holder.txt_word.setText(mDataListFavorite.get(position).getLessonVerbsName());
        holder.txt_mean.setText(mDataListFavorite.get(position).getLessonMean());
    }

    @Override
    public int getItemCount() {
        return mDataListFavorite.size();
    }

    public class CardHolder extends RecyclerView.ViewHolder {


        TextView txt_word, txt_mean;
        CheckBox checkBox_fav;
        public CardHolder(@NonNull View itemView) {
            super(itemView);
            txt_word = itemView.findViewById(R.id.txt_wordOrverb);
            txt_mean = itemView.findViewById(R.id.txt_mean);
            checkBox_fav = itemView.findViewById(R.id.checkbox_favorite_favorite);

        }
    }
}

