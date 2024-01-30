package org.example.entty;

import java.util.Arrays;
import java.util.Objects;


// fieldler

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq; //TODO; fix
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;



//constructorlar

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
        setIq(iq);                                                                  //duzelis getter setter metoduna gore
    }


    //method

    //"Hello, [pet-in adi]" Stringini return edir
    public String greatPet(){
        return String.format("Hello, %s ", pet.getNickname());
    }

    //"I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]=<50" Stringini return edir
    public String describePet(){
        return String.format("I have a %s, he is %d years old, he is %s.",
                pet.getSpecies().name().toLowerCase(),
                pet.getAge(),
                pet.getTricklevel()>50 ? " ver sly" : "almost not sly"
        );
    }






    //get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {                                                                      //duzelis
        if (iq < 1 || iq > 100) {
            this.iq = -1;
        } else {
            this.iq = iq;
        }
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }







    //Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }






    //to string

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.name + " " + mother.surname +                              // duzelis
                ", father=" + father.name + " " + father.surname +                              // duzelis
                ", pet=" + pet +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }


}
