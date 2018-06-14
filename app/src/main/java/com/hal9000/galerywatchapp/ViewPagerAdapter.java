package com.hal9000.galerywatchapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Integer> imageResourceIDs;

    public ViewPagerAdapter(FragmentManager fm, List<Integer> imagesList) {
        super(fm);
        this.imageResourceIDs = imagesList;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.getInstance(imageResourceIDs.get(position));
    }

    @Override
    public int getCount() {
        return imageResourceIDs.size();
    }
}