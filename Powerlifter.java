package com.company;

public abstract class Powerlifter {

    String name;
    String surname;
    int powerSQ;
    int powerBP;
    int powerDL;

    public Powerlifter(String name, String surname, int powerSQ, int powerBP, int powerDL) {
        this.name = name;
        this.surname = surname;
        this.powerSQ = powerSQ;
        this.powerBP = powerBP;
        this.powerDL = powerDL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerSQ() {
        return powerSQ;
    }

    public void setPowerSQ(int powerSQ) {
        this.powerSQ = powerSQ;
    }

    public int getPowerBP() {
        return powerBP;
    }

    public void setPowerBP(int powerBP) {
        this.powerBP = powerBP;
    }

    public int getPowerDL() {
        return powerDL;
    }

    public void setPowerDL(int powerDL) {
        this.powerDL = powerDL;
    }

    abstract void train(int time);
}
