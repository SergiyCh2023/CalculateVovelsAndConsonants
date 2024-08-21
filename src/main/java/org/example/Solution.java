package org.example;

public class Solution {

    public int [] calculatingVowelsAndConsonant(String s) {

        if (s.length() == 0) throw new NoLettersInString();

        String newString = s.replaceAll("\\s+", "");
        String [] array = newString.split("");

        int counter = 0;
        for (int i = 0; i < array.length ; i++) {

            if (array[i].toLowerCase().equals("a") || array[i].toLowerCase().equals("o") || array[i].toLowerCase().equals("i") ||
                    array[i].toLowerCase().equals("e") || array[i].toLowerCase().equals("u")) {
                counter++;
            }
        }
        int [] arrayInt = new int [] {counter, array.length-counter};
        return arrayInt;

    }


}
