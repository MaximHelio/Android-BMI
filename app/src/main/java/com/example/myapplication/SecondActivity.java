package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // 정상 처리
        String answer = getIntent().getStringExtra("answer");
        TextView answerMsg = findViewById(R.id.answer);
        answerMsg.setText(answer);
        // 에러 났을 때 처리
        String error = getIntent().getStringExtra("error");
//        Log.d(SecondActivity.class.getSimpleName(), "onCreate: "+error);
        TextView errorMsg = findViewById(R.id.errorMsg);
        errorMsg.getText();
        errorMsg.setText(error);
    }
}