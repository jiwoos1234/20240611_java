package p05_Inherit;

public class Ex03extends {
  public static void main(String[] args) {
  Marine m1 = new Marine();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}

// 추상클래스는 인스턴스 생성 불가. 상속받은 후 인스턴스 생성 가능
abstract class Unit  {
  public Unit() {
    // this(), super() 는 공존 불가: 맨 첫줄에 있어야 하기 때문
    super();
//    this("", 15, "");
    System.out.println("야생 동물 생성");
  }


  public Unit(String tribe, int hp, String name) {
    super();
    this.tribe = tribe;
    this.hp = hp;
    this.name = name;



    }
  int hp;
  String tribe;
  String name;
  public void move(int x, int y){}
  public void stop(){}

  @Override
  public String toString() {
    return String.format("%s{tribe=%s, hp=%d}", name,tribe, hp);
  }
}

abstract class Protoss extends Unit{
  // 상속할 경우에는 Member 변수와 method만 상속
  public Protoss(int hp,String name) {
    super("Protoss", hp, name);
  }
}

abstract class Terran extends Unit{
  // 상속할 경우에는 Member 변수와 method만 상속
  public Terran(int hp,String name) {
    super("Terran", hp, name);
  }
}
class Marine extends Terran {
  public Marine() {
    super(60,"Marine");
  }
}
class Medic extends Terran {
  public Medic() {
    super(45,"Medic");
  }
}