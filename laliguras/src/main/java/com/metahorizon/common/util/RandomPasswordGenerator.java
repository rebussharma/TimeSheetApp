package com.metahorizon.common.util;

import java.util.Random;

/**
 * Created by Asus on 6/16/2018.
 */
public class RandomPasswordGenerator {

    public static String generateRandomPasswordForUser(String userName) {
        Random random = new Random();
        //split name by space " "
        String[] chunk = userName.split(" ");
        String password = "";
        for (int i = 0; i < chunk.length; i++) {
            char[] characters = chunk[i].toCharArray();
            password += characters[random.nextInt(characters.length)];
        }
        String randomNumber = "000000" + Integer.toString(random.nextInt(1000000));
        randomNumber = randomNumber.substring(randomNumber.length() - 6, randomNumber.length());
        password += randomNumber;
        return password;

    }

    // for test
    public static void main(String[] args) {
        System.out.println(generateRandomPasswordForUser("Alisha Maharjan"));
    }
}
