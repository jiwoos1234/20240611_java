package p02_variable;

import common.Utils;
import p01_class.Animal;

public class Ex05char {
  char chr;

  public static void main(String[] args) {
    char c1 = 'A';  //65
    Utils.typeOf(c1);
    System.out.println((int) c1);
    System.out.println(c1 + c1); //연산할 경우 int로 형 변환
    Utils.typeOf(c1+c1);
    char c2 = 'a';  //97
    Utils.typeOf(new Animal());
    char c3 = '0';  //48
    // char c4 = '';  에러남

    Ex05char ex05char = new Ex05char();
    System.out.println(ex05char.chr);
    // 공백의 hexa 코드값은 '\u0000',' '
    System.out.println((int) ex05char.chr);
    Utils.typeOf(ex05char.chr);
    if(ex05char.chr == 32) {
      System.out.println("공백이 같습니다");
    }
    if (ex05char.chr == '\u0000') {
      System.out.println("공백이 같습니다.");
    }
    //특수 문자 리터럴
    char c4 = '\'';
    char c5 = '\"';
    char c6 = '\\';
    char c7 = '\b'; // 백스페이스
    char c8 = '\t'; // tab
    char c9 = '\n'; // 개행 (한줄 내려쓰기)
    char c10 = '\r'; // 캐리지 리턴
    char c11 = '\f'; // 폼피드
    char c12 = '\u0000';  //공백의 헥사값
    c12 = ' '; //기본값
  }
}
