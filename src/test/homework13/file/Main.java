package test.homework13.file;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String formatDoc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter document format: ");
        formatDoc = scanner.next().toUpperCase();
        scanner.close();

        switch (formatDoc) {
            case "DOC":
                AbstractHandler doc = new DOCHandler();
                doc.open();
                doc.create();
                doc.change();
                doc.save();
                break;
            case "XML":
                AbstractHandler xml = new XMLHandler();
                xml.open();
                xml.create();
                xml.change();
                xml.save();
                break;
            case "TXT":
                AbstractHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
                break;
            default:
                System.out.println("Failed format! Enter again!");
                break;
        }
    }
}
