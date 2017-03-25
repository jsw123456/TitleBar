# TitleBar

        titlebar.setTitle("标题"); //设置标题
        titlebar.setTitleColor(Color.WHITE); //设置标题颜色
        titlebar.setTitleSize(15); //设置标题字体大小
        titlebar.setLeftDrawImg(R.mipmap.ic_title_back); //设置左侧图标
        titlebar.setLeftDrawImg(R.mipmap.ic_update_head); //设置右侧图标
        titlebar.setRightMenu("菜单"); //设置右侧菜单文字
        titlebar.setRightTvSize(12);  //设置右侧菜单字体大小
        titlebar.setRightTvColor(Color.GREEN); //设置右侧菜单颜色
        
        //左侧菜单点击事件
        titlebar.setOnTitleBarLeftListener(new TitleBar.TitleBarLeftListener() {
            @Override
            public void leftClick(View v) {
              
            }
        });
        //右侧菜单点击事件
        titlebar.setOnTitleBarRightTvListener(new TitleBar.TitleBarRightTvListener() {
            @Override
            public void rightTvClick(View v) {
               
            }
        });
        //右侧图片点击事件
         titlebar.setOnTitleBarRightImgListener(new TitleBar.TitleBarRightImgListener() {
            @Override
            public void rightImgClick(View v) {
               
            }
        });
        xml中使用
        app:titleText="标题"      //设置标题
        app:titleColor="#fff"   //标题颜色
        app:titleTextSize="15sp"     //标题字体大小
        app:isShowRightTv="true"        //设置右侧文字是否显示，默认隐藏，这里不用请关闭，为了更好的点击这里加了10dp左右的位置
        app:isShowLeftImg="true"        //设置左侧图片是否显示，默认显示，这里不用请关闭，为了更好的点击这里加了10dp左右的位置
        app:isShowRightImg="true"       //设置右侧图片是否显示，默认隐藏 ，这里不用请关闭，为了更好的点击这里加了10dp左右的位置
        app:rightText="www"     //右侧菜单文字
        app:rightColor="#fff"   //右侧菜单文字颜色
        app:rightTextSize="12dp"        //右侧菜单文字
        app:rightDrawImg="@mipmap/ic_update_head"       //设置右侧图片
        app:leftDrawImg="@mipmap/ic_title_back"         //设置左侧图片
