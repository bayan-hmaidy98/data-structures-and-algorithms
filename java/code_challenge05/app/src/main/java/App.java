package java.code_challenge05.app.src.main.java;

public class App {
  public static void main(String[] args) {
    LinkedList <Integer> linkedList = new LinkedList<>();
    linkedList.insert(5);
    linkedList.insert(20);
    System.out.println(linkedList.toString());
    linkedList.insert(14);
    linkedList.insert(9);
    System.out.println(linkedList.includes(14));
    System.out.println(linkedList.includes(17));
    System.out.println(linkedList.toString());

  }
}
