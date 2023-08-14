package com.javaBasics;

public class Vehicle {
    int capacity;
    String mode;
    String fuelType;
    int wheels;
    String controlType;

    ColorCombo colorCombo1;

    public  Vehicle(){
       // System.out.println("Inside defalut constructor/non paramitarized constructor");
    }

    public Vehicle(int a,String b){
        //System.out.println("iam a parameterized constructor with " + b + "and number "+ a);
    }
    public Vehicle(int capacity,String mode,String fuelType,int wheels,String controlType ){
        this.capacity=capacity;
        this.mode = mode;
        this.fuelType=fuelType;
        this.wheels=wheels;
        this.controlType=controlType;
    }

    public Vehicle(int capacity,String mode,String fuelType,int wheels,String controlType,ColorCombo colorCombo1  ){
        this.capacity=capacity;
        this.mode = mode;
        this.fuelType=fuelType;
        this.wheels=wheels;
        this.controlType=controlType;
        this.colorCombo1=colorCombo1;
    }

     public String toString(){
        return capacity + " " +  mode + " " + fuelType + " " +wheels + " " +controlType+" " + colorCombo1;
    }
}
