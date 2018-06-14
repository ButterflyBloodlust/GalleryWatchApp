package com.hal9000.galerywatchapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.wearable.activity.WearableActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends WearableActivity {

    private List<Integer> imageResourceIDs;
    private final static int[] resourceIDs = new int[]{R.drawable.pic_1, R.drawable.pic_2, R.drawable.pic_3,
            R.drawable.pic_4, R.drawable.pic_5, R.drawable.pic_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageResourceIDs = new ArrayList<>();
        setImagesData();

        ViewPager viewPager = findViewById(R.id.pic_gallery_viewpager);
        ViewPagerAdapter adapterViewPager = new ViewPagerAdapter(getFragmentManager(), imageResourceIDs);
        viewPager.setAdapter(adapterViewPager);

        // Enables Always-on
        setAmbientEnabled();
    }

    private void setImagesData() {
        for (int resourceID : resourceIDs) {
            imageResourceIDs.add(resourceID);
        }
    }
}
