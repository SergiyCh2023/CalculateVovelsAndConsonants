package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private  Solution solution;

    @BeforeEach
    void setup(){
        solution = new Solution();
    }

    @Test
    void calculatingVowelsAndConsonantTestReturnBoth(){
        int [] array = solution.calculatingVowelsAndConsonant("I am happy");
        Assertions.assertArrayEquals(new int[] {3, 5 }, array);
    }


    @Test
    void calculatingVowelsAndConsonantTestReturnVowels(){
        int [] array = solution.calculatingVowelsAndConsonant("I");
        Assertions.assertArrayEquals(new int[] {1, 0 }, array);
    }

    @Test
    void calculatingVowelsAndConsonantTestReturnConsonant(){
        int [] array = solution.calculatingVowelsAndConsonant("rrr");
        Assertions.assertArrayEquals(new int[] {0, 3 }, array);
    }

    @Test
    void calculatingVowelsAndConsonantTestNoLetterInStringException(){
        Assertions.assertThrows(NoLettersInString.class, ()->solution.calculatingVowelsAndConsonant(""));
    }


}