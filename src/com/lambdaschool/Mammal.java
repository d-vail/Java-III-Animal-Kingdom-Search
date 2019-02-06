package com.lambdaschool;

public class Mammal extends Animal {
  public Mammal(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "Walks";
  }

  @Override
  public String breath() {
    return "Lungs";
  }

  @Override
  public String reproduce() {
    return "Live Births";
  }

  @Override
  public String toString() {
    return "Mammal{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", yearNamed=" + yearNamed +
            '}';
  }
}
