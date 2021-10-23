package java.code_challenge05.app.src.main.java;


import java.awt.color.ICC_Profile;

public class Node <T>{
  Node <T> next;
  public T value;


  public Node(T value){
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

