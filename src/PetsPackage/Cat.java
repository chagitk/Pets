/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsPackage;

/**
 * מחלקה שמייצגת חתול, יורשת מ-Pet.
 */
public class Cat extends Pet {
    private String color; // צבע החתול

    public Cat(String name, int age, String color) {
        super(name, age, "Cat"); // קוראת לבנאי של Pet עם species קבוע
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Cat food";
    }
}

