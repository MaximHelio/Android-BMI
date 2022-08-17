package com.example.myapplication.obj;

import android.util.Log;

public class Answer {
    public String answer;

    public Person person;

    // 생성자
    public Answer(){

        Log.d("로그", "Answer: ");
        // 같은 패키지여서 protected 여도 person. 찍었을 때 etc나옴
        // person.
    }
}
