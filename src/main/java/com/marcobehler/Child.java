package com.marcobehler;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class Child {

    private final String name;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }
}
