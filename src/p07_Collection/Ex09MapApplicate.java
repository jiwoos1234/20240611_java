package p07_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex09MapApplicate {
  private static Map phoneBook = new HashMap();

  public static void main(String[] args) {
    addPhone("친구", "김나연", "010-1234-5678");
    addPhone("친구", "안예지", "010-1234-5748");
    addPhone("친구", "와랄라", "010-1234-5778");
    addPhone("친구", "박지우", "010-1234-3218");
    addPhone("마트", "010-1111-5678");
    printBook(phoneBook);
  }

  private static void addPhone(String group, String name, String tel) {
    if (!phoneBook.containsKey(group)) {
      phoneBook.put(group, new HashMap<>());
    }
    HashMap book = (HashMap) phoneBook.get(group);
    book.put(name, tel);

  }

  private static void addPhone(String name, String tel) {
    addPhone("기타", name, tel);
  }

  private static void printBook(Map map) {
    System.out.println(map);
    Iterator it = phoneBook.keySet().iterator();
    while (it.hasNext()) {
      String group = (String) it.next();
      HashMap book = (HashMap) phoneBook.get(group);
      System.out.printf("[ %s ] %d개 \n", group, book.size());
      Iterator subIt = book.entrySet().iterator();
      while (subIt.hasNext()) {
        Map.Entry entry = (Map.Entry) subIt.next();
        System.out.printf(" %s , %s \n", entry.getKey(), entry.getValue());

      }
    }
  }

}
