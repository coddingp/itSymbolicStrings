package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanUserLine = new Scanner(System.in);
        System.out.println("Enter a line below: ");
        String userLine = scanUserLine.nextLine(); //Иванов петр Семенович

        String[] userData = userLine.split(" ");

        StringBuilder nameAndInitials = new StringBuilder();

        for (int i = 0; i < userData.length; i++) {
            if (i < 1) {
                nameAndInitials.append(userData[i] + " ");
            } else nameAndInitials.append(userData[i].charAt(0)).append('.');
        }

        System.out.println(nameAndInitials);


        System.out.println("Введите ФИО через пробел: ");
//        String FIO = scan.nextLine();
//        String[] FIO2 = FIO.split(" ");
        System.out.println(userData[0] + " "
                + userData[1].substring(0, 1) + ". "
                + userData[2].substring(0, 1) + ".");


//        System.out.println(userLine);
//
//        String newLine = userLine.replace("а", "б");
//
//        System.out.println(newLine);
//
//        System.out.println(Arrays.toString(newLine.split(newLine)));
//
//        String[] words = newLine.split(" ");
//
//        System.out.println("There are " + words.length + " words found in the line");
//
//        int length = 0;
//        int indexOfLongestWord = 0;
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length() > length){
//                length = words[i].length();
//                indexOfLongestWord = i;
//            }
//        }
//
//        System.out.println("the longest word is " + words[indexOfLongestWord] + " consists of " + length + " letters");


    }
}
