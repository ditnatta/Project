package com.example.nasryn_kingman.eazegraph;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class EazeGraphActivity extends AppCompatActivity
{
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eaze_graph);

        mViewPager = (ViewPager) findViewById(R.id.pager);

        PagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
    }
    public class  MyPagerAdapter extends FragmentStatePagerAdapter {

        private final int NUM_OF_PAGE = 3;

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment;
            switch (i) {
                case 0:
                    fragment = new PieChartFragment();
                    break;
                case 1:
                    fragment = new BarChartFragment();
                    break;
                case 2:
                    fragment = new LineChartFragment();
                    break;
                default:
                    fragment = new PieChartFragment();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return NUM_OF_PAGE;
        }
    }
}
