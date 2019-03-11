package com.vily.testjpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2019/3/8
 *  
 **/
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
