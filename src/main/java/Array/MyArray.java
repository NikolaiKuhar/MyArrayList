package Array;

public interface MyArray<E> {
        E get(int index);
        void add(E elem);
        void add(E elem, int index);
        void remove(E elem);
        void remove(int index);
        int size();
        void set(E elem, int index);
        void clear();

        void quickSort();
}
