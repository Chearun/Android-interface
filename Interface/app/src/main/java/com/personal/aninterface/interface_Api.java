package com.personal.aninterface;

/**
 * Created by shensky on 2018/3/28.
 */

public interface interface_Api {

    static interface_Api shared() {
        return interface_Api_Implementation.getInstance();
    };

    String hey();
}
