package test.homework13.file;

public class TXTHandler extends AbstractHandler {
    void open() {
        System.out.println("Open TXT file");
    }

    void create() {
        System.out.println("Create TXT file");
    }

    void change() {
        System.out.println("Change TXT file");
    }

    void save() {
        System.out.println("Save TXT file");
    }
}
