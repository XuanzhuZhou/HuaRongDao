package com.example.huarongdao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level2Activity extends AppCompatActivity {
    private Klotski mKlotskiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        List<Block> blocks = KlotskiMapParser.parse("2,0,0,10,1,0,1,3,0,1,3,1,6,0,2,1,2,2,1,3,2,3,0,3,7,1,3,4,3,3");
        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setlevel(2);
        mKlotskiView.setBlocks(blocks);
    }

    public void back(View view) {
        Intent intent = new Intent();
        intent.setClass(Level2Activity.this, LevelActivity.class);
        startActivity(intent);
        finish();
    }

    public void next(View view) {
        if (MainActivity.levels[1]==true) {
            Intent intent = new Intent();
            intent.setClass(Level2Activity.this, Level3Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过这一关噢",Toast.LENGTH_LONG).show();
        }
    }
}
