package com.lambdaschool;

public abstract class Animal {
  private static int maxId = 0;
  private int id;
  private String name;
  private int yearNamed;

  public Animal(String name, int yearNamed) {
    maxId++;

    this.id = maxId;
    this.name = name;
    this.yearNamed = yearNamed;
  }

  public String eat() {
    return "Eats food";
  }

  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();
}
