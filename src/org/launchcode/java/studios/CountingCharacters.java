package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.*;

public class CountingCharacters {
//    public static Pattern p = Pattern.compile("^[a-zA-Z]*$");
//    public static boolean isAlpha(Map.Entry<Character, Integer> s){
//        return p.matcher((CharSequence) s).find();
//    }
    private static String excludeNonAlpha(String line){
        for (int i = 0; i < line.length(); i++){
            line = line.replaceAll("[^a-zA-Z]", "").toLowerCase();
        }
        return line;
    }

    public static void main(String[] args){

        Scanner text = new Scanner(System.in);
        System.out.println("Enter some text you want the " +
                "characters counted for: ");
        String inputString = text.nextLine();
        excludeNonAlpha(inputString);

        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charactersInString = inputString.toCharArray();

        for (char c : charactersInString){
            if (charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> singleChar : charCount.entrySet()){
//            if (charCount.containsKey("[]") == ){
                System.out.println(singleChar.getKey() + ": " + singleChar.getValue());
//            } else {
//                continue;
            }
        }
    }
//}