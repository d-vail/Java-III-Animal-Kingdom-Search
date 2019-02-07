package com.lambdaschool;

public class Bird extends Animal {
  public Bird(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "Flies";
  }

  @Override
  public String breath() {
    return "Lungs";
  }

  @Override
  public String reproduce() {
    return "Eggs";
  }

  @Override
  public String toString() {
    return "Bird{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", yearNamed=" + yearNamed +
            '}';
  }
}
