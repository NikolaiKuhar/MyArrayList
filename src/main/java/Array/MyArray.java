package Array;

public interface MyArray {
        String get(int index);
        void add(String string);
        void add(String string, int index);
        void remove(String string);
        void remove(int index);
        int size();
        void set(String string, int index);
        void clear();
}
