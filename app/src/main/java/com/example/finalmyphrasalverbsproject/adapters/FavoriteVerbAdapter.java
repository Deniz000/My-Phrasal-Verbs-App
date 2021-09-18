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
import com.example.finalmyphrasalverbsproject.models.FavoriteVerb;

import java.util.ArrayList;


public class FavoriteVerbAdapter extends RecyclerView.Adapter<FavoriteVerbAdapter.CardHolder> {

    ArrayList<FavoriteVerb> mDataListFavoriteVerb;
    LayoutInflater inflater;


    public FavoriteVerbAdapter(Context context, ArrayList<FavoriteVerb> mfavoriteList) {
        inflater = LayoutInflater.from(context);
        this.mDataListFavoriteVerb = mfavoriteList;

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

        holder.txt_verb.setText(mDataListFavoriteVerb.get(position).getLessonVerbsName());
    }

    @Override
    public int getItemCount() {
        return mDataListFavoriteVerb.size();
    }

    public class CardHolder extends RecyclerView.ViewHolder {


        TextView txt_verb;
        CheckBox checkBox_fav;
        public CardHolder(@NonNull View itemView) {
            super(itemView);
            txt_verb = itemView.findViewById(R.id.txt_verbGround);
            checkBox_fav = itemView.findViewById(R.id.checkbox_favorite_favorite);

        }
    }
}

