import org.example.entty.Pet;
import org.example.enums.Species;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PetTest {


    @Test
    public void petToString(){
        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet2 = new Pet(Species.CAT, "tom", 2, 52,habits);
        Assertions.assertEquals("cat{ nickname='tom', age=2, tricklevel=52, habits=[walking, eating]}", pet2.toString());

    }


    @Test
    public void petRespon(){
        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet2 = new Pet(Species.CAT, "tom", 2, 52,habits);
        Assertions.assertEquals("Hello, owner. I am - tom. I miss you!", pet2.respon());

    }



    @Test
    public void petTricklevel_WhenMoreThan50_ThenReturnVerySly(){

    }

















}
