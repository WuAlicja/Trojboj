package com.company;

public class RawPowerLifter extends Powerlifter {

    public RawPowerLifter(String name, String surname, int powerSQ, int powerBP, int powerDL) {
        super(name, surname, powerSQ, powerBP, powerDL);
    }

    void train(int time) {

        for (int i = 1; i <= time; i++) {
            if (Math.random() > 0.05) {
                if (powerSQ < 20 || powerBP < 20 || powerDL < 20) {

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
