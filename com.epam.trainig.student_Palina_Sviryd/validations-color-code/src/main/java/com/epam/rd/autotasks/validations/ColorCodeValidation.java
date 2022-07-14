package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {

        // Put your code here
        if (color == null || color.length() == 0){
            return false;
        }

        if (color.charAt(0) != '#'){
            return false;
        }

        if (color.length() - 1 != 3 && color.length() - 1 != 6){
            return false;
        }

        for (int i = 1; i < color.length(); i++){

            if(!Character.isDigit(color.charAt(i))){
                if (color.toLowerCase().charAt(i) != 'a' && color.toLowerCase().charAt(i) != 'b'
                        && color.toLowerCase().charAt(i) != 'c'
                        && color.toLowerCase().charAt(i) != 'd'
                        && color.toLowerCase().charAt(i) != 'e'
                        && color.toLowerCase().charAt(i) != 'f'){
                    return false;
                }
            }
        }

        return true;
    }

}





