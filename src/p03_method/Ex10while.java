package p03_method;

import javax.swing.*;

public class Ex10while {
  public static void main(String[] args) {
    int i = 0;
    int sum = 0;
    while (i < 10) {
      sum += i++;

    }
    System.out.println(sum);


    i = 2;
    int j = 1;
    while (i < 10) {
      j = 1;
      while (j < 10) {
        System.out.println(i + "*" + j + "=" + i * j);
        j++;
      }
      i++;
      System.out.println();
    }


    System.out.println("=======내 마음의 숫자를 맞추기 게임=======");
    boolean stop = false;
    while (true) {
      int random = (int) (Math.random() * 100) + 1;
      if (stop) break;

      while (true) {
        String input = JOptionPane.showInputDialog("숫자를 입력하세요(종료하려면 Q,q)");
        if (input.toLowerCase().equals("q")) {
          stop = true;
          break;
        } else {
          int answer = Integer.parseInt(input);
          if (answer > random) {
            System.out.println("작습니다.");
          } else if (answer < random) {
            System.out.println("큽니다");
          } else {
            System.out.println("정답입니다.");
          }

        }
      }
    }
  }
}