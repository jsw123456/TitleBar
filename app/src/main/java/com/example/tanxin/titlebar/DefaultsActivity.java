package com.example.tanxin.titlebar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class DefaultsActivity extends AppCompatActivity {
    TitleBar titlebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defaults);
        titlebar = (TitleBar) findViewById(R.id.titlebar);
        titlebar.setTitle("标题");
        titlebar.setTitleColor(Color.WHITE);
        titlebar.setTitleSize(15);
        titlebar.setLeftDrawImg(R.mipmap.ic_title_back);
        titlebar.setOnTitleBarLeftListener(new TitleBar.TitleBarLeftListener() {
            @Override
            public void leftClick(View v) {
                finish();
            }
        });
    }
}
