package com.javaBasics;
import java.util.Scanner;
public class Convert_tempFto_tempC {
    public static void main(String[] args) {


        //c=(5(F-32))/9
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        double C;
        double i = F - 32;
        C =(5*i)/9;
        System.out.println(C);
        System.out.println(10<<2);
    }
}
