package com.example.huarongdao;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static boolean levels[] = {false,false,false,false,false,false};
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final TextView startGame = findViewById(R.id.start_game);
        final Button levelBtn = findViewById(R.id.level_btn);
        final TextView aboutGame = findViewById(R.id.about);
        final Button aboutBtn = findViewById(R.id.about_btn);
        startGame.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        levelBtn.setBackgroundResource(R.drawable.surprise_icon);
                        startGame.setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case MotionEvent.ACTION_UP:
                        levelBtn.setBackgroundResource(R.drawable.back_icon);
                        startGame.setTextColor(getResources().getColor(R.color.colorb));
                        break;
                }
                return false;
            }
        });
        aboutGame.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        aboutBtn.setBackgroundResource(R.drawable.angry);
                        aboutGame.setTextColor(getResources().getColor(R.color.colorGrey));
                        break;
                    case MotionEvent.ACTION_UP:
                        aboutBtn.setBackgroundResource(R.drawable.cry);
                        aboutGame.setTextColor(getResources().getColor(R.color.colorb));
                        break;
                }
                return false;
            }
        });

    }

    public void chooselevel(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, LevelActivity.class);
        startActivity(intent);
    }

    public void chooseabout(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
    /**
     level page 跳转
     */

}
