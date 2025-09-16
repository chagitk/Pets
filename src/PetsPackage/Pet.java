/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsPackage;

/**
 * מחלקה אבסטרקטית שמייצגת חיית מחמד.
 * כוללת תכונות בסיסיות ומתודות אבסטרקטיות להתנהגות.
 */
public abstract class Pet {
    private String name;       // שם החיה
    private int age;           // גיל החיה
    protected String species;  // סוג (כלב, חתול וכו') – מוגן כדי שיהיה נגיש במחלקות יורשות

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // מתודה אבסטרקטית – על כל מחלקה יורשת לממש אותה
    public abstract String makeSound();

    // מתודה אבסטרקטית – מה החיה אוכלת
    public abstract String eat();
}

