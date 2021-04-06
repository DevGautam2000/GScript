package gscript;
/*
     AUTHOR: GAUTAM CHANDRA SAHA
     DATE & TIME: 07/04/21 AT 12:57 AM
     DESCRIPTION: 
     
*/


import java.util.ArrayList;

public class StringManip {

    public static String rev(Object object) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(object));
        return String.valueOf(stringBuilder.reverse());
    }


    public static Integer count(String string) {
        return string.length();
    }

    public static Integer countIgnoreSpace(String string) {
        return string.replaceAll(" ", "").length();

    }

}
