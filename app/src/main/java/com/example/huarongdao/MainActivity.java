package com.example.huarongdao;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static boolean levels[] = {true, true, true, true};

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final TextView startGame = findViewById(R.id.start_game);
        final Button levelBtn = findViewById(R.id.level_btn);
        TextView aboutGame = findViewById(R.id.about);
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
                        startGame.setTextColor(getResources().getColor(R.color.colora));
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
