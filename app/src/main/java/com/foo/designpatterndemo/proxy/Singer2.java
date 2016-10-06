package com.foo.designpatterndemo.proxy;

import com.foo.designpatterndemo.LogUtil;

/**
 * @desc: 歌手2
 * @author: Major
 * @since: 2016/10/7 1:54
 */

public class Singer2 implements Protocol {


    @Override
    public void sing() {
        LogUtil.print("singer2 唱歌中~~~");
    }

    @Override
    public String say() {
        return "singer2 谢谢大家";
    }
}
