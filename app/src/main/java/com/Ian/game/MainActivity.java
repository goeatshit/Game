package com.Ian.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Arrow_left).setOnClickListener(this);
        findViewById(R.id.Arrow_down).setOnClickListener(this);
        findViewById(R.id.Arrow_left).setOnClickListener(this);
        findViewById(R.id.Arrow_right).setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        switch(v.getId()){
            case R.id.Arrow_up:
                Log.d(TAG, "OnClick: UP");
                break;
            case R.id.Arrow_down:
                Log.d(TAG, "OnClick: DOWN");
                break;
            case R.id.Arrow_left:
                Log.d(TAG, "OnClick: LEFT");
                break;
            case R.id.Arrow_right:
                Log.d(TAG, "OnClick: RIGHT");
                break;
    }
}
}





