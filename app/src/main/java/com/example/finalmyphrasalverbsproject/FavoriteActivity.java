package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.finalmyphrasalverbsproject.fragments.FavoritePhrasalVerbsFragment;
import com.example.finalmyphrasalverbsproject.fragments.FavoriteWordsFragment;
import com.google.android.material.tabs.TabLayout;

public class FavoriteActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        tabLayout = findViewById(R.id.tab_options);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new FavoritePhrasalVerbsFragment(), "Phrasal Verbs");
        vpAdapter.addFragment(new FavoriteWordsFragment(), "Dictionary");
        viewPager.setAdapter(vpAdapter);
    }
}