package edu.cs4730.servicedemo;

import android.util.Log;

public class PLog {
    private static final String app_name = "serviceDemo";
    public static void d(String TAG, String functionName,String msg){
        Log.d(app_name,TAG+"."+functionName + "-"+msg);
    }
    public static void e(String TAG, String functionName,String msg){
        Log.e(app_name,TAG+"."+functionName + "-"+msg);
    }
    public static void i(String TAG, String functionName,String msg){
        Log.i(app_name,TAG+"."+functionName + "-"+msg);
    }
}
