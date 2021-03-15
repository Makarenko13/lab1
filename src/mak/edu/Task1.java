package mak.edu;/*
  @author   User
  @project   lab1
  @class  Task1
  @version  1.0.0
  @since 15.03.2021 - 18.44
*/
import java.util.*;
import java.io.*;

public class Task1 {

    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(new FileReader("C:\\Users\\User\\OneDrive\\Рабочий стол.harry.txt"));
            PrintWriter output = new PrintWriter(new FileOutputStream(
                    "harry.txt"));

            int largestLenght = 0;
            String largestWord = "";
            String input = sc.nextLine();

            while (input.equals("")) {
                System.out.println("Please insert a String: ");
                input = sc.nextLine();
            }

            for (String b : input.split(" ")) {
                if (largestWord.length() == 0) {
                    largestLength = b.length();
                    largestWord = b;
                } else if (b.length() >= largestLength) {
                    largestLength = b.length();
                    largestWord = b;
                }
            }
            sc.close();
            System.out.println("Longest Word: " + largestWord);

        }

        public boolean isAlpha (String input){
            char[] chars = input.toCharArray();

            for (char c : chars) {
                if (!Character.isLetter(c)) {
                    return false;
                }
            }
            return true;
        }
    }