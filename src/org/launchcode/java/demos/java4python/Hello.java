package org.launchcode.java.demos.java4python;

import java.util.*;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World");


        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> students = new HashMap<Integer, String>();

        System.out.println("What's the student's id?");
        int studentId = scanner.nextInt();

        while(studentId >= 0){
            System.out.println("ok, what's is the student's name?");
            String name = scanner.next();
            students.put(studentId, name);

            System.out.println("What's the student's id?");
            studentId = scanner.nextInt();
        }
//        printMap(HashMap<Integer, String> students);



//        do {
//            System.out.println("What's the student's id?");
//            studentId = scanner.nextInt();
//
//            System.out.println("ok, what's is the student's name?");
//            String name = scanner.next();
//            students.put(studentId, name);
//
//        } while(studentId >= 0);


        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            numbers.add(i);

        }

        List<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("orange");
        words.add("mango");
        words.add("pear");
        words.add("strawberry");


        System.out.println(getEvenSum(numbers));
        printFiveLengthStrings(words);

        int[] numbersArray = {1, 1, 2, 3, 5, 8};
        printArray(numbersArray);




    }

    public static void printMap(HashMap<Integer, String> students){
        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }

    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void printFiveLengthStrings(List<String> words){
        for (String word : words){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }

    public static int getEvenSum(List<Integer> numbers){
        int sum = 0;

        for(Integer num : numbers){
            if (num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }


}

