package com.personal.aninterface;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by shensky on 2018/3/29.
 */

public class Listener_Test {
    interface_Listener listener;
    Timer timer;
    public void setListener(interface_Listener listener) {
        this.listener = listener;
    }

    int i = 0;
    public void start() {
        if (timer == null) {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    listener.Receive(String.format("收到数字%s",i));
                    i++;
                }
            }, 0, 1000);
        }
    }

    public void end() {
        if (timer != null) {
            timer.cancel();
            timer = null;
            i = 0;
        }
    }
}
