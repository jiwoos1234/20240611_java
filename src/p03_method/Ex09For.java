package p03_method;

public class Ex09For {
  public static void main(String[] args) {
    // 반복문을 구현할 때
    // 첫번째 패턴을 찾아라.
    // 두번째 초/조/증 을 적용하여 구현하라.
    int sum = 0;
    sum = sum + 0;
    sum = sum + 1;
    sum = sum + 2;
    sum = sum + 3;
    sum = 0;
    //  for (int i = 9; i >=0; --1) {
    //    sum = sum+ i ;
    //  }

    for (int i = 0; i < 10; i++) {
      sum = sum + i;
    }
    System.out.println(sum);

//    for (int i = 2; i < 10; i++) {
//      for (int j = 1; j < 10; j++) {
//
//        System.out.println(i + "*" + j + "=" + i * j);
//
//        }
//    }

    for (int i = 2; i < 10; i+=3) {

      for (int j = 1; j < 10; j++) {
        for (int k = 0; k < 3; k++) {
          System.out.printf("%d * %d = %2d \t" , i + k, j, (i +k) * j);
        }
        System.out.println();


      }
      
    }
    
    
    
    
    
    
    
    
    
  }
}


