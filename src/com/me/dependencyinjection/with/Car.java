package com.me.dependencyinjection.with;

class Engine {
    // Engine specific code
}

class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine; // Engine is injected through the constructor
    }
}

