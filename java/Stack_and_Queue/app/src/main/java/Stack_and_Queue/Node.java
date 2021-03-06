package Stack_and_Queue.app.src.main.java.Stack_and_Queue;

public class Node <T> {

  private Node <T> next;

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  private T value;

  public Node( T value) {
    this.value = value;
  }

}
