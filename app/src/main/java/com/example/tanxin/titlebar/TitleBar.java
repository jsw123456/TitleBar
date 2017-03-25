package com.example.tanxin.titlebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * TitleBar
 * @auther TanXin
 * @email meet_tanxin@outlook.com
 * created at 2017/3/25 16:04
 * */

public class TitleBar extends RelativeLayout {
    private TextView tv_title;//标题栏控件
    private String title;   //标题文字
    private int titleColor; //标题颜色，默认白色
    private float titleTextSize;//标题文字大小，默认15sp

    private ImageView img_left;//左侧图片控件
    private Drawable leftDrawImg; //左侧图片
    private boolean isShowLeftImg; //是否显示左侧图标

    private TextView tv_right;//右侧文字控件
    private String rightmenu;//右侧菜单文字,默认12sp
    private int rightColor; //右侧菜单文字颜色,默认白色
    private float rightTextSize; //右侧文字大小
    private boolean isShowRightText; //是否显示右侧文字菜单

    private ImageView img_right;//左侧图片空间
    private Drawable rightDrawImg; //左侧图片
    private boolean isShowRightImg; //是否显示左侧图标

    public TitleBarLeftListener leftlistener;//左侧图片监听
    public TitleBarRightTvListener rightTvlistener;//右侧文字监听
    public TitleBarRightImgListener rightImglistener;//右侧图片监听

    private LayoutParams titleParams; //标题文本布局参数
    private LayoutParams leftParams; //左侧按钮布局参数
    private LayoutParams rightParams; //左侧按钮布局参数
    public TitleBar(Context context) {
        super(context);
    }

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TitleBar);
        initTitle(context,typedArray);
    }

    private void initTitle(Context context, TypedArray typedArray) {
        title = typedArray.getString(R.styleable.TitleBar_titleText);
        titleColor  = typedArray.getColor(R.styleable.TitleBar_titleColor, Color.WHITE);
        titleTextSize = typedArray.getDimensionPixelSize(R.styleable.TitleBar_titleTextSize,15);

        leftDrawImg = typedArray.getDrawable(R.styleable.TitleBar_leftDrawImg);
        isShowLeftImg = typedArray.getBoolean(R.styleable.TitleBar_isShowLeftImg,true);

        rightmenu = typedArray.getString(R.styleable.TitleBar_rightText);
        rightColor = typedArray.getColor(R.styleable.TitleBar_rightColor,Color.WHITE);
        rightTextSize = typedArray.getDimensionPixelSize(R.styleable.TitleBar_rightTextSize,12);
        isShowRightText = typedArray.getBoolean(R.styleable.TitleBar_isShowRightTv,false);

        rightDrawImg = typedArray.getDrawable(R.styleable.TitleBar_rightDrawImg);
        isShowRightImg = typedArray.getBoolean(R.styleable.TitleBar_isShowRightImg,false);

        typedArray.recycle();

        tv_title = new TextView(context);
        img_left = new ImageView(context);
        img_right = new ImageView(context);
        tv_right = new TextView(context);

        tv_title.setText(title);
        tv_title.setTextColor(titleColor);
        tv_title.setTextSize(titleTextSize);

        titleParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        titleParams.addRule(CENTER_IN_PARENT);
        addView(tv_title, titleParams);

        if (isShowLeftImg){
            img_left.setImageDrawable(leftDrawImg);
            img_left.setPadding(20 ,10,30,10);
            leftParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            leftParams.addRule(ALIGN_PARENT_LEFT,TRUE);
            leftParams.addRule(CENTER_VERTICAL);
            addView(img_left, leftParams);
            img_left.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    leftlistener.leftClick(v);
                }
            });
        }

        rightParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rightParams.addRule(ALIGN_PARENT_RIGHT,TRUE);
        rightParams.addRule(CENTER_VERTICAL);
        if (isShowRightText){
            tv_right.setText(rightmenu);
            tv_right.setTextColor(rightColor);
            tv_right.setTextSize(rightTextSize);
            tv_right.setPadding(30 ,10,20,10);
            addView(tv_right, rightParams);
            tv_right.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    rightTvlistener.rightTvClick(v);
                }
            });
        }

        if (isShowRightImg){
            img_right.setImageDrawable(rightDrawImg);
            img_right.setPadding(30 ,10,30,10);
            addView(img_right, rightParams);
            img_right.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    rightImglistener.rightImgClick(v);
                }
            });
        }

    }
    /**
     * 设置标题
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 16:06
     * */
    public void setTitle(String title){
        tv_title.setText(title);
    }
    /**
     * 设置标题颜色
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 16:33
     * */
    public void setTitleColor(int resid){
        tv_title.setTextColor(resid);
    }
    /**
     * 设置标题字体大小
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 16:34
     * */
    public void setTitleSize(float size){
        tv_title.setTextSize(size);
    }
    /**
     * 设置左侧图片
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 16:31
     * */
    public void setLeftDrawImg(int resid){
        img_left.setImageResource(resid);
    }
    /**
     * 设置菜单
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 16:07
     * */
    public void setRightMenu(String menu){
        tv_right.setText(menu);
    }
    /**
     * 右侧菜单字体大小
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 17:26
     * */
    public void setRightTvSize(float size){
        tv_right.setTextSize(size);
    }
    /**
     * 右侧菜单字体颜色
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 17:26
     * */
    public void setRightTvColor(int resid){
        tv_right.setTextColor(resid);
    }

    /**
     * 设置左侧图片
     * @auther TanXin
     * @email meet_tanxin@outlook.com
     * created at 2017/3/25 16:31
     * */
    public void setRightDrawImg(int resid){
        img_right.setImageResource(resid);
    }

    public interface TitleBarLeftListener{
        void leftClick(View v);   //左侧按钮点击事件
    }
    public interface TitleBarRightTvListener{
        void rightTvClick(View v);   //左侧按钮点击事件
    }
    public interface TitleBarRightImgListener{
        void rightImgClick(View v);   //左侧按钮点击事件
    }
    public void setOnTitleBarLeftListener(TitleBarLeftListener listener){
        this.leftlistener = listener;
    }
    public void setOnTitleBarRightTvListener(TitleBarRightTvListener listener){
        this.rightTvlistener = listener;
    }
    public void setOnTitleBarRightImgListener(TitleBarRightImgListener listener){
        this.rightImglistener = listener;
    }
}
