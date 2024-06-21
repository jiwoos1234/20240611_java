package p05_Inherit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09Abstract {
  public static void main(String[] args) {
  new MyFrame();
  }
}
// 추상클래스 스스로 인스턴스가 안됨.
abstract class Abstract {
  int num = 10; void general(){ }
  // 추상메서드로 사용할 경우 반드시 abstract 붙일 것
  abstract void special();
}
interface Interface { }

class MyFrame extends JFrame {
  public MyFrame() throws HeadlessException {
    setSize(300, 200);
    setTitle("My Window");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());
    JButton jButton = new JButton("확인");
    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
      }
    });
    add(jButton);
    setVisible(true);
  }
}