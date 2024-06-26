package p02_variable;

import p01_class.Animal;

public class Ex02Types {
  // 변수의 종류 크게 : Primitive, Reference
  // Primitive type(기본형 변수, 실제 값을 가짐 )
  // Reference type(참조형 변수, 주소 값을 가짐.)

  // 변수의 할당 = 선언 + 초기화
  // 멤버변수는 선언만 해도 new 에서 기본값으로 초기화
  // 멤버변수가 할당이 된것은 new 에서 제외
  boolean power = true; //할당
  char c1; //선언
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  String str;
  Animal animal;

  public static void main(String[] args) {
    boolean power = true; // 논리형, true, false 1byte
    char c1 = 'A'; // 문자형, 2byte, 0~65535
    byte b1 = 10; // 정수형, 1byte, -128~127
    short s1 = 10;// 정수형, 2byte, -32768~32767
    int i1 = 10; // 정수형, 4byte, -2147483648~2147483647
    long l1 = 10L;// 정수형, 8byte
    float f1 = 0.1F; //실수형, 4byte 소수점 7째자리 10^-45~10^38
    double d1 = 0.1D;//실수형, 8byte 소수점 13째자리 10^-324~10^308

    String str = "Hello"; System.out.println(str);
    Animal animal = new Animal(); System.out.println(animal);
    System.out.println(c1);
    System.out.println(str);

    System.out.println("==============================");
    Ex02Types ex02Types = new Ex02Types();
    System.out.println(ex02Types.power); // false
    System.out.println(ex02Types.c1);    // 공백
    System.out.println(ex02Types.b1);    // 0
    System.out.println(ex02Types.s1);    // 0
    System.out.println(ex02Types.i1);    // 0
    System.out.println(ex02Types.l1);    // 0
    System.out.println(ex02Types.f1);    // 0.0
    System.out.println(ex02Types.d1);    // 0.0
    System.out.println(ex02Types.str);   // null
    System.out.println(ex02Types.animal);// null

  }
}





