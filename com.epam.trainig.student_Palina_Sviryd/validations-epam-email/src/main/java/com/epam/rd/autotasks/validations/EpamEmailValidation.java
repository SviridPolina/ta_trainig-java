package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        // Put your code here
        if(email == null){
            return false;
        }

        if (email.indexOf('_') == -1 || email.indexOf('_') == 0){
            return false;
        }
        else {
            String name = email.substring(email.indexOf('_') + 1, email.length());
            if (name.indexOf('@') == -1 || name.indexOf('@') == 0 || name.charAt(0) == '$'){
                return false;
            }
            else{
                String end = email.substring(email.indexOf('@') + 1, email.length());
                if(end.equals("epam.com")){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
}





