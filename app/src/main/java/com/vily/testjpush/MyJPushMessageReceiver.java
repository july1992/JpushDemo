package com.vily.testjpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2019/3/8
 *  
 **/
public class MyJPushMessageReceiver extends BroadcastReceiver {

    private static final String TAG = "MyJPushMessageReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "onReceive: -----------");
    }
}
