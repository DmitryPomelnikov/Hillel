package test.homework13.file;

public class DOCHandler extends AbstractHandler{
    void open() {
        System.out.println("Open DOC file");
    }

    void create() {
        System.out.println("Create DOC file");
    }

    void change() {
        System.out.println("Change DOC file");
    }

    void save() {
        System.out.println("Save DOC file");
    }
}
