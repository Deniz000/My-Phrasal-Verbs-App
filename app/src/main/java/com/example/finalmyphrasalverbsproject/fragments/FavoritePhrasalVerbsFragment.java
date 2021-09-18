package com.example.finalmyphrasalverbsproject.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.finalmyphrasalverbsproject.FavoriteActivity;
import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.adapters.FavoriteVerbAdapter;
import com.example.finalmyphrasalverbsproject.models.FavoriteVerb;

public class FavoritePhrasalVerbsFragment extends Fragment {

    RecyclerView recyclerView;
    CheckBox checkBox;
    FavoriteVerbAdapter favoriteVerbAdapter;
    View view;
    public FavoritePhrasalVerbsFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_favorite_phrasal_verbs, container, false);

        favoriteVerbAdapter = new FavoriteVerbAdapter(getContext(), FavoriteVerb.getDate());
        LinearLayoutManager linearLayout = new LinearLayoutManager(getContext());
        recyclerView = view.findViewById(R.id.recyclerView_verb);
        checkBox = view.findViewById(R.id.checkbox_favorite_favorite);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.setAdapter(favoriteVerbAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }


}