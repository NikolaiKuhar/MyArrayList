package Array;

import java.util.Arrays;

/**
 * Implementation of {@link MyArray}.
 * Date 04.01.2022
 *
 * @author Kukhar Nikolai
 */

public class MyArrayListImpl<E> implements MyArray<E>{

    private E[] ar;
    private int size = 0;

    @Override
    public E get(int index) {
        checkIndex(index);
        return ar[index];
    }

    @Override
    public void add(E elem) {
        checkLength();
        ar[size++] = elem;

    }

    @Override
    public void add(E elem, int index) {
        checkLength();
        for (int i = size; i > index; i--) {
            ar[i] = ar[i-1];
        }
        ar[index] = elem;
        size++;
    }

    @Override
    public void remove(E elem) {
        int pos = Index(elem);

        if(pos < 0){
            return;
        }

        remove(pos);
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
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
    public void set(E elem, int index) {
        ar[index] = elem;
    }

    @Override
    public void clear() {
        size = 0;

    }
    private int Index(E elem){
        if (elem == null)
            return -1;

        for (int i = 0; i < size; i++) {
            if(elem.equals(ar[i]))
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
            ar = (E[]) new Object[10];
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

    private void quickSort(E[] array, int low, int high) {
        if (ar.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        E opora = ar[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (((Comparable)ar[i]).compareTo(opora) < 0) {
                i++;
            }

            while (((Comparable)ar[j]).compareTo(opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                E temp = ar[i];
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
