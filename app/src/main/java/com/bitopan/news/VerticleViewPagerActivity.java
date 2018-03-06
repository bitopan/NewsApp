package com.bitopan.news;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Bitopan on 06-03-2018.
 */

public class VerticleViewPagerActivity extends AppCompatActivity {

    VerticalViewPager verticalViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        verticalViewPager = (VerticalViewPager) findViewById(R.id.verticleViewPager);
        verticalViewPager.setAdapter(new VerticlePagerAdapter(this));
    }
}