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

        Log.d("MainActivity", "onCreate called"); // 추가!

        btnsub = (Button) findViewById(R.id.btnSub);
        if (btnsub == null) {
            Log.e("MainActivity", "btnSub is NULL!"); // 추가!
        } else {
            Log.d("MainActivity", "btnSub found"); // 추가!
        }

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "btnSub clicked"); // 클릭 확인용
                Intent intent = new Intent(MainActivity.this, Subtraction.class);
                startActivity(intent);
            }
        });
    }

}