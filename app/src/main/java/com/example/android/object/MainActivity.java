package com.example.android.object;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("next try !!!");
        setContentView(textView);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(66);


    }
}
