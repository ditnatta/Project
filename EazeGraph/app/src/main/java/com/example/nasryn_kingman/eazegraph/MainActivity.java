package com.example.nasryn_kingman.eazegraph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBar;
    Button btnAChart;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBar = (Button) findViewById(R.id.view1);
        btnAChart = (Button) findViewById(R.id.btn2);

        btnBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EazeGraphActivity.class);
                startActivity(i);
            }
        });

        btnAChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), AChart.class);
                startActivity(k);
            }
        });


    }
}
