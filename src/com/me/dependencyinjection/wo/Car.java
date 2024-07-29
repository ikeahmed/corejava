package com.me.dependencyinjection.wo;
class Engine {
    // Engine specific code
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine(); // Car is responsible for creating its Engine dependency
    }
}