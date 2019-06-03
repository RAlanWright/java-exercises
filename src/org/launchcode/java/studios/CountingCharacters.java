package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class CountingCharacters {

    public static Pattern p = Pattern.compile("^[a-zA-Z]*$");

    public static boolean isAlpha(String s){
        return p.matcher(s).find();
    }

    public static void main(String[] args){

        String testString = "Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit. Nunc accumsan" +
                " sem ut ligula scelerisque sollicitudin. Ut at " +
                "sagittis augue. Praesent quis rhoncus justo. " +
                "Aliquam erat volutpat. Donec sit amet suscipit " +
                "metus, non lobortis massa. Vestibulum augue ex, " +
                "dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charactersInString = testString.toCharArray();

        for (char c : charactersInString){
            if (charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> singleChar : charCount.entrySet()){
            System.out.println(singleChar.getKey() + ": " + singleChar.getValue());
        }
    }
}
