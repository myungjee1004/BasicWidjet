package com.example.basicwidjet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // inflation
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

        //int focusable = findViewById(R.id.tv_hello).getFocusable();
        //System.out.println("=========>" + focusable);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button: {
                findViewById(R.id.tv_hello).setVisibility(View.INVISIBLE);
                break;
            }
            case R.id.button2: {
                findViewById(R.id.tv_hello).setVisibility(View.GONE);
                break;
            }
            case R.id.button3: {
                findViewById(R.id.tv_hello).setVisibility(View.VISIBLE);
                break;
            }
            default:{
                Log.w("MainActivity", "Unknown View Clicked");
            }
        }
    }
}
