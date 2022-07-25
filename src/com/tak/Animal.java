package com.tak;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void bark();
    public String getName() {
        return name;
    }
    public abstract String toString();              //문자열 변환
    public void introduce() {
        System.out.print(toString() + "이다");
        bark();
    }
}
