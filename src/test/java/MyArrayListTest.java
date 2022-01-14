import Array.MyArray;
import Array.MyArrayListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArray<String> myArray;

    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        myArray = new MyArrayListImpl<>();
        for (int i = 0; i < 100; i++) {
            myArray.add("string-" + i);
        }
    }

    @Test
    public void whenAdd100ThenSize (){
        assertEquals(100, myArray.size());
    }

    @Test
    public void whenStringRemovedByIndexThenSize (){
        myArray.remove(4);
        assertEquals(99, myArray.size());
    }

    @Test
    public void whenStringRemoveThenSize() {
        String strTest = "Test";
        myArray.add(strTest);
        assertEquals(101, myArray.size());
        myArray.remove(strTest);
        assertEquals(100, myArray.size());
    }

    @Test
    public void whenNoExistentStringRemoveThen() {
        String strTest = "Test";
        myArray.remove(strTest);
        assertEquals(100, myArray.size());
    }

    @Test
    public void whenClearThenSize (){
        myArray.clear();
        assertEquals(0, myArray.size());
    }

    @Test
    public void whenIndexThenException (){
        assertThrows(IndexOutOfBoundsException.class,
                ()-> {
                    myArray.get(100);
                });
    }

    @Test
    public void methodGet (){
        assertEquals("string-1" , myArray.get(1));
    }

    @Test
    public void insertMiddle(){
        //Given
        String strTest = "Test";
        //When
        myArray.add(strTest, 50);
        //Then
        String strList = myArray.get(50);
        assertEquals("Test", strList);
        assertEquals(101, myArray.size());
    }

    @Test
    public void insertMFirst(){
        String strTest = "Test";
        myArray.add(strTest, 0);
        String strList = myArray.get(0);
        assertEquals("Test", strList);
    }

    @Test
    public void insertLast(){
        String strTest = "Test";
        myArray.add(strTest, 100);
        String strList = myArray.get(100);
        assertEquals("Test", strList);
    }

    @Test
    public void setIntoMiddle() {
        //Given
        String strTest = "Test";
        //When
        myArray.set(strTest, 50);
        //Then
        String strList = myArray.get(50);
        assertEquals("Test", strList);
        assertEquals(101, myArray.size());
    }



}
