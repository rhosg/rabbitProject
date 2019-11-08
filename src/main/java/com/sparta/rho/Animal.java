package com.sparta.rho;
 class Animal {

        int age;
        char gender;

        public Animal( int age, char gender) {

            this.age = age;
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public int incrementAge() {
            return age++;
        }

    public char getGender() {
        return gender;
    }


}
