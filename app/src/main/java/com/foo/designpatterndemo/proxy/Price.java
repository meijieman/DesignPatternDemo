package com.foo.designpatterndemo.proxy;

/**
 * @desc: 权限管理。根据不同价位，提供不同歌手
 * @author: Major
 * @since: 2016/10/7 2:12
 */

public class Price {

    public static final int PRICE_COMMON = 1; // 一般
    public static final int PRICE_SUPER  = 2; // 高级
    public static final int PRICE_VIP    = 3; // vip


    private static int mPrice = PRICE_COMMON;

    public static void setPrice(int price) {
        mPrice = price;
    }

    public static boolean hasPermissionSing() {
        return mPrice == PRICE_SUPER || mPrice == PRICE_VIP;
    }

    public static boolean hasPermissionSay() {
        return mPrice == PRICE_VIP;
    }

    public static String getPermission() {
        String p = "";
        switch (mPrice) {
            case PRICE_COMMON:
                p = "一般";
                break;
            case PRICE_SUPER:
                p = "高级";
                break;
            case PRICE_VIP:
                p = "vip";
                break;
        }
        return p;
    }
}
