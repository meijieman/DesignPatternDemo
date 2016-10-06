package com.foo.designpatterndemo;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/7 1:54
 */

public class LogUtil {

    private static final String TAG = "LogUtil";

    public static void print(String msg) {
        System.out.println(TAG + ": " + msg);
    }
}
