package com.example.comebackexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    private EditText et_comeback;
    private Button btn_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        et_comeback = (EditText) findViewById(R.id.et_comeback);
        btn_close = (Button) findViewById(R.id.btn_close);

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                // object 형태를 가져와 toString
                intent.putExtra("comeback", et_comeback.getText().toString());
                // 결과값 설정
                setResult(RESULT_OK, intent);
                // 현재 액티비티 종료
                finish();
            }
        });
    }
}