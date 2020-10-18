package animals;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractAnimals {
    protected String name;
    protected int yearDiscovered;
    protected List<String> stomach;
    protected int id;
    private static int maxId = 0;
    private static List<String> ate = new ArrayList<String>();

    public AbstractAnimals(String name, int year) {
        maxId++;
        this.name = name;
        this.yearDiscovered = year;
        this.stomach = ate;
        this.id = maxId;
    }

    void eat(String food) {
        this.stomach.add(food);
    }

    abstract String getMovement();

    abstract String getBeathingMethod();

    abstract String getReproductionMethod();
}
