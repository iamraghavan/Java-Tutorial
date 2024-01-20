package OOPS;

import java.util.Scanner;
import java.io.*;

public class FileHandling {

    public static void main(String[] args) {

        try {
            File f = new File("G:\\Java\\OOPS\\Vanakam.txt");
            Scanner reader = new Scanner(f);

            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }

        }catch (Exception e){
            System.out.println(e);
        }


    }
}
