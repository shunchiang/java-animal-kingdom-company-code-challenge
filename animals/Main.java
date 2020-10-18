package animals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Kingdom");

        // mammals

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Big Foot", 2021);

        // birds

        Birds pidgeon = new Birds("Pidgeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        // fish

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<AbstractAnimals> animalsList = new ArrayList<>();

        animalsList.add(panda);
        animalsList.add(zebra);
        animalsList.add(koala);
        animalsList.add(sloth);
        animalsList.add(armadillo);
        animalsList.add(raccoon);
        animalsList.add(bigfoot);
        animalsList.add(pidgeon);
        animalsList.add(peacock);
        animalsList.add(toucan);
        animalsList.add(parrot);
        animalsList.add(swan);
        animalsList.add(salmon);
        animalsList.add(catfish);
        animalsList.add(perch);

        System.out.println("\n\n*** All Animals by ID ***");

        animalsList.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n\n*** Animals sorted by year discovered ***");

        animalsList.sort((v1, v2) -> v2.yearDiscovered - v1.yearDiscovered);

        animalsList.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n\n*** Animals sorted by alphabetically ***");

        animalsList.sort((v1, v2) -> v1.name.compareToIgnoreCase(v2.name));

        animalsList.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n\n*** Animals sorted by how they move ***");

        animalsList.sort((v1, v2) -> v1.getMovement().compareToIgnoreCase(v2.getMovement()));

        animalsList.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n\n*** Animals that breath with lungs ***");

        animalsList.stream().filter(a -> a.getBeathingMethod() == "Lungs")
                .forEach(e -> System.out.println(e.toString()));

        System.out.println("\n\n*** Animals that breath with lungs discovered in 1758 ***");

        animalsList.stream().filter(a -> a.getBeathingMethod() == "Lungs" && a.yearDiscovered == 1758)
                .forEach(e -> System.out.println(e.toString()));

        System.out.println("\n\n*** Animals that breath with lungs and lay eggs ***");

        animalsList.stream().filter(a -> a.getBeathingMethod() == "Lungs" && a.getReproductionMethod() == "Eggs")
                .forEach(e -> System.out.println(e));

        System.out.println("\n\n*** Animals discovered in 1758 listed alphabetically ***");

        animalsList.stream().filter(a -> a.yearDiscovered == 1758)
                .sorted((v1, v2) -> v1.name.compareToIgnoreCase(v2.name))
                .forEachOrdered(e -> System.out.println(e.toString()));
    }
}