/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsPackage;

/**
 * ממשק שמגדיר את הפעולות שכל וטרינר צריך לממש.
 */
public interface Veterinarian {

    // מחזיר את שם הווטרינר
    String getName();

    // בודק חיה ומחזיר תיאור של הבדיקה
    String examinePet(Pet pet);
}

