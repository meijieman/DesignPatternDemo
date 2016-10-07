package com.foo.designpatterndemo.factory;

/**
 * @desc: 多个工厂方法模式
 * @author: Major
 * @since: 2016/10/7 23:35
 */

public class SendFactory1 {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
