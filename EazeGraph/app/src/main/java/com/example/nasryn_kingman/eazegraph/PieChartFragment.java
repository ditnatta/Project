package com.example.nasryn_kingman.eazegraph;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.communication.IOnItemFocusChangedListener;
import org.eazegraph.lib.models.PieModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class PieChartFragment extends Fragment {
    private PieChart mPieChart;


    public PieChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_pie_chart, container, false);
        View view = inflater.inflate(R.layout.fragment_pie_chart, container, false);
        mPieChart = (PieChart) view.findViewById(R.id.piechart);
        initData();

        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        mPieChart.startAnimation();
    }

    private void initData()
    {
        mPieChart.addPieSlice(new PieModel("Twitter", 17.9f,
                Color.parseColor("#66FFFF")));
        mPieChart.addPieSlice(new PieModel("Facebook", 56.5f,
                Color.parseColor("#003399")));
        mPieChart.addPieSlice(new PieModel("Pinterest", 11.4f,
                Color.parseColor("#DEB887")));
        mPieChart.addPieSlice(new PieModel("Instagram", 13.5f,
                Color.parseColor("#66FF33")));
        mPieChart.addPieSlice(new PieModel("Snapchat", 0.7f,
                Color.parseColor("#BEBEBE")));

        mPieChart.setOnItemFocusChangedListener(new IOnItemFocusChangedListener() {
            @Override
            public void onItemFocusChanged(int position) {
                // TODO: To do what you want.
            }
        });
    }

}
