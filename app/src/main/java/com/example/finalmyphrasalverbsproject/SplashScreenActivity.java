package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 3000;
    Animation zoomAnim, toRight;
    ImageView temel_iconn, bulutbir, bulutiki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        temel_iconn = findViewById(R.id.temel_icon);
        bulutbir = findViewById(R.id.bulut1);
        bulutiki = findViewById(R.id.bulut2);

        zoomAnim = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        toRight = AnimationUtils.loadAnimation(this, R.anim.lefttoright);

        temel_iconn.setAnimation(toRight);
        bulutbir.setAnimation(toRight);
        bulutiki.setAnimation(toRight);

        temel_iconn.animate().translationX(2500).rotation(100).setDuration(2000).setStartDelay(2000);
        bulutbir.animate().translationXBy(1200).setDuration(1000).setStartDelay(2000);
        bulutiki.animate().translationXBy(1200).setDuration(1000).setStartDelay(2000);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_SCREEN);
    }
}