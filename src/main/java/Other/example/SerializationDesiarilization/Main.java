package Other.example.SerializationDesiarilization;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = Path.of("src","main","resources","testOb").toFile();

        extracted(file);
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file))) {
            var human = oos.readObject();
            System.out.println(human);


        }

    }

    private static void extracted(File file) {
        Human human = new Human(12,"Vitalilk");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))){
            out.writeObject(human);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
