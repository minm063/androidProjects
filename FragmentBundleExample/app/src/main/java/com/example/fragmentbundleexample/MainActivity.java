package com.example.fragmentbundleexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment1 fragment1 = new Fragment1();
        transaction.replace(R.id.frameLayout, fragment1); // 교체할 화면에 대한 영역, 교체할 화면에 넣을 것
        transaction.commit(); // 저장
    }
}