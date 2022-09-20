package test.homework14;

public interface ArraysExample<MyGeneric> {
    void add(MyGeneric value);

    MyGeneric[] remove(int index);

    MyGeneric[] clear();

    int size();

    MyGeneric get(int index);
}
