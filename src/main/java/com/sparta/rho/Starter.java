package com.sparta.rho;

import com.sparta.rho.animals.AnimalManager;

/**
 * Hello world!
 */
public class Starter {


    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        while (true){
            animalManager.spawnRabbits();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }


    }


}

