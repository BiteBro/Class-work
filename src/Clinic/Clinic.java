package Clinic;

import animals.Animal;
import animals.Beaver;
import animals.Gopher;
import animals.Raccoon;
import staff.Doctor;
import staff.Nurse;

public class Clinic {
    public static void main(String args[]){
        
        Doctor bob = new Doctor("Surgeon", "Bob");
        Doctor arnold = new Doctor("Therapist", "Arnold");
        Nurse nur = new Nurse("Asia");
        
        Beaver[] beaverArr = new Beaver[6];
        
        Beaver beaverHuan = new Beaver("Huan", 5.7f, 4, 37); //енот
        Beaver beaverArchi = new Beaver("Archi", 0.7f, 2, 23); //суслик
        Beaver beaverToha = new Beaver("Toha", 2.3f, 5, 29); //бобер
        Beaver beaverTina = new Beaver("Tina", 5.7f, 4, 33); //енот
        Beaver beaverBogdan = new Beaver("Bogdan", 1.1f, 2, 25); //суслик
        Beaver beaverHobit = new Beaver("Hobit", 3.5f, 5, 31); //бобер
        
        
        beaverHuan.setDoctor(bob);
        beaverArchi.setDoctor(arnold);
        beaverToha.setDoctor(bob);
        beaverTina.setDoctor(bob);
        beaverBogdan.setDoctor(arnold);
        beaverHobit.setDoctor(bob);
        
        beaverHuan.setNurse(nur);
        beaverArchi.setNurse(nur);
        beaverToha.setNurse(nur);
        beaverTina.setNurse(nur);
        beaverBogdan.setNurse(nur);
        beaverHobit.setNurse(nur);
        
        beaverHuan.setDisease("sprain");
        beaverArchi.setDisease("fever heat");
        beaverToha.setDisease("sprain");
        beaverTina.setDisease("sprain");
        beaverBogdan.setDisease("fever heat");
        beaverHobit.setDisease("tail fracture");
        
        beaverArr[0] = beaverHuan;
        beaverArr[1] = beaverArchi;
        beaverArr[2] = beaverToha;
        beaverArr[3] = beaverTina;
        beaverArr[4] = beaverBogdan;
        beaverArr[5] = beaverHobit;
        
        for (int i = 0; i < beaverArr.length; i++) {
            
            if(beaverArr[i].getDisease() == "sprain"){
            beaverArr[i].patientInfo();
            }            
        }
        
        System.out.println("/////////////////////////////////////////////////////");   
        
        Animal[] animalArr = new Animal[2];
        
        Raccoon raccoonHuan = new Raccoon("Raccon", "Huan", 5.7f, 4, 37); //енот
        Gopher gopherArchi = new Gopher("Gopher", "Archi", 0.7f, 2, 23); //суслик
        
        raccoonHuan.setDoctor(bob);
        gopherArchi.setDoctor(arnold);
        
        raccoonHuan.setNurse(nur);
        gopherArchi.setNurse(nur);
        
        raccoonHuan.setDisease("sprain");
        gopherArchi.setDisease("fever heat");
        
        animalArr[0] = raccoonHuan;
        animalArr[1] = gopherArchi;
        
        for (int i = 0; i < animalArr.length; i++) {
                       
            animalArr[i].patientInfo();
            System.out.println("");
                   
        }
        
        /*
        Doctor bob = new Doctor("Surgeon", "Bob");
        Doctor arnold = new Doctor("Therapist", "Arnold");
        Nurse nur = new Nurse("Asia");
        
        Raccoon raccoon = new Raccoon("Huan", 5.7f, 4, 37); //енот
        Gopher gopher = new Gopher("Archi", 0.7f, 2, 23); //суслик
        Beaver beaver = new Beaver("Toha", 4.3f, 5, 31); //бобер
        
        raccoon.setDoctor(bob);
        gopher.setDoctor(arnold);
        beaver.setDoctor(bob);
        
        raccoon.setNurse(nur);
        gopher.setNurse(nur);
        beaver.setNurse(nur);
        
        raccoon.setDisease("sprain");
        gopher.setDisease("fever heat");
        beaver.setDisease("tail fracture");
        
        raccoon.patientInfo();
        gopher.patientInfo();
        beaver.patientInfo();
      */
    }
    
}
