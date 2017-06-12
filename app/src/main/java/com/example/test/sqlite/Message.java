package com.example.test.sqlite;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by test on 11-06-2017.
 */

public class Message {
    public static void  message(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
