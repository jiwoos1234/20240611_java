package p03_method;

import javax.swing.*;

public class Ex10whileGame_mine {
  public static void main(String[] args) {


    do {
      int you = (int) (Math.random() * 3);
      String input = JOptionPane.showInputDialog("가위(0), 바위(1), 보(2)중에 입력하세요");
      int me;
      try {
        me = Integer.parseInt(input);
      } catch (Exception e) {
        continue;
      }
      if (me >= 3)
        System.out.println("다시 입력하세요");
      else if ((you - me) == -2 || (you - me) == 1) {
        System.out.println("이겼습니다");
      } else if ((you - me) == -1 || (you - me) == 2) {
        System.out.println("졌습니다");
      } else {
        System.out.println("비겼습니다");
      }

    } while (true);


  }
}
