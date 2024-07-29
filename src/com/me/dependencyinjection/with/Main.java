package com.me.dependencyinjection.with;

public class Main {
    public static void main(String[] args) {
// Creating instances
        Engine engine = new Engine();
        Car car = new Car(engine);
    }
}
