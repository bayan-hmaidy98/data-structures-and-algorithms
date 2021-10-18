package java.code_challenge05.app.src.main.java;

import java.util.Objects;

public class LinkedList <T> {
int size =0;
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

  public void append(String value) {
    Node newNode = new Node(value);

    if (size == 0) {
      head = newNode;
    } else {

      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);

    }
    size++;
  }


  public void insertBefore(String value, String newValue) {

    if (includes((T) value)) {
      Node newNode = new Node(newValue);
      Node current = head;
      Node previous = head;
      while (!Objects.equals(previous.getNext().getData(), value)) {
        previous = previous.getNext();
      }
      current = previous.getNext();
      previous.setNext(newNode);
      newNode.setNext(current);
      size++;

    }


  }


  public void insertAfter(String value, String newValue) {

    if (includes((T) value)) {
      Node newNode = new Node(newValue);
      Node current = head;
      Node previous = head;
      while (!Objects.equals(previous.getData(), value)) {
        previous = previous.getNext();
      }
      current = previous.getNext();
      previous.setNext(newNode);
      newNode.setNext(current);
      size++;

    }


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
