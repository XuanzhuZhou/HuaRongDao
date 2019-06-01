package com.example.huarongdao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }
    public void exit(View view) {
        finish();
    }

    public void gotolevel1(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this,Level1Activity.class);
        startActivity(intent);
    }

    public void gotolevel2(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this,Level2Activity.class);
        startActivity(intent);
    }

    public void gotolevel3(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this,Level3Activity.class);
        startActivity(intent);
    }

    public void gotolevel4(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this,Level4Activity.class);
        startActivity(intent);
    }
}
