package com.example.lifecycleexample;

import android.app.Activity;
import android.os.Bundle;

// SubActivity - 반투명 액티비티
public class SubActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
}