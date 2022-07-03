package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.example.finalmyphrasalverbsproject.fragments.FavoritePhrasalVerbsFragment;
import com.example.finalmyphrasalverbsproject.fragments.FavoriteWordsFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class Login_SignupActivity extends AppCompatActivity {

    TabLayout tableLayout0;
    ViewPager viewPager0;
    FloatingActionButton fb, google, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signin);

        tableLayout0 = findViewById(R.id.tab_layout_log_reg);
        viewPager0 = findViewById(R.id.view_pager);
        fb = findViewById(R.id.fab_fb);
        google = findViewById(R.id.fab_google);
        pass = findViewById(R.id.pass);

        tableLayout0.setupWithViewPager(viewPager0);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new LoginTabFragment(), "Login");
        vpAdapter.addFragment(new SignupTabFragment(), "Sign Up");
        viewPager0.setAdapter(vpAdapter);


        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_SignupActivity.this, MainActivity.class));
            }
        });
        //https://youtu.be/ayKMfVt2Sg4

    }
}