package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {
    Button btnDiv;
    Button btnBack;
    EditText edit1;
    EditText edit2;
    TextView textResult;
    String num1;
    String num2;
    double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        setTitle("나누기");

        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnBack = (Button) findViewById(R.id.btnBack);
        edit1 = (EditText) findViewById(R.id.num1);
        edit2 = (EditText) findViewById(R.id.num2);
        textResult = (TextView)findViewById(R.id.textResult);

        btnDiv.setOnClickListener(new View.OnClickListener() { // 나누기 버튼
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num2.equals("0")) {
                    textResult.setText("0으로 나눌 수 없습니다!");
                } else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("결과 : " + result);
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() { // 뒤로가기 버튼
            @Override
            public void onClick(View view) {
                Log.d("Division", "btnBack clicked"); // 클릭 확인용
                Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}