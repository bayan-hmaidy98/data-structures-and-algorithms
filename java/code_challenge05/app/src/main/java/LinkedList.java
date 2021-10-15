package java.code_challenge05.app.src.main.java;

public class LinkedList <T> {

  public Node head;

  // insert at the beginning, it would work even it's empty because the head next is null by default
  public void insert(T value){
    Node first = new Node(value);
    first.nextReference = head;
    head = first;
  }

  public boolean includes(T value){
    Node <T> currentNode = head;
    while(currentNode != null){
      if(currentNode.value.equals(value)){
        return true;
      }
      currentNode = currentNode.nextReference;
    }
    return false;
  }

  @Override
  public String toString() {
    Node currentNode = head;
    String output = "";
    while (currentNode.nextReference != null){
      output+= "{ " + currentNode + " }" + " -> ";
      currentNode = currentNode.nextReference;
    }
    output+= "Null";
    return output;
  }
}
