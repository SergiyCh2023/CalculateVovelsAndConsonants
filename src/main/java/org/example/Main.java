package org.example;


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int [] array = new int [2];
        array = solution.calculatingVowelsAndConsonant("I am happy");
        System.out.println("=======>>>>" + "Vowels is: " + array[0] + "  Consonant is: " + array[1]);


        array = solution.calculatingVowelsAndConsonant("I");
        System.out.println("=======>>>>" + "Vowels is: " + array[0] + "  Consonant is: " + array[1]);

        array = solution.calculatingVowelsAndConsonant("rrr");
        System.out.println("=======>>>>" + "Vowels is: " + array[0] + "  Consonant is: " + array[1]);

        }

}