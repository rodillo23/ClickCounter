package com.rodolfo.android.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int count){
        TextView tvCounter = (TextView) findViewById(R.id.counter);
        tvCounter.setText("" + count);
    }

    public void clickCounter(View view){
        counter += 1;
        display(counter);
    }

    public void reset(View view){
        counter = 0;
        display(counter);
    }
}
