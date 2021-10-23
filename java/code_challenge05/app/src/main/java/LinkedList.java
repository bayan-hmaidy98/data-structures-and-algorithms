package java.code_challenge05.app.src.main.java;

import java.util.Objects;

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

  public void append(String value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
    } else {

      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);

    }

  }


  public void insertBefore(String value, String newValue) {

    Node current = head;
    while (current.getNext() != null){
      if(current.getNext().equals(value)){
        Node newNode = new Node(newValue);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        break;
      }
      else {
        current.getNext();
      }
    }
    System.out.println("Can't find the value to insert before it.");

  }


  public void insertAfter(String value, String newValue) {

    Node current = head;
    while (current.getNext() != null){
      if(current.equals(value)){
        Node newNode = new Node(newValue);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        break;
      }
      else {
        current.getNext();
      }
    }
    System.out.println("Can't find the value to insert after it.");

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
