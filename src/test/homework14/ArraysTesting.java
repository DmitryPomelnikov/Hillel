package test.homework14;

public class ArraysTesting {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("World");
        myArrayList.add("Test");
        myArrayList.add("myArrayList");
        System.out.println(myArrayList.toString() + " - весь массив");

        System.out.println(myArrayList.get(2) + " - получить элемент под 2 индексом");
        System.out.println(myArrayList.size() + " - проверка длины до удаления элемента под индексом");

        myArrayList.remove(2);

        System.out.println(myArrayList.size() + " - проверка уменьшения длины на 1 после удаления одного элемента");
        System.out.println(myArrayList.get(2) + " - проверка смещения элементов");

        System.out.println(myArrayList.size() + " - проверка длины листа до удаления всех элементов");
        myArrayList.clear();
        System.out.println(myArrayList.size() + " - проверка обнуления");

        myArrayList.add("Checked");
        System.out.println(myArrayList.toString() + " - проверка перезаполнения листа");
    }
}
