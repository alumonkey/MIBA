package com.xiaomi.sports.miba;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import view.ViewPagerIndicator;

/**
 * Created by shilu on 2016/7/18.
 */
public class VpSimpleFargment extends Fragment {
    private String myTitle;
    public static final String BUNDLE_TITLE = "title";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle!=null){
            myTitle = bundle.getString(BUNDLE_TITLE);
        }
        TextView tv  = new TextView(getActivity());
        tv.setText(myTitle);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }

    public static VpSimpleFargment newInstance(String title){
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_TITLE,title);
        VpSimpleFargment vpSimpleFargment = new VpSimpleFargment();
        vpSimpleFargment.setArguments(bundle);
        return vpSimpleFargment;

    }
}
