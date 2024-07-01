package p08_Stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex03StreamMidOperator {
  public static void main(String[] args) {
    String dir = "C:\\workspace\\spaceJava\\20240611_java";
    try {
      Stream<Path> fileListStream = Files.list(Paths.get(dir));
      fileListStream.
          // n개가 들어오면 n개의 각각에 대하여 처리할것을 정의
              map(new Function<Path, File>() {
            @Override
            public File apply(Path path) {
              return path.toFile();
            }
          })
//          .peek(new Consumer<File>() {
//            @Override
//            public void accept(File f) {
//              System.out.println(f.toString() + ",");
//            }
//          })
          // n개가 들어와서 필터링을 거쳐 m개를 리턴함.
          .filter(new Predicate<File>() {
            @Override
            public boolean test(File file) {
              return file.isFile();
            }
          })
          .map(new Function<File, String>() {
            @Override
            public String apply(File file) {
              return file.toString();
            }
          })
          .map(new Function<String, String>() {
            @Override
            public String apply(String s) {
              return s.toUpperCase();
            }
          })
          .distinct() // 중복을 제거해줌
          // 각각의 원소에 대해서 적용 입력은 있지만, 출력은 없다.
          .forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
              System.out.println(s);
            }
          });
      ;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}