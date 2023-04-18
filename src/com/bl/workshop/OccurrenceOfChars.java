package com.bl.workshop;
import java.util.Scanner;

//user input for string in main method
//create non static method for logic where you have to check occuerence of char from array
//A,E,i,O,u,S,h
    public class OccurrenceOfChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        OccurrenceOfChars occurrence = new OccurrenceOfChars();
        occurrence.checkOccurrence(str);
    }

    public void checkOccurrence(String str) {
        char[] arr = {'A', 'E', 'i', 'O', 'u', 'S', 'h'};
        int[] count = new int[arr.length];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (ch == arr[j]) {
                    count[j]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (count[i] > 0) {
                System.out.println("Occurrence of " + arr[i] + " is " + count[i] + " times.");
            }
        else if (count[i] == 0) {
              //  System.out.println("no matches found");
            }

            }
              System.out.println("no matches found");
        }
    }





