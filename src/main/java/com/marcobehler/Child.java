package com.marcobehler;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class Child {

    private final String name;

    private final Integer age;

    public Child(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
