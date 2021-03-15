package mak.edu;/*
  @author   User
  @project   lab1
  @class  Task5
  @version  1.0.0
  @since 15.03.2021 - 19.56
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) throws IOException {

        // download a content
        String content = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\User\\OneDrive\\Рабочий стол.harry.txt")));

        content = content.replaceAll("[^A-Za-z ' ]", "");

       String[] words = content.split(" ");
        System.out.println(words.length);

        
        String [] distincts = stringOfDistincts.split(" ");
        Arrays.sort(distincts);
        System.out.println(distincts.length);
        for (int i = 0; i < 100; i++) {

        }
        int [] hashes = new int[distincts.length];
        for (int i = 0; i < hashes.length; i++) {
            hashes[i] = distincts[i].hashCode();


        }


    }

}

