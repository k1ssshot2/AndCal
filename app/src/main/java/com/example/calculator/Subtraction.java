package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Subtraction extends AppCompatActivity {

    Button btnsub;
    Button btnback;
    EditText edit1;
    EditText edit2;
    TextView textresult;
    String num1;
    String num2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);
        setTitle("빼기");

        btnsub = (Button) findViewById(R.id.btnSub);
        btnback = (Button) findViewById(R.id.btnBack);
        edit1 = (EditText) findViewById(R.id.num1);
        edit2 = (EditText) findViewById(R.id.num2);
        textresult = (TextView)findViewById(R.id.textResult);

        btnsub.setOnClickListener(new View.OnClickListener() { //빼기 버튼
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textresult.setText("결과 : " + result);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() { // 뒤로가기 버튼
            @Override
            public void onClick(View view) {
                Log.d("Subtraction", "btnSub clicked"); // 클릭 확인용
                Intent backintent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backintent);
            }
        });
    }
}