package org.example.steps;

import org.apache.commons.lang3.RandomStringUtils;

public class Test {

    public static void main(String arg[]) {
        int length = 251;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        System.out.println(generatedString);
    }
}

