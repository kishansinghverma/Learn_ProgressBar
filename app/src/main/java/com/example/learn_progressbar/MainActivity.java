package com.example.learn_progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progressBar);

    }

    Boolean isPressed=true;
    public void go(View v)
    {
        if(isPressed) {
            progressBar.setVisibility(View.VISIBLE);
            isPressed=false;
        }
        else {
            progressBar.setVisibility(View.GONE);
            isPressed=true;
        }
    }
}
