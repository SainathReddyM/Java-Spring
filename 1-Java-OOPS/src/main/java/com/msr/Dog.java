package com.msr;

public class Dog {

    //Instance variable; Each dog will have its own name
    String name;

    //Static varable; All dogs share the same species
    static String species = "canis familiaris";

    //Constructor; Used to create a new Dog object with a specific name
    public Dog(String name){
        this.name = name;
    }

    // Instance Method: uses the instance variable 'name'
    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    // Static Method: uses the static variable 'species'
    public static void displaySpecies(){
        System.out.println("Species: " + species);
        // The line below would cause a compile error because a static method can't access an instance variable.
        // System.out.println("Name: " + name);
    }
}
