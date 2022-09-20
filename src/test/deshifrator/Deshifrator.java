package test.deshifrator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Deshifrator {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(deshifrator("src/test/deshifrator/verse"));
    }

    private static String getFile(String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String verse = "";
        while (scanner.hasNextLine()) {
            verse += "\n " + scanner.nextLine();
        }
        scanner.close();
        return verse;
    }

    private static String deshifrator(String path)throws FileNotFoundException{
        String verse = getFile(path);
        String[] pretext = {"в", "из", "с", "а", "так", "бы", "под", "на", "до", "у"};

        String[] newVerse = verse.split(" ");
        String newVerseOrigin = "";
        for (int e = 0; e < newVerse.length; e++) {
            for (int y = 0; y < pretext.length; y++) {
                if (newVerse[e].toLowerCase().equals(pretext[y])) {
                    newVerse[e] = "JAVA";
                }
            }
        }
        for (int r = 0; r < newVerse.length; r++) {
            newVerseOrigin += " " + newVerse[r];
        }
        return newVerseOrigin;
    }
}

