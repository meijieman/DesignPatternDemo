package com.foo.designpatterndemo.proxy;

import com.foo.designpatterndemo.LogUtil;

/**
 * @desc: 歌手1
 * @author: Major
 * @since: 2016/10/7 1:54
 */

public class Singer1 implements Protocol {


    @Override
    public void sing() {
        LogUtil.print("singer1 唱歌中~~~");
    }

    @Override
    public String say() {
        return "singer1 谢谢大家";
    }
}
