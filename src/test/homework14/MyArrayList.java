package test.homework14;

import java.util.Arrays;

@SuppressWarnings("all")
public class MyArrayList<MyGeneric> implements ArraysExample<MyGeneric> {
    private MyGeneric[] values;

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    public MyArrayList() {
        values = (MyGeneric[]) new Object[0];
    }

    @Override
    public void add(MyGeneric value) {
        MyGeneric[] temporary = values;
        values = (MyGeneric[]) new Object[temporary.length + 1];
        System.arraycopy(temporary, 0, values, 0, temporary.length);
        values[values.length - 1] = value;
    }


    @Override
    public MyGeneric[] remove(int index) {
        MyArrayList<MyGeneric> myArrayList = new MyArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (i == index) {
                continue;
            }
            myArrayList.add(values[i]);
        }
        values = (MyGeneric[]) new Object[myArrayList.size()];
        for (int i = 0; i < myArrayList.size(); i++) {
            values[i] = myArrayList.get(i);
        }
        return values;
    }

    @Override
    public MyGeneric[] clear() {
        values = (MyGeneric[]) new Object[0];
        return values;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public MyGeneric get(int index) {
        return values[index];
    }
}
