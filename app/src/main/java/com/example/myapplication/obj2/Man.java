package com.example.myapplication.obj2;

import com.example.myapplication.obj.Bmi;
import com.example.myapplication.obj.BmiInterface;
import com.example.myapplication.obj.Person;


// 상속; Man의 bmi도 Person의 bmi도 double
public class Man extends Person implements BmiInterface {

    // 나만의 생성자 스타일을 가질 경우, 이 스타일을 다른 클래스에서도 따라줘야함 => 기본 생성자 구조는 사라짐
    public Man(int height, int weight){
        // Person의 height (int로 선언해준 부분)
        this.height = height;
        this.weight = weight;

    }
//    public Man(int height){
//        this.height = height;
//    }

    // 생성자
//    public Man(){
//        height = 11;
//        weight = 22;
//        // 함수 부를 땐 파라미터 자료형 안씀, 함수 만들 땐 씀
//        bmi = bmi(height, weight);
//    }

   // Person의 bmi를 쓸 것인가, 나름대로 수정할 건지
//    @Override
    //Man 클래스의 bmi를 선언
//    public double bmi(int height, int weight) {
//        // super: 부모 = Person을 상속받아 bmi를 호출하기 위해
//        double result = super.bmi(height, weight);
//        result += 100;
//        return result;
//    }

    // 오버라이딩
    public double bmi(){
        double result = super.bmi();
        return result;
    }

    // 오버로딩_ 함수의 파라미터가 달라짐
    public double bmi(int height){
        this.height = height;
        double result = super.bmi();
        return result;
    }

    @Override
    public String outputText(String name, double bmi) {
        String text = name + "님은" + "bmi 결과값이"+ bmi + "입니다";
        return text;
    }
}
