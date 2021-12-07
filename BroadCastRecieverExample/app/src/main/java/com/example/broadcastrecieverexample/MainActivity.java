package com.example.broadcastrecieverexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.Network;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView tv_state;
    private NetworkReciever reciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_state = (TextView) findViewById(R.id.tv_state);

        // MainActivity에 BroadcastReciever 등록
        // 명시적 Intent <> 묵시적 IntentFilter
        IntentFilter filter = new IntentFilter();
        reciever = new NetworkReciever();
        filter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
        // reciever 등록
        registerReceiver(reciever, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // BroadcastReciever 해제
        unregisterReceiver(reciever);
    }
}