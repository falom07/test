package Other.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PracticeIO {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src","main","resources","test.txt").toFile();
        try(FileInputStream fis = new FileInputStream(file)) {
            byte [] buffer = new byte[fis.available()];
            fis.read(buffer);
            String s = new String(buffer);

            s = s.replace(" ","\n");
            List<String> list = List.of(s.split("\n"));


            list.stream()
                    .filter(x -> x.substring(0,1).equals(x.substring(0,1).toUpperCase()))
                    .forEach(System.out::println);
//            list.stream()
//                    .filter( x -)


        }


    }
}
