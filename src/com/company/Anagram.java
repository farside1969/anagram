package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// class
public class Anagram {

// main method
    public static void main(String[] args) {

// create scanner
        Scanner scanner = new Scanner(System.in);

// user input string 1
        System.out.print("Enter String 1: ");
        // iterate s1
        String s1 = scanner.nextLine();

// user input string 2
        System.out.print("Enter String 2: ");
        // iterate s2
        String s2 = scanner.nextLine();

// compare string 1 and string 2 using boolean method below
        if (checkAnagram(s1, s2))
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        else
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
    }

// boolean method
    public static boolean checkAnagram(String s1, String s2) {

// remove spaces and convert to lower case
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

// compare to see if string 1 and string 2 are the same length
        if (s1.length() != s2.length())
            return false;

// create new ArrayList
        List<Character> list1 = new ArrayList<Character>();
        List<Character> list2 = new ArrayList<Character>();

// loop through indexed s1 input
        for (int i = 0; i < s1.length(); i++) {

            list1.add(s1.charAt(i));
        }

// loop through indexed s2 input
        for (int i = 0; i < s2.length(); i++) {

            list2.add(s2.charAt(i));
        }

// sort list1 and list2 for comparison
        Collections.sort(list1);
        Collections.sort(list2);

// compare list1 and list2 to see if they are equal
        if (list1.equals(list2))
            return true;
        else
            return false;
    }
}
