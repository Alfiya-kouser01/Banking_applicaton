package com.javaBasics;

public class VehicleDriver {
    public static void main(String[] args) {
        String str="I am inside vehicleDriver";
        System.out.println(str);

        Vehicle vehicle = new Vehicle();
        String  stri = new String();
       // System.out.println(vehicle);
        Vehicle vehicle12 = new Vehicle();
        //System.out.println(vehicle12);
        Vehicle vehicle13 = new Vehicle(15,"test");
       // System.out.println(vehicle13);
        String str2 = new String("this a String");
       // System.out.println(str2);

        Vehicle bus = new Vehicle(30,"road","petrol",6,"manual",new ColorCombo("red","black"));
        System.out.println("bus -> " + bus);
        ColorCombo colorCombo1 = new ColorCombo("red","black");
        System.out.println(colorCombo1);

    }
}
