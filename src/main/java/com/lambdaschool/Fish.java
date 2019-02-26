package com.lambdaschool;

public class Fish extends Animal {
  public Fish(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "Swims";
  }

  @Override
  public String breath() {
    return "Gills";
  }

  @Override
  public String reproduce() {
    return "Eggs";
  }

  @Override
  public String toString() {
    return "Fish{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", yearNamed=" + yearNamed +
            '}';
  }
}
