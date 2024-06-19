package p03_method;

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
  }
}

