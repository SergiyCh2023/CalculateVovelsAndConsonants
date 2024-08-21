package org.example;

public class NoLettersInString extends IllegalArgumentException {

    NoLettersInString(){
        super("Has no letter!!!");
    }

}
