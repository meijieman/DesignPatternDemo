package com.foo.designpatterndemo.proxy;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2016/10/7 2:22
 */

public class PermissionDeniedException extends RuntimeException {

    public PermissionDeniedException(String msg) {
        super(msg);
    }
}
