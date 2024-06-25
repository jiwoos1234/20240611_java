package p07_Collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Ex05Set {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet();
    set.add(4);
    set.add(4);
    set.add(2);
    set.add(3);
    System.out.println(set);
    set.add(1);
    set.remove(4);
    System.out.println(set);
    for (int i : set) {
      System.out.println(i);
      Iterator it = set.iterator();
      while (it.hasNext()) System.out.println(it.next());


      // hashset lotto / while문 사용(set.size >7 )set.add(math.random*78
    }

    Set<Integer> lotto = new HashSet();
    while (lotto.size() < 6) {
      int random = (int) (Math.random() * 45) + 1;
      lotto.add(random);
    }
    System.out.println(lotto);

    // 모범답안

    Set<Integer> lotto1 = new HashSet<>();
    while (lotto1.size() < 6 ) {
      lotto1.add((int) (Math.random() * 45) + 1 );
    }
    ArrayList list = new ArrayList(lotto1);
    Collections.sort(list);
    System.out.println(list);


    Set<Integer> lotto2 = new TreeSet<>();
    while (lotto2.size() < 6 ) {
      lotto2.add((int) (Math.random() * 45) + 1 );
    }
    System.out.println(lotto2);

  }
}
