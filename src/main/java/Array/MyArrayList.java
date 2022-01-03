package Array;

public class MyArrayList {
    public static void main(String[] args) {
        MyArrayListImpl  myArrayList = new MyArrayListImpl ();

        myArrayList.add("a");
        System.out.println("array size:" + myArrayList.size());

        myArrayList.add("b");
        System.out.println("array size:" + myArrayList.size());

        myArrayList.add("c", 1);
        System.out.println("array size:" + myArrayList.size());
        System.out.println(myArrayList);

        //----------------------------------------------
        myArrayList.remove(1);
        System.out.println("array size:" + myArrayList.size());
        System.out.println(myArrayList);

        myArrayList.remove("a");
        System.out.println("array size:" + myArrayList.size());
        System.out.println(myArrayList);


        //----------------------------------------------
        myArrayList.add("z");
        myArrayList.add("y");
        myArrayList.add("q");
        myArrayList.add("h");
        System.out.println("array size:" + myArrayList.size());
        System.out.println(myArrayList);
        myArrayList.quickSort();
        System.out.println("array size:" + myArrayList.size());
        System.out.println(myArrayList);

    }


}
