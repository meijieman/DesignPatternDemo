package com.foo.designpatterndemo.factory;

/**
 * @desc: 静态工厂方法模式
 * @author: Major
 * @since: 2016/10/7 23:35
 */

public class SendFactory2 {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
