package com.mryan.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * @exclude aa
 * 测试方法
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @SuppressLint("HandlerLeak")
    private int index = 0;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            index++;
            Log.e(TAG, "handleMessage: index =" + index + "/" + System.currentTimeMillis());
            handler.sendEmptyMessageDelayed(1000, 1000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.sendEmptyMessage(1000);
    }


    /**
     * 张三
     *
     * @param homne 我家
     * @internal a
     */
    public void test(String homne) {
        Log.e(TAG, "test: ");
    }

    /**
     * 李四
     *
     * @param check 准备
     * @hide
     */
    public void go(String check) {
        Log.e(TAG, "go: ");
    }

    public void into(String check) {
        Log.e(TAG, "go: ");
    }

    public void home(String check) {
        Log.e(TAG, "go: ");
    }
}