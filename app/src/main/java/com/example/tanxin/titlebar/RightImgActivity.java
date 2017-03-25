package com.example.tanxin.titlebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RightImgActivity extends AppCompatActivity {
    TitleBar titlebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_img);
        titlebar = (TitleBar) findViewById(R.id.titlebar);
        titlebar.setOnTitleBarLeftListener(new TitleBar.TitleBarLeftListener() {
            @Override
            public void leftClick(View v) {
                finish();
            }
        });
        titlebar.setOnTitleBarRightImgListener(new TitleBar.TitleBarRightImgListener() {
            @Override
            public void rightImgClick(View v) {
                Toast.makeText(RightImgActivity.this, "菜单", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
