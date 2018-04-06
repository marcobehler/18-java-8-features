package com.marcobehler;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */


public class PotusTest {

    private List<Wife> wifesOfDonaldTrump = Arrays.asList(
            new Wife("Melania", Arrays.asList(new Child("Barron", 12))),
            new Wife("Marla", Arrays.asList(new Child("Tiffany", 24))),
            new Wife("Ivana", Arrays.asList(
                    new Child("Donald Trump Jr.", 40),
                    new Child("Ivanka", 36),
                    new Child("Eric", 34)))
    );

    private List<Potus> potuses = Arrays.asList(
            new Potus("Donald", "Trump",
                    2016, "Republican", wifesOfDonaldTrump),
            new Potus("Barack", "Obama", 2012, "Democratic"),
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
    public void filter_map_limit_distinct_collect() {
        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    @Test
    public void flatmap_sort_collect() {
        Potus trump = potuses.get(0);

        Map<Integer,Child> kids = trump.getWifes()
                .stream()
                .flatMap(wife -> wife.getChildren().stream())
                .sorted(Comparator.comparing(Child::getAge).reversed())
                .collect(Collectors.toMap(Child::getAge, Function.identity()));

        System.out.println(kids);
    }
}