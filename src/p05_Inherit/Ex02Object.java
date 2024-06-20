package p05_Inherit;

public class Ex02Object {
  public static void main(String[] args) {
    Member m1 = new Member("pjw","010-1234-5678");
    String str = new String("hello");
    System.out.println(m1);
    System.out.println(str);
    System.out.println(m1 instanceof Object);
    System.out.println(m1 instanceof Member);


  }
}
// 모든 클래스는 Object를 상속 받는다. extends Object안 써도 됨.
// 상속할 경우에는 Member 변수와 method만 상속
class Member extends Object{
  // Object 메서드는 9가지
String name, mobile;

  public Member(String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }

  @Override
  public String toString() {
    return String.format("name: %s, mobile: %s", name, mobile);
  }
}
class Phone { int key; }
class Computer { int key; }
// java 는 다중상속을 허용하지 않는다. 명확하기 때문에
// class SmartPhone extends Phone, Computer {}