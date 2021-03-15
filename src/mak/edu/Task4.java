package mak.edu;/*
  @author   Yelyzaveta Makarenko
  @project   lab1
  @class  Task4
  @version  1.0.0
  @since 15.03.2021 - 19.12
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) throws IOException {

        // download a content
        String content = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\User\\OneDrive\\Рабочий стол.harry.txt")));
        System.out.println(content.substring(0, 100));
        System.out.println(content.length());
        content = content.replaceAll("[^A-Za-z ' ]", "");


        String[] words = content.split(" ");

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {

            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");

        int wordC = 0;

        for (int i = 0; i < distincts.length; i++) {
            if (lines[i].startsWith("C")) {
                wordC++;
            }
        }
        System.out.println(wordC);
    }
}
