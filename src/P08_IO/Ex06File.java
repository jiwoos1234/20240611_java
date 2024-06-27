package P08_IO;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Ex06File {
  public static void main(String[] args) {
    // 1) File 폴더를 다룰 수 있다.
    File file = new File(".");
    if (file.exists() && file.isDirectory()) {
      String[] filelist = file.list();
      for (int i = 0; i < filelist.length; i++) {
        System.out.println(filelist[i]);
      }
    } else {
      System.out.println("이것은 경로가 잘못 됐습니다.");
    }
    System.out.println("============================");
    // 2) File 객체는 파일을 다룰 수 있다.
    file = new File("test.txt");
    if (file.exists()) {
      try {
        System.out.println(file.getName());
        System.out.println(file.getPath());  //파일경로출력 (현재 내가있는 폴더의 위치)
        System.out.println(file.getAbsolutePath());      //파일절대경로(c드라이브기준)
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getParent());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(file.length());
        System.out.println(file.toString().substring(file.toString().lastIndexOf(".") + 1));
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    // 3) File 객체는 Drive의 정보를 알 수 있다.
    String drive;
    double totalSpace,freeSpace, usableSpace,usedSpace;
    File[] roots = File.listRoots();
    for (File f : roots) {
      drive = f.getAbsolutePath();
      totalSpace = f.getTotalSpace() / Math.pow(1024, 3);
      usableSpace = f.getUsableSpace() / Math.pow(1024, 3);
      freeSpace = f.getFreeSpace() / Math.pow(1024, 3);
      usedSpace = totalSpace - usableSpace;
      System.out.println("Drive: " + drive);
      System.out.printf("Total Space: %5.2f GB %n", totalSpace);
      System.out.printf("useable Space: %5.2f GB %n", usableSpace);
      System.out.printf("free Space: %5.2f GB %n", freeSpace);
      System.out.printf("used Space: %5.2f GB %n", usedSpace);
    }


  }
}
