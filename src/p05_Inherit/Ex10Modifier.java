package p05_Inherit;

import common.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10Modifier {
  //접근제어자(Access Modifier):public,protectd,default,private
  public String publicVar;
  protected String protectedVar;  //src 폴더에서 사용예
  String defaultVar;
  private String privateVar;
  // 메서드 앞에도 접근 제어자 4가지 다 붙음.

  public static void main(String[] args) {
    // private int num=1; //지역변수는 접근 제어자 사용불가
    //지역변수를 익명객체에서 쓸때 final붙임,java8부터 안 붙여도 됨.
    final int result = 10;
    new JButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(result); // 상수라서 사용은 가능
//        result = 10; //지역변수는 익명객체에서 변경불가.
      }
    });
    FinalClass finalClass = new FinalClass();
    System.out.println(finalClass);
    // java10부터 var 사용가능. 선언과 초기화 분리적용 안됨.
    var name = "LGH"; // 동적할당가능, 단 지역변수일 때만!
    Utils.typeOf(name);
  }
}
// final이 class 앞에 붙을 때 제어자는 상속이 안됨.
final class FinalClass { }
//class FinalParents extends FinalClass {}