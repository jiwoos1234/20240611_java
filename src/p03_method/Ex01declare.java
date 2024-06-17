package p03_method;

public class Ex01declare {
  // return type : (총 10가지)
  // return 없는 경우 => void
  // return 있는 경우 => primitive(8가지), reference (1가지)

  boolean b1;

  void print1() {
    System.out.println("hello method~!");
    // return; // 암묵적으로 return 생략
  }
  boolean print2()  {
    /*boolean result;
    Ex01declare ex01declare = new Ex01declare();
    result = ex01declare.b1;
    return result;*/
    return new Ex01declare().b1;  // false 를 리턴
  }
  char print3() {
    return 'c';
  }
  int print4() { return 10;}
  int print6()  { return (int) 0.0; }
  double print5() { return 10;}

  boolean print() {
    boolean result = false;
    return result;
  }
  boolean print(boolean result) {
    return result;
  }
  char print(char c) {
    return c;
  }
  int print(int i)  {
    return i;
  }
  double print(double d) {
    double d;
  }

  public static void main(String[] args) {
    Ex01declare e1 = new Ex01declare();
    e1.print1();
    System.out.println(e1.print2());
    System.out.println(e1.print());
    System.out.println(e1.print(true));
    System.out.println(e1.print('z'));
    System.out.println(e1.print(0));
    System.out.println(e1.print(0.0));
  }

}

class Math  {
  int add(int n1, int n2) {
    return n1+n2;
  }
  int subtrack(int n1, int n2) {
    return n1-n2;
  }

  int multiply(int n1, int n2) {
    return n1*n2;
  }

  double divide(int n1, int n2) {
    return n1/n2;
  }

  public static void main(String[] args) {

  }
}
