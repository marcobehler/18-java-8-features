package com.marcobehler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class Potus {

    private String firstName;

    private String lastName;

    private Integer electionYear;

    private String party;

    private List<Wife> wives = new ArrayList<>();

    public Potus() {
    }

    public Potus(String firstName, String lastName, Integer electionYear, String party) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.electionYear = electionYear;
        this.party = party;
    }

    public Potus(String firstName, String lastName, Integer electionYear, String party, List<Wife> wives) {
        this(firstName, lastName, electionYear, party);
        this.wives = wives;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getElectionYear() {
        return electionYear;
    }

    public void setElectionYear(Integer electionYear) {
        this.electionYear = electionYear;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public List<Wife> getWives() {
        return wives;
    }

    public void setWives(List<Wife> wives) {
        this.wives = wives;
    }

    public void giveSpeech(Runnable runnable) {
        System.out.println("I am giving a crazy speech!");
        runnable.run();
    }

    public void giveSpeech2(Consumer<Integer> consumer) {
        System.out.println("I am giving a crazy speech!");
        consumer.accept(ThreadLocalRandom.current().nextInt());
    }


    public String getPlanFor(String country) {
        if (country.equals("Germany")) {
            return "Oktoberfest!";
        } else {
            return null;
        }
    }

}
