package com.javaBasics;

public class ColorCombo {
    String roofColor;
    String bodyColor;


    public ColorCombo(String roofColor,String bodyColor){
        this.roofColor=roofColor;
        this.bodyColor=bodyColor;
    }

    @Override
    public String toString() {
        return roofColor +" "+ bodyColor;
    }
}
