package com.company;

public class EquippedPowerLifter extends Powerlifter {
    public EquippedPowerLifter(String name, String surname, int powerSQ, int powerBP, int powerDL) {
        super(name, surname, powerSQ, powerBP, powerDL);
    }

    void train(int time) {

        for (int i = 1; i <= time; i++) {
            if (Math.random() > 0.15) {

                if (powerSQ < 45 || powerBP < 45 || powerDL < 45) {

                    int minimum = Math.min(Math.min(powerSQ, powerBP), powerDL);
                    if (powerSQ == minimum) {
                        powerSQ++;
                        System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                                " DL: " + powerDL + " trained squat.");
                    } else if (powerBP == minimum) {
                        powerBP++;
                        System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                                " DL: " + powerDL + " trained bench press.");
                    } else {
                        powerDL++;
                        System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                                " DL: " + powerDL + " trained dead lift.");
                    }

                } else {
                    System.out.println("End of training - maximum power reached.");
                    break;
                }
            } else {
                System.out.println(name + " " + surname + " SQ: " + powerSQ + " BP: " + powerBP +
                        " DL: " + powerDL + " sustained an injury and cannot train now.");
                break;
            }
        }
    }
}
