package com.example.zhuangnews;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author AZhung
 * @date 2020/1/20
 * @description
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化ARouter
        initARouter();
    }



    private void initARouter() {
        // 必须在初始化ARouter之前配置
        if (BuildConfig.DEBUG){
            // 日志开启
            ARouter.openLog();
            // 调试模式开启，如果在install run模式下运行，则必须开启调试模式
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
