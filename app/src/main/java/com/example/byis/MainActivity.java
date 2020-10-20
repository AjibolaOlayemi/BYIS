package com.example.byis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        new Handler().postDelayed(() -> {
//            startActivity(new Intent(this, OptionsPage.class));
//            finish();
//        }, 3000);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, OptionsPage.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
                overridePendingTransition(R.transition.fade_in, R.transition.fade_out);
            }
        }, 5000);

    }
}