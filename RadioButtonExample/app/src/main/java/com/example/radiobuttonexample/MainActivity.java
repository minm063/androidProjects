package com.example.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg_gender;
    private RadioButton rb_man, rb_woman;
    private Button btn_result;
    private String str_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_gender = findViewById(R.id.rg_gender);
        rb_man = findViewById(R.id.rb_man);
        rb_woman = findViewById(R.id.rb_woman);
        btn_result = findViewById(R.id.btn_result);

        // 라디오 버튼들의 상태 값의 변경됨을 감지
        rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_man) {
                    Toast.makeText(MainActivity.this, "남자 라디오 버튼", Toast.LENGTH_SHORT).show();
                    // 라디오 버튼의 text 값을 String에 담아줌
                    str_result = rb_man.getText().toString();
                }
                else if (checkedId == R.id.rb_woman) {
                    Toast.makeText(MainActivity.this, "여자 라디오 버튼", Toast.LENGTH_SHORT).show();
                    str_result = rb_woman.getText().toString();
                }
            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str_result != null) {
                    Toast.makeText(MainActivity.this, str_result, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "라디오 버튼을 선택해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}