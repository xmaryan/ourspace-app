package com.example.ourspace;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // THIS loads your splash layout with the logo
        setContentView(R.layout.activity_splash);
        ImageView logo= findViewById(R.id.logoImageView);
        logo.post(new Runnable() {
            @Override
                    public void run(){
                    AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
                    fadeIn.setDuration(1000);
                    fadeIn.setFillAfter(true);
                    logo.startAnimation(fadeIn);
                    }
                });



        // Wait for 3 seconds then go to MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish(); // prevents going back to splash
            }
        }, 3000);
    }
}

