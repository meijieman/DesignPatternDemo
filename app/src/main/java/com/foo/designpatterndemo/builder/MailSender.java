package com.foo.designpatterndemo.builder;

import com.foo.designpatterndemo.LogUtil;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/7 23:26
 */

public class MailSender implements Sender {

    private MailSender() {

    }

    @Override
    public void send(String msg) {
        LogUtil.print("通过 mail 发送：" + msg);
    }

    private static MailSender sMailSender;

    public static class Builder {


        public Builder(){
            sMailSender = new MailSender();
        }

        public void send(String msg) {
            if (sMailSender != null) {
                sMailSender.send(msg);
            }
        }

        public MailSender create() {
            return sMailSender;
        }
    }
}
