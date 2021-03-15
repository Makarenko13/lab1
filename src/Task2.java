/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Task2
  @version  1.0.0
  @since 14.03.2021 - 20.55
*/
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {

        // download a content
        String content = new String(Files.readAllBytes(Paths.get
                ("C:\\Users\\User\\OneDrive\\Рабочий стол.harry.txt")));

        content = content.replaceAll("[^A-Za-z ' ]", "");

        String[] words = content.split(" ");
        String[] lines = content.split("\n");


        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry")){
                counter++;
            }
        }
        System.out.println("Count: " + content);  //1084

        }

    }
