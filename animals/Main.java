package animals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Kingdom");
        List<String> stomach = new ArrayList<String>();
        Fish blueFin = new Fish("Blue Fin Tuna", 1, 200, stomach);
        blueFin.eat("Minol");
        System.out.println(blueFin.toString());
    }
}