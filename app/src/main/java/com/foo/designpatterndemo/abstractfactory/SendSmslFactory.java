package com.foo.designpatterndemo.abstractfactory;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/7 23:45
 */

public class SendSmslFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
