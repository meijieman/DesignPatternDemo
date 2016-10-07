package com.foo.designpatterndemo.factory;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/7 23:31
 */

public class Main {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender mail = factory.produce("mail");
        mail.send("来自 major 的问候");

        SendFactory1 factory1 = new SendFactory1();
        Sender sender = factory1.produceSms();
        sender.send("你好，世界");

        Sender sms = SendFactory2.produceSms();
        sms.send("good night~");

    }
}
