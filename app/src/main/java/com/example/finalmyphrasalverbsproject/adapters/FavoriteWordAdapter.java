package com.example.finalmyphrasalverbsproject.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.models.FavoriteWord;

import java.util.ArrayList;

public class FavoriteWordAdapter extends RecyclerView.Adapter<FavoriteWordAdapter.CardView> {

    ArrayList<FavoriteWord> mDataListFavoriteWord;
    LayoutInflater inflater;

    @NonNull
    @Override
    public CardView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_favorite_words,parent,false);
        return new CardView(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardView holder, int position) {
        holder.txt_word.setText(mDataListFavoriteWord.get(position).getWord());
    }

    @Override
    public int getItemCount() {
        return mDataListFavoriteWord.size();
    }


    public class CardView extends RecyclerView.ViewHolder{
        TextView txt_word;
        CheckBox checkBox_favW;
        public CardView(@NonNull View itemView) {
            super(itemView);
            txt_word = itemView.findViewById(R.id.txt_wordGround);
            checkBox_favW = itemView.findViewById(R.id.checkbox_favorite_favoriteWord);

        }
    }
}
