# TitleBar

        titlebar.setTitle("标题"); //设置标题
        titlebar.setTitleColor(Color.WHITE); //设置标题颜色
        titlebar.setTitleSize(15); //设置标题字体大小
        titlebar.setLeftDrawImg(R.mipmap.ic_title_back); //设置左侧图标
        
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
