package mak.edu;/*
  @author   Yelyzaveta Makarenko
  @project   lab1
  @class  Task3
  @version  1.0.0
  @since 15.03.2021 - 19.06
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task3 {

        public static void main(String[] args) throws IOException {

            // download a content
            String content = new String(Files.readAllBytes(Paths.get
                    ("C:\\Users\\User\\OneDrive\\Рабочий стол.harry.txt")));
                    content = content.replaceAll("[^A-Za-z ' ]", "");


            String stringOfDistincts = "";

            for (int i = 0; i < content.length; i++) {
                if (!stringOfDistincts.contains(content[i])) {
                    stringOfDistincts += content[i] + " ";
                }
            }
            String[] distincts = stringOfDistincts.split(" ");

            Arrays.sort(distincts);
            System.out.println(distincts.length);
            for (int i = 0; i < 100 ; i++) {
                System.out.println(distincts[i]);
            }


        }
}

