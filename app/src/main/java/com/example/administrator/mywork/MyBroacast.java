package com.example.administrator.mywork;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/13.
 */
public class MyBroacast extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent){

        Toast.makeText(context,"shoudao:"+ intent.getStringExtra("aa"),Toast.LENGTH_LONG).show();

    }
}
