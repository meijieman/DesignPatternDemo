package com.foo.designpatterndemo.proxy;

/**
 * @desc: 经纪人
 * @author: Major
 * @since: 2016/10/7 1:58
 */

public class Agent implements Protocol {

    private Protocol mReal; // 真实对象，默认为 singer1

    public Agent(int price) {
        Price.setPrice(price);
        mReal = new Singer1();
    }

    public Agent(int price, Protocol real) {
        Price.setPrice(price);
        mReal = real;
    }

    @Override
    public void sing() {
        if (Price.hasPermissionSing()) {
            mReal.sing();
        } else {
            throw new PermissionDeniedException("权限不足，不能唱歌 当前权限：" + Price.getPermission());
        }
    }

    @Override
    public String say() {
        if (Price.hasPermissionSay()) {
            return mReal.say();
        } else {
            throw new PermissionDeniedException("权限不足， 不能对话 当前权限：" + Price.getPermission());
        }
    }
}
