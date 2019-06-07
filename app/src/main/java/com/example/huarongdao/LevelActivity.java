package com.example.huarongdao;

import android.arch.lifecycle.AndroidViewModel;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        ImageButton level1 = findViewById(R.id.level1);
        ImageButton level2 = findViewById(R.id.level2);
        ImageButton level3 = findViewById(R.id.level3);
        ImageButton level4 = findViewById(R.id.level4);

        setStar(level1,0);
        setStar(level2,1);
        setStar(level3,2);
        setStar(level4,3);
    }

    /**
     * 用来设置关卡的小星星
     * @param levelBtn
     * @param i
     */
    private void setStar(ImageButton levelBtn,int i) {
        if(MainActivity.levels[i]){
            levelBtn.setImageResource(android.R.drawable.star_big_on);
        }
        else{
            levelBtn.setImageResource(android.R.drawable.star_big_off);
        }
    }

    public void exit(View view) {
        finish();
    }

    public void gotolevel1(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level1Activity.class);
        startActivity(intent);
    }

    public void gotolevel2(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level2Activity.class);
        startActivity(intent);
    }

    public void gotolevel3(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level3Activity.class);
        startActivity(intent);
    }

    public void gotolevel4(View view) {
        Intent intent = new Intent();
        intent.setClass(LevelActivity.this, Level4Activity.class);
        startActivity(intent);
    }
}
