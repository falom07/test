package org.example.OOP;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        File dir = new File("somefile");
        FileWriter fileWriter = new FileWriter(dir);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello World\n");
        bufferedWriter.write("Hello World2");
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(dir));
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}
