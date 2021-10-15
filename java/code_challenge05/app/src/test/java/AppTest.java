package java.code_challenge05.app.src.test.java;

import org.junit.jupiter.api.Test;

import java.code_challenge05.app.src.main.java.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {


    LinkedList testLinkedTest = new LinkedList();

    @Test
  void testInsertMethod(){
      testLinkedTest.insert(1);
      testLinkedTest.insert(2);
      testLinkedTest.insert(3);
      assertEquals(this.testLinkedTest.head.value, 3);
    }

    @Test
  void testIncludeMethod(){
      assertFalse(testLinkedTest.includes(5), "Node not found");
    }
    @Test
  void testToStringMethod(){
      assertTrue(testLinkedTest.toString() == "{ 3 } -> { 2 } -> { 1 } -> NULL");
    }

  }
