package com.marcobehler;

import java.util.ArrayList;
import java.util.List;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class Wife {

    private final String name;

    private final List<Child> children;

    public Wife(String name, List<Child> children) {
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
