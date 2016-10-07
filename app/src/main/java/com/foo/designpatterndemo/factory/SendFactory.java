package com.foo.designpatterndemo.factory;

import com.foo.designpatterndemo.LogUtil;

/**
 * @desc: 普通工厂方法模式
 * @author: Major
 * @since: 2016/10/7 23:28
 */

public class SendFactory {

    /** 根据 type 的输入生成对应的发送器 */
    public Sender produce(String type) {
        if ("mail".equalsIgnoreCase(type)) {
            return new MailSender();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SmsSender();
        } else {
            LogUtil.print("请输入正确的类型");
            return null;
        }
    }
}
