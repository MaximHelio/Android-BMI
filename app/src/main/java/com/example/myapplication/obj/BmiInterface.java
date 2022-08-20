package com.example.myapplication.obj;

public interface BmiInterface {

    // 인터페이스는 항상 정의되지 않은 함수만 갖고 있음. 함수를 정의할 수 없음.
//    void setHeight(int height);
//    void setWeight(int weight);
    // bmi 결과값 출력하는 함수
    String outputText(String name, double bmi);


}
