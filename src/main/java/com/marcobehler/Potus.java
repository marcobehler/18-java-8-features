package com.marcobehler;

/**
 * Thanks for watching this episode! Send any feedback to info@marcobehler.com!
 */
public class Potus {

    private String firstName;

    private String lastName;

    private Integer electionYear;

    private String party;

    public Potus() {
    }

    public Potus(String firstName, String lastName, Integer electionYear, String party) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.electionYear = electionYear;
        this.party = party;
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
}
