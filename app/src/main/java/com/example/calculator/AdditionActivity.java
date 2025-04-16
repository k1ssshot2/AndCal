package com.example.calculator;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdditionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        Button btnAdd = findViewById(R.id.btnAdd);
        TextView result = findViewById(R.id.result);
        Button btnBack = findViewById(R.id.btnBack);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = input1.getText().toString();
                String num2 = input2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    int a = Integer.parseInt(num1);
                    int b = Integer.parseInt(num2);
                    result.setText("결과: " + (a + b));
                } else {
                    result.setText("숫자를 입력하세요");
                }
            }

        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
