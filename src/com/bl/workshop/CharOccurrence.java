package com.bl.workshop;

import java.util.Scanner;

public class CharOccurrence {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            System.out.print("Enter a character: ");
            char inputChar = scanner.next().charAt(0);

            int count = countCharOccurrence(inputString, inputChar);
            System.out.println("The character '" + inputChar + "' occurs " + count + " times in the string.");
        }

        public static int countCharOccurrence(String inputString, char inputChar) {
            int count = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == inputChar) {
                    count++;
                }
            }
            return count;
        }
    }
