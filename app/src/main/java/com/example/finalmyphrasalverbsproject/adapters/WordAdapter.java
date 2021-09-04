package com.example.finalmyphrasalverbsproject.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.VerbsActivity;
import com.example.finalmyphrasalverbsproject.WordActivity;
import com.example.finalmyphrasalverbsproject.models.Lesson;
import com.example.finalmyphrasalverbsproject.models.Word;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.CardHolder> {

    ArrayList<Word> mDataListWord;
    LayoutInflater inflater;
    List<String> selectedValuesWord;
    Context mcontext;

    public WordAdapter(Context context, ArrayList<Word> mDataListWord) {
        inflater = LayoutInflater.from(context);
        this.mDataListWord = mDataListWord;
        this.mcontext = context;
        selectedValuesWord = new ArrayList<>();
    }


    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_word,parent,false);
        return new CardHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder,@SuppressLint("RecyclerView") int position) {
        Word word = mDataListWord.get(position);
        holder.txt_word.setText(mDataListWord.get(position).getWord());

        final String al = String.valueOf(mDataListWord.get(position));
        holder.checkBox_fav.setText(al);
        holder.checkBox_fav.setOnClickListener(v -> {
            if (holder.checkBox_fav.isChecked()){
                selectedValuesWord.add(al);
                Toast.makeText(inflater.getContext(), "seçildi",Toast.LENGTH_SHORT).show();
            }
            else{
                selectedValuesWord.remove(al);
                Toast.makeText(inflater.getContext(), "iptal edildi", Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, WordActivity.class);
                intent.putExtra("word", word.getWord());

                mcontext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mDataListWord.size();
    }

    public void filterList(ArrayList<Word> filteredList){
        mDataListWord = filteredList;
        notifyDataSetChanged();
    }
    public static class CardHolder extends RecyclerView.ViewHolder{

        TextView txt_word, txt_mean;
        CheckBox checkBox_fav;
        public CardHolder(@NonNull View itemView) {
            super(itemView);
            txt_word = itemView.findViewById(R.id.txt_wrodNameGround);
            checkBox_fav = itemView.findViewById(R.id.checkbox_favorite_word);

        }
    }
}
