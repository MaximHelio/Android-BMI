package com.example.myapplication.obj2;

public class Cat extends Animal{

    public Cat(boolean isHuman) {
        // 상속받은 Animal의 생성자를 받음 => 생성자는 변수명(함수명)이 없음 => super라고 씀
        super(isHuman);
    }
}
