package com.example.tanxin.titlebar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class RightTvActivity extends AppCompatActivity {
    TitleBar titlebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_tv);
        titlebar = (TitleBar) findViewById(R.id.titlebar);
        titlebar.setOnTitleBarLeftListener(new TitleBar.TitleBarLeftListener() {
            @Override
            public void leftClick(View v) {
                finish();
            }
        });
        titlebar.setRightMenu("菜单");
        titlebar.setRightTvSize(12);
        titlebar.setRightTvColor(Color.GREEN);
        titlebar.setOnTitleBarRightTvListener(new TitleBar.TitleBarRightTvListener() {
            @Override
            public void rightTvClick(View v) {
                Toast.makeText(RightTvActivity.this, "菜单", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
