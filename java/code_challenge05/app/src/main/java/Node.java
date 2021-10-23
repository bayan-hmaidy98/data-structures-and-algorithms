package java.code_challenge05.app.src.main.java;


import java.awt.color.ICC_Profile;

public class Node <T>{
  Node <T> next;
  public T value;
  private String data;

  public Node(T value){
    this.value = value;
  }

  public Node getNext() {
    return nextReference;
  }

  public void setNext(Node next) {
    this.nextReference = next;
  }
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
