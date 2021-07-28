package org.launchcode.java.studios.studio2;

import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String inputStr = input.nextLine();
        String lowerInput = inputStr.toLowerCase();
        char[] charInString = lowerInput.toCharArray();



        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char letter : charInString) {
            //removing the first if statement will get the code back to where it was
            if(Character.isLetter(letter)) {
                if (charCount.containsKey(letter)) {
                    charCount.put(letter, charCount.get(letter) + 1);
                } else {
                    charCount.put(letter, 1);
                }
            }

        }
        for (Map.Entry<Character, Integer> printChar : charCount.entrySet()) {
            System.out.println(printChar.getKey() + ":" + printChar.getValue());
        }

    }
}