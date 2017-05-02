package com.example.nasryn_kingman.eazegraph;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class BarChartFragment extends Fragment
{
    private BarChart mBarChart;


    public BarChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bar_chart, container, false);
        mBarChart = (BarChart) view.findViewById(R.id.barchart);

        initData();

        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        mBarChart.startAnimation();
    }

    private void initData()
    {
        mBarChart.addBar(new BarModel("2013", 89.4f, 0xffFFFF00));
        mBarChart.addBar(new BarModel("2014", 53.0f, 0xff99FF33));
        mBarChart.addBar(new BarModel("2015", 100, 0xff9900CC));
        mBarChart.addBar(new BarModel("2016", 42.9f, 0xff00FFCC));
        mBarChart.addBar(new BarModel("2017", 113.8f, 0xffFF6347));
    }

}
