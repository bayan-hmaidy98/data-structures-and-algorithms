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
  void testIncludeMethod(){
      assertTrue(testLinkedTest.includes(3), "Node is found");
      assertFalse(testLinkedTest.includes(5), "Node not found");
    }


  @Test
  void testToStringMethod(){
      assertTrue(testLinkedTest.toString() == "{ 3 } -> { 2 } -> { 1 } -> NULL");
    }

    @Test void testAppend(){
      testLinkedTest.clear();
      testLinkedTest.insert(1);
      testLinkedTest.insert(2);
      testLinkedTest.insert(3);
      testLinkedTest.append(4);
      assertEquals(4, testLinkedTest.size());
    }

  @Test void testInsertBefore(){
      testLinkedTest.clear();
    testLinkedTest.insert(1);
    testLinkedTest.insert(2);
    testLinkedTest.insert(3);
    testLinkedTest.insertBefore(2, 4);
    assertTrue(testLinkedTest.toString() == "{ 3 } -> { 4 } -> { 2 } -> { 1 } -> NULL");
  }

  @Test void testInsertAfter(){
    testLinkedTest.clear();
    testLinkedTest.insert(1);
    testLinkedTest.insert(2);
    testLinkedTest.insert(3);
    testLinkedTest.insertAfter(3, 4);
    assertTrue(testLinkedTest.toString() == "{ 3 } -> { 4 } -> { 2 } -> { 1 } -> NULL");
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
  void zippingLinkedListTest() {

    LinkedList list1 = new LinkedList();
    list1.append("Bayan");
    list1.append("Emad");
    list1.append("Hmaidy");

    LinkedList list2 = new LinkedList();
    list2.append("Noor");
    list2.append("Omar");
    list2.append("Bash");


    String testingString = LinkedList.zipLists(list1,list2).toString();

    assertEquals("{ Bayan } -> { Noor } -> { Emad } -> { Omar } -> { Hmaidy } -> { Bash } -> NULL",testingString);
    assertEquals(list1.toString(),testingString2);





    assertThrows(Exception.class, ()->LinkedList.zipLists(list3,list4));


  }

  }




