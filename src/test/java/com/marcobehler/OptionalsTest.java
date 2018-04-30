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


}
