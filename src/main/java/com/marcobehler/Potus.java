package com.marcobehler;

import java.util.ArrayList;
import java.util.List;

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
}
