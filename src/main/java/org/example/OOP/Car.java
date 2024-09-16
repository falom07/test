package org.example.OOP;

public class Car   {
    int speed;
    String model;
    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
//    @Override
//    public int compareTo(Car o) {
//        if(this.speed == o.speed){
//            return 0;
//        }else if(this.speed > o.speed){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
//    @Override
//    public int compareTo(Car o) {
//        return this.model.compareTo(o.model);
//    }
}
