/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsPackage;

/**
 * מחלקה שמייצגת כלב, יורשת מ-Pet.
 */
public class Dog extends Pet {
    private String breed; // גזע הכלב

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog"); // קוראת לבנאי של Pet עם species קבוע
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Dog food";
    }
}
