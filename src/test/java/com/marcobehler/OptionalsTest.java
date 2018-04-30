package com.marcobehler;

import org.junit.Test;

import java.util.Optional;

/**
 * Thanks for watching this episode! If you want to, drop me a line to info@marcobehler.com.
 */
public class OptionalsTest {

    @Test
    public void optionals_part_1() {
        Potus anyPotus = new Potus();

        Optional<String> planForGermany = anyPotus.getPlanFor("Germany");
        System.out.println("planForGermany = " + planForGermany);

        Optional<String> planForChina = anyPotus.getPlanFor("China");
        /*planForChina.ifPresentOrElse(
                plan -> System.out.println("planForChina = " + plan),
                () -> System.out.println("Well, there is no plan for China!")
        );*/
    }

    @Test
    public void optionals_part_2() {
        Potus anyPotus = new Potus();

        Optional<Wife> wife = findWife(anyPotus, "M");

        String name = wife
                .filter(w -> w.getName().endsWith("a"))
                .map(w -> w.getName().toUpperCase())
                .orElse("I DoNT hAVE A nAME");

        System.out.println("name = " + name);
    }


    @Test
    public void exercise() {
      //  String name = new Potus2().flatMap();
        //System.out.println("name = " + name);
    }

    public static class Potus2 {
        private final Optional<Pet> pet;

        public Potus2(Optional<Pet> pet) {
            this.pet = pet;
        }

        public Optional<Pet> getPet() {
            return pet;
        }
    }

    public static class Pet {
        private final Optional<String> name;

        public Pet(Optional<String> name) {
            this.name = name;
        }

        public Optional<String> getName() {
            return name;
        }
    }

    private Optional<Wife> findWife(Potus anyPotus, String startingLetter) {
        return anyPotus.getWives().stream()
                .filter(w -> w.getName().startsWith(startingLetter))
                .findAny();
    }
}