package com.example.huarongdao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level3Activity extends AppCompatActivity {
    private Klotski mKlotskiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        List<Block> blocks = KlotskiMapParser.parse("2,0,0,10,1,0,3,3,0,1,0,2,6,1,2,1,3,2,1,0,3,7,1,3,1,3,3,8,1,4");
        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setlevel(3);
        mKlotskiView.setBlocks(blocks);
    }
    public void back(View view) {
        Intent intent = new Intent();
        intent.setClass(Level3Activity.this, LevelActivity.class);
        startActivity(intent);
        finish();
    }
    public void next(View view) {
        if (MainActivity.levels[2]==true) {
            Intent intent = new Intent();
            intent.setClass(Level3Activity.this, Level4Activity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(),"得先通过这一关噢",Toast.LENGTH_LONG).show();
        }
    }
}
