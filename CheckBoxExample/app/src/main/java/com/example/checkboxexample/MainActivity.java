package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk_red, chk_blue, chk_green;
    private TextView tv_result;
    private Button btn_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk_red = findViewById(R.id.chk_red);
        chk_blue = findViewById(R.id.chk_blue);
        chk_green = findViewById(R.id.chk_green);
        tv_result = findViewById(R.id.tv_result);
        btn_result = findViewById(R.id.btn_result);

        // 결과 버튼을 클릭했을 때
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String 값 초기화
                String str_result = ""; // 결과값을 가져올 String 변수(null이 아닌 공백의 상태)

                // 체크 박스에 체크가 되어있다면
                if (chk_red.isChecked()) {
                    str_result += chk_red.getText().toString();
                }
                if (chk_blue.isChecked()) {
                    str_result += chk_blue.getText().toString();
                }
                if (chk_green.isChecked()) {
                    str_result += chk_green.getText().toString();
                }
                tv_result.setText(str_result);
            }
        });
    }
}