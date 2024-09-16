package org.example.OOP;

import java.util.Comparator;

public class SortBySpeed implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getSpeed() < o2.getSpeed()){
            return -1;
        }else if(o1.getSpeed() > o2.getSpeed()){
            return 1;
        }
        return 0;
    }
}
