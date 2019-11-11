package com.sparta.rho.animals;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalManager {
    private static List<Rabbit> rabbits = new ArrayList<>();
    private static List<Fox> foxes = new ArrayList<>();
    private static List<Rabbit> newBabyRabbits = new ArrayList<>();
    private static List<Rabbit> deadRabbits = new ArrayList<>();
    private static List<Rabbit> deadEatenRabbits= new ArrayList<>();
    private static List<Fox> newBabyFoxes = new ArrayList<>();




    public void spawnRabbits(int totalTime) {
        startingRabbits();
        int males = 0;
         int females = 0;
        int months = 0 ;

        for (Rabbit rabbit : rabbits) {

            if (rabbit.getAge() >= 3 && rabbit.getGender() == 'F') {
                newBabyRabbits.addAll(breedingRabbits());
            }
            if (rabbit.getAge() == 60) {
                deadRabbits.add(rabbit);
            }
            rabbit.incrementAge();
        }
        //if statement acts as a spawn protection to prevent rabbit extinction during the first few months
        if (months ==5) {
            startingFoxes();
        }
        if (foxes.size() >0) {
            for (Fox fox : foxes) {
                if (fox.getAge() >= 10 && fox.getGender() == 'F') {
                    newBabyFoxes.addAll(breedingFoxes());
                }
                deadEatenRabbits.addAll(eatenRabbits());
                fox.incrementAge();
            }
        }

        rabbits.addAll(newBabyRabbits);
        rabbits.removeAll(deadRabbits);
        rabbits.removeAll(deadEatenRabbits);
        foxes.addAll(newBabyFoxes);
        males = 0;
        females = 0;
        //temporary for loop, TO DO user specifies time cycle
        for (Rabbit rabbit : rabbits) {
            if (rabbit.getGender() == 'M') {
                males++;
            } else {
                females++;
            }
        }
        System.out.println("Number of rabbits: " + rabbits.size() + " Months: " + months + " Males: " + males + " Females: " + females+ " Number of rabbits eaten: " + deadEatenRabbits.size()
        + " Number of foxes: " + foxes.size());
 if (months == totalTime){
     //Print it out
 }
        months++;
    }

    public void startingRabbits() {
        rabbits.add(new Rabbit(0, 2, 'F'));
        rabbits.add(new Rabbit(1, 2, 'M'));
    }

    public void startingFoxes() {
        foxes.add(new Fox(1, 'F'));
        foxes.add(new Fox(1, 'M'));

    }

    public List<Rabbit> breedingRabbits() {
        Random random = new Random();
        int rabbitName = rabbits.size();
        List<Rabbit> babyRabbits = new ArrayList<>();
        int birthRate = random.nextInt(5) + 1;
        for (int i = 0; i < birthRate; i++) {
            char gender;
            if (random.nextBoolean()) {
                gender = 'M';
            } else {
                gender = 'F';
            }
            babyRabbits.add(new Rabbit(rabbitName, 0, gender));
            rabbitName++;
        }
        return babyRabbits;
    }

    public List<Fox> breedingFoxes() {
        Random random = new Random();
        List<Fox> babyFoxes = new ArrayList<>();
        int birthRate = random.nextInt(2) + 1;
        for (int i = 0; i < birthRate; i++) {
            char gender;
            if (random.nextBoolean()) {
                gender = 'M';
            } else {
                gender = 'F';
            }
            babyFoxes.add(new Fox(0, gender));
        }
        return babyFoxes;
    }

    public List<Rabbit> eatenRabbits() {
        Random random = new Random();
        List<Rabbit> eatenRabbits = new ArrayList<>();
        int rabbitMeal = random.nextInt(20) + 1;
        for (int i = 0; i < rabbitMeal; i++) {
            eatenRabbits.add(rabbits.get((i)));
        }
        return eatenRabbits;

    }
}





