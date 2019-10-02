package com.company;

public class Main {

    public static void main(String[] args) {
        int temperature = 35;
        boolean isRainy = true;
        if ((temperature >= 30 || !isRainy) && temperature < 40) {
            System.out.println("Идем гулять");
        }

    }
}
