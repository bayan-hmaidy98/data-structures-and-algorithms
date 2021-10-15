package java.code_challenge05.app.src.main.java;


public class Node <T>{
  Node <T> nextReference;
  public T value;

  public Node(T value){
    this.value = value;
  }
}
