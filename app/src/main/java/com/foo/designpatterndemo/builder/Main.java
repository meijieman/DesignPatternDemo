package com.foo.designpatterndemo.builder;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/8 0:10
 */

public class Main {

    public static void main(String[] args) {

        new MailSender.Builder()
                .create()
                .send("发送消息了");
    }
}
