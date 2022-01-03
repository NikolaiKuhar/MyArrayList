package Array;

import java.util.Arrays;

public class MyArrayListImpl implements MyArray{

    private String[] ar;
    private int size = 0;

    @Override
    public String get(int index) {
        checkIndex(index);
        return ar[index];
    }

    @Override
    public void add(String string) {
        checkLength();
        ar[size++] = string;

    }

    @Override
    public void add(String string, int index) {
        checkLength();
        for (int i = size; i > index; i--) {
            ar[i] = ar[i-1];
        }
        ar[index] = string;
        size++;
    }

    @Override
    public void remove(String string) {
        int pos = Index(string);

        if(pos < 0){
            return;
        }

        remove(pos);
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            ar[i] = ar[i+1];
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(String string, int index) {
        ar[index] = string;
    }

    @Override
    public void clear() {
        ar = new String[10];
        size = 0;

    }
    private int Index(String string){
        if (string == null)
            return -1;

        for (int i = 0; i < size; i++) {
            if(string.equals(ar[i]))
             return i;
        }

        return -1;
    }

    private  void checkIndex(int index){
        if(index <0 || index>= size){
            throw new IndexOutOfBoundsException();
        }
    }

    private void checkLength(){
        if (ar == null){
            ar = new String[10];
        }

        if(size >= ar.length){
            ar = Arrays.copyOf(ar, ar.length *2);
        }
    }

    @Override
    public String toString () {
        return Arrays.toString(Arrays.copyOf(ar, size));
    }

    public void quickSort(){
        quickSort(ar, 0, this.size - 1);
    }

    private void quickSort(String[] array, int low, int high) {
        if (ar.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        String opora = ar[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (ar[i].compareTo(opora)< 0) {
                i++;
            }

            while (ar[j].compareTo(opora)> 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                String temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(ar, low, j);

        if (high > i)
            quickSort(ar, i, high);
    }
}
