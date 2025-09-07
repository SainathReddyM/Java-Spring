package com.msr;

public class Car {
    String make;
    String model;
    int year;

    // 1. Parameterized Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // 2. Overloaded Constructor (chaining to the first one)
    public Car(String make, String model) {
        // Calls the first constructor, providing a default year
        this(make, model, 2025);
    }

    // 3. Overloaded No-Argument Constructor (chaining to the second one)
    public Car() {
        // Calls the second constructor, providing default make and model
        this("Unknown", "Unknown");
    }
}
