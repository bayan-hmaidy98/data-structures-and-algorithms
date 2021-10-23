package java.code_challenge05.app.src.main.java;

public class LinkedList <T> {

  public Node head;


  public void insert(T value){
    Node first = new Node(value);
    if (head == null){
      head = first;
    }
    else{
      first.next = head;
      head = first;
    }
  }

  public boolean includes(T value){
    Node current = head;
    while(current != null){
      if(current.value.equals(value)){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    Node current = head;
    String output = "";
    while (current.next != null){
      output+= "{ " + current + " }" + " -> ";
      currentNode = current.next;
    }
    output+= "Null";
    return output;
  }
}
