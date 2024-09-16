package org.example;

import org.example.OOP.Car;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String x = "jo";
//        StringBuilder string = new StringBuilder(x);
//
//        string.append("Hello World");
//        string.append("Hello World");
//
//        System.out.println(string);
//        String x = "hi"; //Stringbuilder
//        StringBuilder xx = new StringBuilder("hi");
//        Instant start = Instant.now();
//        for(int i = 0;i < 150000;i++) {
////            x = x + "hi";
//            xx.append("hi");
//        }
//        Instant end = Instant.now();
//        System.out.println(Duration.between(start, end).toSeconds());
//        Map<String,Integer> map = new HashMap<>();
//        map.put("a", 1);
//        map.put("b", 2);
//        map.put("c", 3);
//        for(Map.Entry<String,Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//        ArrayList a = new ArrayList();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        Iterator it = a.iterator();
//        int i = 0;
//        while(it.hasNext()){
//            ++i;
//            System.out.println(it.next());
//            if(i % 2 == 0){
//                it.remove();
//            }
//
//        }
//        System.out.println(a);
//        int i = 0;
//        int ii = 0;
//        System.out.println(i++);
//        System.out.println(++ii);
        Map<Integer,String> cars = new Hashtable<>();
        cars.put(12,"Toyota");
        cars.put(24,"BMW");
        cars.put(45,"Mercedes");
        cars.put(23,"Shevrole");
        cars.put(122,"Vass");
        cars.put(7,"Kamri");

        for(Map.Entry<Integer,String> car : cars.entrySet()){
            System.out.println(car.getKey() + "  " + car.getValue());
        }

    }
}