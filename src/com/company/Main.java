package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String equation = "123123 + 123123";
        System.out.println(calc(equation)); // результат: 246246

        String example = "Каждый охотник желает знать где сидит фазан";
        System.out.println(capitalizeEachWord(example)); // результат: "Каждый Охотник Желает Знать Где Сидит Фазан"

        String oddString = "слово";
        System.out.println(getMiddleCharacter(oddString)); // результат: "О"
        String evenString = "пять";
        System.out.println(getMiddleCharacter(evenString)); // результат: "ят"

        example = "один один три два два два";
        System.out.println(removeDuplicateWords(example)); // результат: "один три два"

        String sameOccurencesCount = "abcabc";
        System.out.println(hasSameOccurences(sameOccurencesCount)); // результат: true
        String diffOccurencesCount = "abca";
        System.out.println(hasSameOccurences(diffOccurencesCount)); // результат: false
    }

    public static String calc(String str) {
        // WRITE CODE HERE
        String result = "";
        String[] strings = str.split(" ");
        switch (strings[1]) {
            case "+" -> {
                result = String.valueOf(Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]));
            }
            case "-" -> {
                result = String.valueOf(Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]));
            }
            case "/" -> {
                result = String.valueOf(Integer.parseInt(strings[0]) / Integer.parseInt(strings[2]));
            }
            case "*" -> {
                result = String.valueOf(Integer.parseInt(strings[0]) * Integer.parseInt(strings[2]));
            }
        }
        return result;
    }

    public static String capitalizeEachWord(String str) {
        // WRITE CODE HERE
        StringBuilder result = new StringBuilder();
        String[] strings = str.split(" ");
        for(String s : strings){
            result.append(s.substring(0, 1).toUpperCase());
            result.append(s.substring(1));
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static String getMiddleCharacter(String str) {
        // WRITE CODE HERE
        StringBuilder string = new StringBuilder();
        if(str.length() % 2 == 0)
            string.append(str.charAt(str.length() / 2 - 1));
        string.append(str.charAt(str.length() / 2));
        return string.toString();
    }

    public static String removeDuplicateWords(String str) {
        // WRITE CODE HERE
        String[] strings = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < strings.length; i++){
            boolean searched = false;
            for(int j = 0; j < i; j++){
                searched = strings[i].equals(strings[j]);
            }
            if(!searched){
                result.append(strings[i]);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static boolean hasSameOccurences(String str) {
        // WRITE CODE HERE
        ArrayList<Character> result = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(!result.contains(str.charAt(i)))
                result.add(str.charAt(i));
            else
                result.remove(Character.valueOf(str.charAt(i)));
        }
        return result.size() == 0;
    }
}