package com.example.tanxin.titlebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void defaults(View v){
        startActivity(new Intent(this,DefaultsActivity.class));

    }

    public void rightImg(View v){
        startActivity(new Intent(this,RightImgActivity.class));
    }

    public void rightTv(View v){
        startActivity(new Intent(this,RightTvActivity.class));
    }
}
