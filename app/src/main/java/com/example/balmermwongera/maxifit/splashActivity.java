package com.example.balmermwongera.maxifit;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class splashActivity extends MainActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int SPLASH_DISPLAY_LENGHT = 5000;
        
        new Handler().postDelayed(new Runnable() {
            @SuppressWarnings("deprecation")
            @Override
            public void run() {
                Intent mainIntent = new Intent(splashActivity.this,MainActivity.class);
                splashActivity.this.startActivity(mainIntent);
                splashActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGHT);


    }
}
