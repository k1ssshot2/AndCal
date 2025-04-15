package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MultiplyActivity extends AppCompatActivity {
    EditText input1, input2;
    Button btnCalculate;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiply_activity);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        btnCalculate = findViewById(R.id.btnCalculate);
        resultView = findViewById(R.id.resultView);
        Button btnBack = findViewById(R.id.btnBack);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num1 = Double.parseDouble(input1.getText().toString());
                    double num2 = Double.parseDouble(input2.getText().toString());
                    double result = num1 * num2;
                    resultView.setText("결과: " + result);
                } catch (NumberFormatException e) {
                    resultView.setText("숫자를 올바르게 입력하세요.");
                }
            }
        });
        btnBack.setOnClickListener(v -> {
            finish();
        });
    }
}
