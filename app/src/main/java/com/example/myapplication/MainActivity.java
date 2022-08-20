package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.obj.BmiInterface;
import com.example.myapplication.obj.Person;
import com.example.myapplication.obj2.Man;

// public: 어디서나 쓸 수 있음
public class MainActivity extends AppCompatActivity {

    // default(= 같은 package 안에서만 쓸 수 있는 구조, 상속받아도 쓸 수 없음)
    EditText height, weight, name;
    // private : 현재 클래스(MainActivity) 안에서만 사용가능, 상속을 해도 못씀, 같은 패키지여도 못씀
    // 자바 클래스 변수 공개범위 (접근제한자)
    // private Person person = new Person();
    private BmiInterface man = new Man(100, 50);


    @Override
    // protected => 상속받거나 같은 패키지에 있거나
    // onCreate도 AppCompatActivity 에서 상속 받음
    protected void onCreate(Bundle savedInstanceState) {
        // super.onCreate 가 있어야 실행됨. 안드로이드 플랫폼 위에서만 실행됨
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        name = findViewById(R.id.name);

        // Man은 오브젝트 아니고 클래스인데, 모든 클래스는 오브젝트를 상속받기 때문에 이렇게 쓸 수 있음
//        Object obj = new Man(100, 60);
        String answer = man.outputText("ㄴㄴㄴㄴ", 123);

        // 사용하지 않은 변수는 회색으로 표시됨
        TextView result = findViewById(R.id.result);
        Button btn = findViewById(R.id.confirm_button);
        //onClickListener를 버튼에 set해놓는데, clickListener에 있는 onClick를 실행해줘
        btn.setOnClickListener(clickListener);

    }

    // button을 클릭하는 이벤트랑 MainActivity를 연결(onClickListener라는 인터페이스의 역할)
    // 클래스와 클래스를 연결하는 데 사용되는 것 => 인터페이스(소통) vs abstract (상속 시 필수제약)
    // '나'를 사용하려는 애한테 걸어놓는 약속 (회사-회사 같은 계약조건, 나를 사용하면 이런 동작을 해야해)
    // click이라는 일부 기능만 쓸 수 있음 => 인터페이스 (대화, 통신)
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try {
                // person은 try문 안에서만 사용가능 _ 로컬변수이기 때문
                Person person = new Person();
                Log.d("initHeight", "initHeight : "+ height.getText().toString());
                Log.d("initWeight", "initWeight : "+ weight.getText().toString());
                // Person의 height / weight 주석 풀어줬더니 오류사라짐
                person.height = Integer.parseInt(height.getText().toString());
                person.weight = Integer.parseInt(weight.getText().toString());
                person.name = name.getText().toString();
                // person안의 bmi함수 쓰겠다는 것 / 함수 호출한 곳
//                person.bmi = person.bmi(person.height, person.weight);
//                man.bmi = man.bmi(person.height, person.weight);
                man.bmi = man.bmi(person.height);
//                person.bmi = man.bmi(person.height, person.weight);
//                man.bmi = man.bmi(person.height, person.weight);
                //double ans = bmi(initHeight, initWeight);
                //result.setText();

                String answer = person.name + "님은 " + man.bmi;

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("answer", answer);
                startActivity(intent);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("error", e.getMessage());
                startActivity(intent);
            }
        }
    };
}