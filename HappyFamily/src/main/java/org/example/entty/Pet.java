package org.example.entty;

import org.example.enums.Species;

import java.util.Arrays;
import java.util.Objects;


// fieldler

public class Pet {

    private Species species;
    private String nickname;
    private  int age;
    private int tricklevel; //TODO: fix  1-100 case

    private String[] habits;




    //Comstructor

    public Pet() {
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;

        setTricklevel(tricklevel);
    }


    public Pet(Species species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }





    //Method

    public  String eat() {
        return "I am  eating";
    }
    public String respon() {
        return String.format("Hello, owner. I am - %s. I miss you!", nickname);                             // duzelis
    }

    public String foul (){
        return "I need to cover up";
    }




    //get

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {                                                          // duzelis
        if (tricklevel < 1 || tricklevel > 100) {
            this.tricklevel = -1;
        } else {
            this.tricklevel = tricklevel;
        }
    }


    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }





    //hascode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && tricklevel == pet.tricklevel && species == pet.species && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, tricklevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }





    //to string
    @Override
    public String toString() {
        return species.name().toLowerCase() + "{"+
                " nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}


