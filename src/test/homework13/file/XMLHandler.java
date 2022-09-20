package test.homework13.file;

public class XMLHandler extends AbstractHandler {
    void open() {
        System.out.println("XML file are open");
    }

    void create() {
        System.out.println("Create XML file");
    }

    void change() {
        System.out.println("Change XML file");
    }

    void save() {
        System.out.println("Save XML file");
    }
}
