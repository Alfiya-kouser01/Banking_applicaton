package Inheritances;

public class Single_level_inheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
