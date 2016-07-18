package com.xiaomi.sports.miba;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import view.ViewPagerIndicator;

public class MainActivity extends FragmentActivity {

    private ViewPager mViewPager;
    private ViewPagerIndicator mIndicator;

    private List<String> mTitle = Arrays.asList("赛程","排行","数据");

    private List<VpSimpleFargment> mContent = new ArrayList<VpSimpleFargment>();

    private FragmentPagerAdapter fragmentPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDatas();
        mViewPager.setAdapter(fragmentPagerAdapter);
    }

    private void initView(){
        mViewPager = (ViewPager)findViewById(R.id.id_viewpager);
        mIndicator =(ViewPagerIndicator) findViewById(R.id.id_indicator);
    }

    private void initDatas(){
     for(String titil:mTitle){
       VpSimpleFargment vp= VpSimpleFargment.newInstance(titil);
        mContent.add(vp);
     }
        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mContent.get(position);
            }

            @Override
            public int getCount() {
                return mContent.size();
            }
        };

    }
}
