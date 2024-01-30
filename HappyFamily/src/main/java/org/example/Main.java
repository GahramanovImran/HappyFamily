package org.example;

import org.example.entty.Human;
import org.example.entty.Pet;
import org.example.enums.Species;

public class Main {
    public static void main(String[] args) {

        // family 1

        Human father1 = new Human("Samir", "Aliyev", 1977);
        father1.setIq(78);

        Human mother1 = new Human("Samira", "Aliyeva", 1982);
        mother1.setIq(82);

        Pet pet1 = new Pet(Species.CAT, "tom");

        Human child1 = new Human( "Gunay",  "Aliyeva", 2005, mother1, father1);





        //family 2

        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet2 = new Pet(Species.CAT, "tom", 2, 52,habits);

        Human father2 = new Human("Anar", "Veliyev", 1970);
        father2.setIq(98);

        Human mother2 = new Human("Amina", "Veliyeva", 1972);
        mother2.setIq(58);

        Human child21 = new Human( "Nuray",  "Veliyeva", 2015, 25, pet2, mother2, father2, null);

        String[][] child22schedule = new String[7][2];
        child22schedule [0][0] = "monday";
        child22schedule [0][1] = "walking";

        child22schedule [1][0] = "tuesday";
        child22schedule [1][1] = "eating";

        child22schedule [2][0] = "wednesday";
        child22schedule [2][1] = "teaching";

        child22schedule [3][0] = "thursday";
        child22schedule [3][1] = "learnning";

        child22schedule [4][0] = "friday";
        child22schedule [4][1] = "coding";

        child22schedule [5][0] = "saturday";
        child22schedule [5][1] = "restinging";

        child22schedule [6][0] = "sunday";
        child22schedule [6][1] = "traveling";

        Human child22 = new Human( "Elmir",  "Veliyev", 2006, 63, pet2, mother2, father2, child22schedule );

        System.out.println(child21);
        System.out.println(child22);

        System.out.println(child22.describePet());
        System.out.println(child22.greatPet());


        System.out.println(pet2.eat());
        System.out.println(pet2.foul());
        System.out.println(pet2.respon());


    }
}