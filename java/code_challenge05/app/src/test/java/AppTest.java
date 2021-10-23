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
      testLinkedTest.insert(1);
      testLinkedTest.insert(2);
      testLinkedTest.insert(3);
      testLinkedTest.append(4);
      assertEquals(4, testLinkedTest.size());
    }

  @Test void testInsertBefore(){
    testLinkedTest.insert(1);
    testLinkedTest.insert(2);
    testLinkedTest.insert(3);
    testLinkedTest.insertBefore(2, 4);
    assertTrue(testLinkedTest.toString() == "{ 3 } -> { 4 } -> { 2 } -> { 1 } -> NULL");
  }

  @Test void testInsertAfter(){
    testLinkedTest.insert(1);
    testLinkedTest.insert(2);
    testLinkedTest.insert(3);
    testLinkedTest.insertAfter(3, 4);
    assertTrue(testLinkedTest.toString() == "{ 3 } -> { 4 } -> { 2 } -> { 1 } -> NULL");
  }

  }




