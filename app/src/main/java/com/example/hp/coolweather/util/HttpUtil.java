package com.example.hp.coolweather.util;

import android.app.DownloadManager;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by hp on 2017/12/4.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
