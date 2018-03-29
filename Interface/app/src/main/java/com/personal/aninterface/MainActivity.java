package com.personal.aninterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements interface_Listener{

    Listener_Test test_class = new Listener_Test();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test_class.setListener(this);
    }

    public void one(View view){
        String string = interface_Api.shared().hey();
        Log.i("interface-1",string);
    }

    public void two(View view){
        test_class.start();
    }

    public void three(View view){
        test_class.end();
    }

    @Override
    public void Receive(String message) {
        Log.i("interface-2",message);
    }
}
