package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기");

        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdditionActivity.class);
                startActivity(intent);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() { //빼기 액티비티로 GO
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "btnSub clicked"); // 클릭 확인용
                Intent intent = new Intent(MainActivity.this, Subtraction.class);
                startActivity(intent);
            }
        });
    }

}