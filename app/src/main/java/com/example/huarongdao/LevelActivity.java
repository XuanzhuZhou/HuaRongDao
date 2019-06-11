package com.example.huarongdao;

import android.annotation.SuppressLint;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class LevelActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        final ImageButton level1 = findViewById(R.id.level1);
        ImageButton level2 = findViewById(R.id.level2);
        ImageButton level3 = findViewById(R.id.level3);
        ImageButton level4 = findViewById(R.id.level4);
        ImageButton level5 = findViewById(R.id.level5);
        ImageButton level6 = findViewById(R.id.level6);
        final TextView levelText1 = findViewById(R.id.level1text);
        TextView levelText2 = findViewById(R.id.level2text);
        TextView levelText3 = findViewById(R.id.level3text);
        TextView levelText4 = findViewById(R.id.level4text);
        TextView levelText5 = findViewById(R.id.level5text);
        TextView levelText6 = findViewById(R.id.level6text);
        setStar(level1, 0, levelText1);
        setStar(level2, 1, levelText2);
        setStar(level3, 2, levelText3);
        setStar(level4, 3, levelText4);
        setStar(level5, 4, levelText5);
        setStar(level6, 5, levelText6);

//        setLevelTextAnimation(levelText1);
//        setLevelTextAnimation(levelText2);
//        setLevelTextAnimation(levelText3);
//        setLevelTextAnimation(levelText4);
//        setLevelTextAnimation(levelText5);
//        setLevelTextAnimation(levelText6);

    }

//    @SuppressLint("ClickableViewAccessibility")
//    private void setLevelTextAnimation(final TextView levelText) {
//        levelText.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        int colorGrey = R.color.colorGrey;
//                        levelText.setTextColor(getResources().getColor(colorGrey));
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        int colorBlack = R.color.colorb;
//                        levelText.setTextColor(getResources().getColor(colorBlack));
//                        break;
//                }
//                return false;
//            }
//        });
//    }


    /**
     * 用来设置关卡的小星星
     *
     * @param levelBtn
     * @param i
     */
    private void setStar(ImageButton levelBtn, int i, TextView levelText) {
        if (MainActivity.levels[i]) {
            levelBtn.setImageResource(android.R.drawable.star_big_on);
        } else {
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
        finish();
    }

    public void gotolevel2(View view) {
        if (MainActivity.levels[1]==true) {
            Intent intent = new Intent();
            intent.setClass(LevelActivity.this, Level2Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过基础关卡噢",Toast.LENGTH_LONG).show();
        }
    }

    public void gotolevel3(View view) {
        if (MainActivity.levels[2]==true) {
            Intent intent = new Intent();
            intent.setClass(LevelActivity.this, Level3Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过基础关卡噢",Toast.LENGTH_LONG).show();
        }
    }

    public void gotolevel4(View view) {
        if (MainActivity.levels[3]==true) {
            Intent intent = new Intent();
            intent.setClass(LevelActivity.this, Level4Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过基础关卡噢",Toast.LENGTH_LONG).show();
        }
    }
    public void gotolevel5(View view) {
        if (MainActivity.levels[4]==true) {
            Intent intent = new Intent();
            intent.setClass(LevelActivity.this, Level5Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过基础关卡噢",Toast.LENGTH_LONG).show();
        }
    }
    public void gotolevel6(View view) {
        if (MainActivity.levels[5]==true) {
            Intent intent = new Intent();
            intent.setClass(LevelActivity.this, Level6Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过基础关卡噢",Toast.LENGTH_LONG).show();
        }
    }
}
