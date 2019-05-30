package com.example.huarongdao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class level1 extends AppCompatActivity {
    private Klotski mKlotskiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        List<Block> blocks = KlotskiMapParser.parse("2,0,0,4,1,0,2,3,0,2,0,2,3,1,2,2,3,2,1,1,3,1,2,3,1,0,4,1,3,4");

        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setBlocks(blocks);
    }
}
