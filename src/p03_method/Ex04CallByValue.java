package p03_method;

public class Ex04CallByValue {
  public static void main(String[] args) {
    String st;  //선언만 할 경우 참조형 변수의 구조만 설정됨
    // System.out.println(st); //초기화가 안되어서 에러
    String str = "hello";
    System.out.println(str);
    Data d = new Data();
    System.out.println("main: "+ d);
    d.value = 100;
    System.out.println(d.value);
    change(500);// 19번 라인 호출
    change(d.value); // 19번 라인 호출
    change(d);       // 20번 라인 호출
    System.out.println(d.value);
  }

  static void change(int value){
    value = 1000;
    System.out.println(value);
  }
  static void change(Data data)  {
    data.value = 1000;
    System.out.println("change: "+data);
  }

}

class Data  {
  int value;
}
