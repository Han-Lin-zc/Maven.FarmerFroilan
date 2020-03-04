package com.zipcodewilmington.froilansfarm.buildings;

public class ChickenCoop {
    public class Dog {
        String name;
        String color;
        int age;
        String breed;

        public Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        void bark() {
        }
    }
}
