package com.example.lifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 액티비티 또는 프래그먼트가 생성 되었을 때 onCreate 내부 구문 실행
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate", "ENTER");

        findViewById(R.id.btn_move).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // main -> sub
                startActivity(new Intent(MainActivity.this, SubActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        // 중지된 액티비티가 다시 재실행되는 시점에서 onResume 내부 구문 실행
        super.onResume();
        Log.e("onResume", "ENTER");
    }

    @Override
    protected void onPause() {
        // 중지 상태일 때 onPause 내부 구문 실행
        // 중지 상태란) 홈 버튼을 눌러 바깥으로 잠깐 빠져나갔을 때(앱은 종료되지 않았을 때)
        // 다른 액티비티가 활성화 되어있을 때
        super.onPause();
        Log.e("onPause", "ENTER");

    }

    @Override
    protected void onStop() {
        // A라는 액티비티가 B라는 액티비티에 의해 완전히 가려질 때 onStop 실행
        super.onStop();
        Log.e("onStop", "ENTER");

    }

    @Override
    protected void onDestroy() {
        // 화면이 파괴되어 소멸했을 때의 시점에 onDestroy 내부 구문 실행
        super.onDestroy();
        Log.e("onDestroy", "ENTER");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "ENTER");

    }
}