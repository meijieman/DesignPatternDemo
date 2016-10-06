package com.foo.designpatterndemo.proxy;

import com.foo.designpatterndemo.LogUtil;

/**
 * @desc: 客户端
 * @author: Major
 * @since: 2016/10/7 1:40
 */

public class Main {

    public static void main(String[] args) {

        // 需要找唱歌的，直接找到经纪人
        Agent agent = new Agent(Price.PRICE_SUPER);
        try {
            // 唱歌
            agent.sing();
        } catch (PermissionDeniedException e) {
            e.printStackTrace();
        }

        try {
            // 对话
            LogUtil.print(agent.say());
        } catch (PermissionDeniedException e) {
            e.printStackTrace();
        }

        // 指定歌手
        agent = new Agent(Price.PRICE_VIP, new Singer2());

        try {
            // 唱歌
            agent.sing();
        } catch (PermissionDeniedException e) {
            e.printStackTrace();
        }

        try {
            // 对话
            LogUtil.print(agent.say());
        } catch (PermissionDeniedException e) {
            e.printStackTrace();
        }
    }
}
