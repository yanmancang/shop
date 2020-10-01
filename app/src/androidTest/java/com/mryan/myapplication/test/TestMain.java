package com.mryan.myapplication.test;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.mryan.myapplication.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class TestMain {
    @Test
    public void test() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.test("ssssssssssss");
    }

    @Test
    @com.mryan.myapplication.MyAnnotation
    public void home() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.home("root");
    }

    @Test
    @LargeTest
    @com.mryan.myapplication.MyAnnotation
    public void go() {
        MainActivity mainActivity = new MainActivity();
        mainActivity.go("back");
    }
}
