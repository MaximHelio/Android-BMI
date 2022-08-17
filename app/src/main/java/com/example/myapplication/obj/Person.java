package com.example.myapplication.obj;

// 함수만 정의해서 쓰려면 Interface를 쓰고(implements BmiInterface), 상속받아서 쓰려면 abstract를 씀(extends Bmi)
public class Person implements BmiInterface{
    // Person은 Bmi를 상속받았기 때문에 Bmi에 정의해놓은 abstract 클래스도 무조건 상속받아줘야한다.
    // 사람한테 height, weight 등은 자원
//    public int height, weight;
    public String name;
    public double bmi; // bmi라는 변수

    // bmi라는 함수
//    public double bmi(int height, int weight) {
//        double result = height - weight * 0.9;
//        System.out.println("BMI:" + result);
//        return result;
//    }

    // 패키지가 다른 클래스 안에서 상속받지 않는 이상 person. 찍었을 때 안나옴
    // ex. MainActivity에서 안나옴
    private String etc;

    // bmiInterface 받으면 필수
    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setWeight(int weight) {

    }

//    @Override
//    public boolean isID(String id) {
//        return false;
//    }
//
//    @Override
//    public boolean isEmail(String email) {
//        return false;
//    }
//
//    @Override
//    public double bmi(int height, int weight) {
//        return 0;
//    }
//
//    @Override
//    public int diet(int hour) {
//        return 0;
//    }
}
