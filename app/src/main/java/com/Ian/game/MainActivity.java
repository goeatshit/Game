package com.Ian.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private GameView gameview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Arrow_up).setOnClickListener(this);
        findViewById(R.id.Arrow_down).setOnClickListener(this);
        findViewById(R.id.Arrow_left).setOnClickListener(this);
        findViewById(R.id.Arrow_right).setOnClickListener(this);
        gameview = findViewById(R.id.game);


    }
    @Override
    public void onClick(View v) {


        switch(v.getId()){
            case R.id.Arrow_up:
                Log.d(TAG, "OnClick: UP");
                gameview.MoveUp();
                break;
            case R.id.Arrow_down:
                Log.d(TAG, "OnClick: DOWN");
                gameview.MoveDown();
                break;
            case R.id.Arrow_left:
                Log.d(TAG, "OnClick: LEFT");
                gameview.MoveLeft();
                break;
            case R.id.Arrow_right:
                Log.d(TAG, "OnClick: RIGHT");
                gameview.MoveRight();
                break;
    }
}
}





