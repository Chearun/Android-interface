package com.personal.aninterface;

/**
 * Created by shensky on 2018/3/28.
 */

public class interface_Api_Implementation implements interface_Api {
    private static final interface_Api_Implementation ourInstance = new interface_Api_Implementation();

    public static interface_Api_Implementation getInstance() {
        return ourInstance;
    }

    private interface_Api_Implementation() {
    }

    @Override
    public String hey() {
        return "Hello";
    }
}
