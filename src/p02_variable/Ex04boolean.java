package p02_variable;

public class Ex04boolean {


  public static void main(String[] args) {
    Tv tv;
    tv = new Tv();
    System.out.println(tv);
    tv.power();

    tv.channelup();
    tv.channeldown();
    tv.volumeup();
    tv.volumedown();


  }

}

class Tv {
  boolean power;
  int channel;
  int volume;

  void power() {
//    1
//    if (power == false) {
//      power = true;
//    } else {
//      power = false;
//    }
//    if (power == true) {
//      System.out.println("Tv 전원이 켜졌습니다.");
//    } else {
//      System.out.println("Tv 전원이 꺼졌습니다.");
//    }

//    2
//    if (power == false) {
//      power = true;
//      System.out.println("Tv 전원이 켜졌습니다.");
//    } else {
//      power = false;
//      System.out.println("Tv 전원이 꺼졌습니다.");
//    }

    power = !power;
    System.out.println(power ? "전원 on" : "전원 off");
  }

//채널위아래로 올리기
//  void channelup() {
//    channel =  channel + 1;
//    System.out.println(channel + 1);
//  }
//  void channeldown() {
//    channel = channel - 1;
//      System.out.println(channel - 1);
//  }

  // 모범답안
  void channelup() {
    channel++;
    System.out.println(channel);
  }

  void channeldown() {
    channel--;
    System.out.println(channel);
  }

//  void volumeup() {
//   volume = volume + 1;
//    System.out.println(volume);
//  }
//
//  void volumedown() {
//    volume = volume - 1;
//    System.out.println(volume);

  void volumeup() {
    if (power)
      System.out.println(++volume);
  }

  void volumedown() {
    if (power)
      System.out.println(--volume);

  }

}





