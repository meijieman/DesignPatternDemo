package com.foo.designpatterndemo.factory;

import com.foo.designpatterndemo.LogUtil;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/7 23:28
 */

public class SmsSender implements Sender {

    @Override
    public void send(String msg) {
        LogUtil.print("通过 sms 发送：" + msg);
    }
}
