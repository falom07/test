package Other.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src","main","resources","test.txt");
        Path pathRs = Path.of("src","main","resources","result.txt");
        String text = Files.readString(path);
        text = text.replaceAll("public", "private");
        Files.writeString(pathRs, text);

    }
}
