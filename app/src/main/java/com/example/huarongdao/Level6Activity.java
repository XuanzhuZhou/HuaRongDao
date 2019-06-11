package com.example.huarongdao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level6Activity extends AppCompatActivity {
    private Klotski mKlotskiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level6);
        List<Block> blocks = KlotskiMapParser.parse("1,0,0,8,1,0,1,3,0,2,0,1,10,1,1,3,3,1,1,0,3,6,1,3,1,3,3,7,1,4");
        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setlevel(1);
        mKlotskiView.setBlocks(blocks);

    }

    public void back(View view) {
        Intent intent = new Intent();
        intent.setClass(Level6Activity.this, LevelActivity.class);
        startActivity(intent);
        finish();
    }

    public void next(View view) {
        Toast.makeText(getApplicationContext(),"没有新的啦！",Toast.LENGTH_LONG).show();
    }
}
