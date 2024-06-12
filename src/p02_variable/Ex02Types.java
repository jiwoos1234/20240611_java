package p02_variable;

import p01_class.Animal;

public class Ex02Types {
  boolean power; //논리형 true, false 1byte
  char c1; // 문자형, 2byte, 0~65535
  byte b1 ;  // 정수형, 1byte, -128~127
  short s1; // 정수형, 2byte, -32768~32767
  int i1 ;   // 정수형, 4byte, -2147483648~2147483647
  long l1 ;  // 정수형, 8byte
  float f1 ; // 실수형, 4byte 소수점 7째자리 10^-45~10^38
  double d1 ; // 실수형, 8byte 소수점 13째자리 10^-324~10^308
  String str;
  Animal animal;


  public static void main(String[] args) {
    // 변수의 종류 : Primitive(일반 변수), Reference(참조형 변수)
    // Primitive type(  일반 변수는 실제 값을 가짐 )
    boolean power = true; //논리형 true, false 1byte
    char c1 = 'A'; // 문자형, 2byte, 0~65535
    byte b1 = 10;  // 정수형, 1byte, -128~127
    short s1 = 10; // 정수형, 2byte, -32768~32767
    int i1 = 10;   // 정수형, 4byte, -2147483648~2147483647
    long l1 = 10l;  // 정수형, 8byte
    float f1 = 0.1f; // 실수형, 4byte 소수점 7째자리 10^-45~10^38
    double d1 = 0.1d; // 실수형, 8byte 소수점 13째자리 10^-324~10^308

    // Reference type (참조형 변수 주소 값을 (기본값은 null이 나옴) 가짐.)
    String str = "Hello";
    System.out.println(str);
    Animal animal = new Animal();
    System.out.println(animal);

    Ex02Types ex02Types = new Ex02Types();
    System.out.println(ex02Types.power);
    System.out.println(ex02Types.c1);
    System.out.println(ex02Types.b1);
    System.out.println(ex02Types.s1);
    System.out.println(ex02Types.i1);
    System.out.println(ex02Types.l1);
    System.out.println(ex02Types.f1);
    System.out.println(ex02Types.d1);

  }
}
