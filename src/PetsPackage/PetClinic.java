/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsPackage;


import java.util.ArrayList;
import java.util.List;

/**
 * מחלקה ראשית המדגימה את פעולת המערכת: יצירת חיות, וטרינרים, ובדיקות.
 */
public class PetClinic {
    public static void main(String[] args) {
        // רשימת חיות שמנוהלת במרפאה
        List<Pet> pets = new ArrayList<>();

        // יצירת חיות
        pets.add(new Dog("Buddy", 3, "Golden Retriever"));
        pets.add(new Cat("Whiskers", 2, "Black"));

        // יצירת וטרינרים
        Veterinarian generalVet = new GeneralVeterinarian("Dr. Smith");
        Veterinarian specialistVet = new SpecialistVeterinarian("Dr. Adams", "Dermatology");

        // מעבר על כל חיה והדגמת ההתנהגות והבדיקה
        for (Pet pet : pets) {
            System.out.println("Pet: " + pet.getName());
            System.out.println("Sound: " + pet.makeSound());
            System.out.println("Food: " + pet.eat());
            System.out.println("General Vet: " + generalVet.examinePet(pet));
            System.out.println("Specialist Vet: " + specialistVet.examinePet(pet));
            System.out.println("-----");
        }
    }
}

