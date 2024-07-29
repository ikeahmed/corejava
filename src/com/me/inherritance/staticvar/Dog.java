package com.me.inherritance.staticvar;
class Dog {
    static String genus = "Canis";
}
class Main {
    public static void main(String[] args) {


        Dog d = new Dog();
        System.out.println(d.genus); // Confusing
        System.out.println(Dog.genus); //Clearer
    }
}
