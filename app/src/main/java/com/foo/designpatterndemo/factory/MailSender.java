package com.foo.designpatterndemo.factory;

import com.foo.designpatterndemo.LogUtil;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/7 23:26
 */

public class MailSender implements Sender {

    @Override
    public void send(String msg) {
        LogUtil.print("通过 mail 发送：" + msg);
    }
}
