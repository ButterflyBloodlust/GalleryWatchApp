package com.hal9000.galerywatchapp;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PageFragment extends Fragment {

    private int resourceID;
    private static final String IMAGE_SOURCE_KEY = "image_source";

    public static PageFragment getInstance(int resourceID) {
        PageFragment f = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(IMAGE_SOURCE_KEY, resourceID);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resourceID = getArguments().getInt(IMAGE_SOURCE_KEY);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setImageResource(resourceID);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}