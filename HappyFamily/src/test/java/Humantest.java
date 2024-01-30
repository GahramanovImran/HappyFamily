import org.example.entty.Human;
import org.example.entty.Pet;
import org.example.enums.Species;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class Humantest {

    @Test

    public void testToString(){

        Human father2 = new Human("Anar", "Veliyev", 1970);
        father2.setIq(98);

        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet2 = new Pet(Species.CAT, "tom", 2, 52,habits);


        Human mother2 = new Human("Amina", "Veliyeva", 1972);
        mother2.setIq(58);
        Human child21 = new Human( "Nuray",  "Veliyeva", 2015, 25, pet2, mother2, father2, null);



        Assertions.assertEquals("Human{name='Nuray', surname='Veliyeva', year=2015, iq=25, mother=Amina Veliyeva, father=Anar Veliyev, pet=cat{ nickname='tom', age=2, tricklevel=52, habits=[walking, eating]}, schedule=null}",child21.toString());


    }

}
