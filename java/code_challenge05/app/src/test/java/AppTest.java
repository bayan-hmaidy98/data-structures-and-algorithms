package java.code_challenge05.app.src.test.java;

import org.junit.jupiter.api.Test;

import java.code_challenge05.app.src.main.java.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {


    LinkedList testLinkedTest = new LinkedList();
    LinkedList test2 = new LinkedList();
    @Test
    void emptyLinkedList(){
      assertNull(this.testLinkedTest.head);
    }



    @Test
  void testInsertMethod(){
      testLinkedTest.insert(1);
      testLinkedTest.insert(2);
      testLinkedTest.insert(3);
      assertEquals(this.testLinkedTest.head.value, 3);
    }
  @Test
  void headPointer(){
    assertTrue(this.testLinkedTest.head.value == "3");
  }
  @Test
  void insertMultiple(){
      int size =0;
      for(int i = 0; i < 3; i++){
         test2.insert(i);
         size++;
      }
      assertTrue(size == 2);

  }




    @Test
  void testIncludeMethod(){
      assertTrue(testLinkedTest.includes(3), "Node is found");
      assertFalse(testLinkedTest.includes(5), "Node not found");
    }

  @Test public void IndexGreaterThanTheLength(){
    testLinkedTest.insert("Bayan");
    testLinkedTest.append("Emad");
    testLinkedTest.append("Hmaidy");

    String output = testLinkedTest.kth(5);
    String expected = "Not valid index";
    assertEquals(expected,output);
  }

  @Test public void IndexEqualsTheLength(){
    testLinkedTest.insert("Bayan");
    testLinkedTest.append("Emad");
    testLinkedTest.append("Hmaidy");

    String output = testLinkedTest.kth(3);
    String expected = "Not valid index";
    assertEquals(expected,output);
  }

  @Test public void IndexIsNegativeNumber(){
    testLinkedTest.insert("Bayan");
    testLinkedTest.append("Emad");
    testLinkedTest.append("Hmaidy");

    String output = testLinkedTest.kth(-1);
    String expected = "Not valid index";
    assertEquals(expected,output);
  }
  @Test public void  LinkedListLengthEqualsOne(){
    testLinkedTest.insert("Bebo");

    String output = testLinkedTest.kth(0);
    String expected = "Bebo";
    assertEquals(expected,output);
  }
  @Test public void HappyPath(){
    testLinkedTest.insert("Bayan");
    testLinkedTest.append("Emad");
    testLinkedTest.append("Hmaidy");

    String output = testLinkedTest.kth(2);
    String expected = "Hmaidy";
    assertEquals(expected,output);
  }

  @Test
  void testToStringMethod(){
      assertTrue(testLinkedTest.toString() == "{ 3 } -> { 2 } -> { 1 } -> NULL");
    }

  }




