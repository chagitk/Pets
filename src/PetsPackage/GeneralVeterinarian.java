/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsPackage;

/**
 * מחלקה שמייצגת וטרינר כללי – מממשת את הממשק Veterinarian.
 */
public class GeneralVeterinarian implements Veterinarian {
    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "General checkup for " + pet.getName() + ", a " + pet.getSpecies() + ".";
    }
}

