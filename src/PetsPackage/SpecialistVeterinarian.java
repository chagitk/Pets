/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsPackage;

/**
 * וטרינר מומחה – יורש מ-GeneralVeterinarian ומוסיף מומחיות.
 * מבצע override לבדיקה כדי להוסיף מידע.
 */
public class SpecialistVeterinarian extends GeneralVeterinarian {
    private String specialty; // תחום התמחות (למשל: עור, עיניים)

    public SpecialistVeterinarian(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialist " + getName() + " (in " + specialty + ") is examining " + pet.getName() + ".";
    }
}

