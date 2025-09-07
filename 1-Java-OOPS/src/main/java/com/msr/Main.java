package com.msr;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Gundu"); // "dog1" is a reference on the stack, pointing to a Dog object on the heap.
        Dog dog2 = new Dog("Chinnu");// "dog2" is another reference on the stack, pointing to a different Dog object on the heap.

        dog1.bark(); // Calls the instance method on dog1, which uses its own name.
        dog2.bark(); // Calls the instance method on dog2, which uses its own name.

        //calling the static method using the class name
        // Static methods can be called without creating an instance of the class.
        Dog.displaySpecies();
    }
}