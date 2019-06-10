package com.example.huarongdao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level1Activity extends AppCompatActivity {
    private Klotski mKlotskiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        List<Block> blocks = KlotskiMapParser.parse("2,0,0,10,1,0,3,3,0,4,0,2,6,1,2,5,3,2,1,1,3,1,2,3,1,0,4,1,3,4");
        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setlevel(1);
        mKlotskiView.setBlocks(blocks);

    }

    public void back(View view) {
        Intent intent = new Intent();
        intent.setClass(Level1Activity.this, LevelActivity.class);
        startActivity(intent);
        finish();
    }

    public void next(View view) {
        if (MainActivity.levels[0]==true) {
            Intent intent = new Intent();
            intent.setClass(Level1Activity.this, Level2Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过这一关噢",Toast.LENGTH_LONG).show();
        }
    }
}
