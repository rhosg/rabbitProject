package com.sparta.rho;

/**
 * Hello world!
 */
public class Starter {


    public static void main(String[] args) {
        Reporter reporter = new Reporter();
        while (true){
            reporter.spawnRabbits();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }


    }


}

