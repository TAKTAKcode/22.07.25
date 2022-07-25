package com.tak;

public class Cat extends Animal {
    private int age;
    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }
    public void bark() {
        System.out.println("나용!");
    }
    public String toString() {
        return age + "의 " + getName();
    }

}
