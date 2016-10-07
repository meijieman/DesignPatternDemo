package com.foo.designpatterndemo.abstractfactory;

/**
 * @desc: 抽象工厂方法模式
 * 当需要增加新的发送消息的功能时，创建两个类，一个实现 Sender 接口，一个实现 Provider 接口。即不需要修改原有的代码，便可完成任务。
 * @author: Major
 * @since: 2016/10/7 23:31
 */

public class Main {

    public static void main(String[] args) {

        Provider provider = new SendMailFactory();
        Sender produce = provider.produce();
        produce.send("hello");

    }
}
