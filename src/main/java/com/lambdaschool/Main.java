package com.lambdaschool;

import java.util.ArrayList;

public class Main {
  private static void search(ArrayList<Animal> animals, Test conditions) {
    for (Animal a : animals) {
      if (conditions.test(a)) {
        System.out.println(a.getName());
      }
    }
  }

  public static void main(String[] args) {
    String json = "{ \"type\" : \"Mammel\", \"name\" : \"Panda\", \"yearNamed\" : \"1869\" }";

    // TODO: Read in JSON data files
    // Create collections
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Mammal("Panda", 1869));
    animals.add(new Mammal("Zebra", 1778));
    animals.add(new Mammal("Koala", 1816));
    animals.add(new Mammal("Sloth", 1804));
    animals.add(new Mammal("Armadillo", 1758));
    animals.add(new Mammal("Raccoon", 1758));
    animals.add(new Mammal("Bigfoot", 2021));

    animals.add(new Bird("Pigeon", 1837));
    animals.add(new Bird("Peacock", 1821));
    animals.add(new Bird("Toucan", 1758));
    animals.add(new Bird("Parrot", 1824));
    animals.add(new Bird("Swan", 1758));

    animals.add(new Fish("Salmon", 1758));
    animals.add(new Fish("Catfish", 1817));
    animals.add(new Fish("Perch", 1758));

    // TODO: Parse search queries from console
    // Search using Lambda Expressions
    System.out.println("\n*** List all the animals in descending order by year named ***");
    animals.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
    animals.forEach(a -> System.out.println(a.getName() + ": { yearNamed: " + a.getYearNamed() + " }"));

    System.out.println("\n*** List all the animals alphabetically ***");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals.forEach(a -> System.out.println(a.getName()));

    System.out.println("\n*** List all the animals ordered by how they move ***");
    animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    animals.forEach(a -> System.out.println(a.getName() + ": { move: " + a.move() + " }"));

    System.out.println("\n*** List only those animals the breath with lungs ***");
    search(animals, a -> a.breath().equals("Lungs"));

    System.out.println("\n*** List only those animals that breath with lungs and were named in " +
            "1758" +
            " ***");
    search(animals, a -> a.breath().equals("Lungs") && a.getYearNamed() == 1758);

    System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
    search(animals, a -> a.reproduce().equals("Eggs") && a.breath().equals("Lungs"));

    System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    search(animals, a -> a.getYearNamed() == 1758);
  }
}
