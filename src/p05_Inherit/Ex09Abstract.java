package p05_inherit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09Abstarct {
  public static void main(String[] args) {
    // 스스로 인스턴스 생성불가(추상 클래스, interface)
//    Abstract abs = new Abstract();
//    Interface inter = new Interface();

  }
}
// 공통(표준)으로 사용하기 위해 만듦, 인스턴스 생성 불가
abstract class Abstract {
  int num = 10; void general(){}
  // 추상 메서드로 사용 할 경우 abstract 반드시 붙일것
  abstract void special();
}

interface Interface { }
