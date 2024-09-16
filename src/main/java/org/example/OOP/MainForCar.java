package org.example.OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MainForCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(12,"Toyota"));
        cars.add(new Car(24,"BMW"));
        cars.add(new Car(45,"Mercedes"));
        cars.add(new Car(23,"Shevrole"));
        cars.add(new Car(122,"Vass"));
        cars.add(new Car(7,"Kamri"));
//        Collections.sort(cars);
//        Iterator<Car> carIterator = cars.iterator();
//        while(carIterator.hasNext()) {
//            System.out.println(carIterator.next());
//        }
//        Collections.sort(cars,(new Comparator<>() {
//            @Override
//            public int compare(Car car1, Car car2) {
//                return car1.getModel().compareTo(car2.getModel());
//            }
//        }));
        for(Car car : cars){
            System.out.println(car.toString());
        }
    }
}
