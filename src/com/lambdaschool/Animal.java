package com.lambdaschool;

public abstract class Animal {
  private static int maxId = 0;
  int id;
  String name;
  int yearNamed;

  public Animal(String name, int yearNamed) {
    maxId++;

    this.id = maxId;
    this.name = name;
    this.yearNamed = yearNamed;
  }

  public String getName() {
    return name;
  }

  public int getYearNamed() {
    return yearNamed;
  }

  public String eat() {
    return "Eats";
  }

  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();
}
