package com.sparta.rho;

import com.sparta.rho.animals.AnimalManager;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Starter {


    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer");
        a = in.nextInt();
        AnimalManager animalManager = new AnimalManager();
        while (true){
            animalManager.spawnRabbits(a);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }


    }


}

