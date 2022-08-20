package com.example.myapplication.obj;

public abstract class Bmi {
    // 변수
    public int height, weight;
    // 최초로 만든 함수는 abstract로 정의를 해줘야함
    // 상속받으려고 하는 애한테 걸어놓는 약속(조건부 상속_ 이 조건을 채워야만 상속받아서 사용할 수 있음)
    // 함수
    public double bmi(){
        return height - weight * 0.9;
    }

    public abstract void setHeight(int height);
    public abstract void setWeight(int weight);


}
