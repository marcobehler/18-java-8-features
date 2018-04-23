package com.marcobehler;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class PotusLambdaTest {

    private List<Wife> wifesOfDonaldTrump = Arrays.asList(
            new Wife("Melania", Arrays.asList(new Child("Barron", 12))),
            new Wife("Marla", Arrays.asList(new Child("Tiffany", 24))),
            new Wife("Ivana", Arrays.asList(
                    new Child("Donald Trump Jr.", 40),
                    new Child("Ivanka", 36),
                    new Child("Eric", 34)))
    );

    private List<Wife> wifesOfBarrackObama = Arrays.asList(
            new Wife("Michelle", Arrays.asList(new Child("Malia", 20),new Child("Sasha", 17)))
    );

    private List<Potus> potuses = Arrays.asList(
            new Potus("Donald", "Trump", 2016, "Republican", wifesOfDonaldTrump),
            new Potus("Barack", "Obama", 2012, "Democratic", wifesOfBarrackObama),
            new Potus("Barack", "Obama", 2008, "Democratic"),
            new Potus("George W.", "Bush", 2004, "Republican"),
            new Potus("George W.", "Bush", 2000, "Republican"),
            new Potus("Bill", "Clinton", 1996, "Democratic"),
            new Potus("Bill", "Clinton", 1992, "Democratic"),
            new Potus("George H.W.", "Bush", 1988, "Republican"),
            new Potus("Ronald", "Reagan", 1984, "Republican"),
            new Potus("Ronald", "Reagan", 1980, "Republican"),
            new Potus("Jimmy", "Carter", 1976, "Democratic")
    );

    @Test
    public void lambda_exercises() {
        // f(x) -> y

        new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return null;
            }
        };

        // f(x) -> boolean

        new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
    }


    @Test
    public void lambdas() {
        Potus trump = potuses.get(0);
        Potus obama = potuses.get(1);


        // f(x) -> y

        // f(void) -> void
        trump.giveSpeech(() -> System.out.println("I'm gonna play some golf now!"));
        obama.giveSpeech(() -> System.out.println("I'mma play some ball, now!"));

        // f(x) -> void

        trump.giveSpeech2(lengthOfSpeech -> {
            System.out.println("I'm gonna play some golf now!");
            System.out.println("My speech was awesome and sooooo long: " + lengthOfSpeech);
        });
    }


}
