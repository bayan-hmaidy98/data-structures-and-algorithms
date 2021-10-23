package java.code_challenge05.app.src.main.java;

import java.util.Objects;

public class LinkedList <T> {
int size =0;
  public Node head;
  int counter =0;


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

    if (size == 0) {
      head = newNode;
    } else {

      Node currentNode = head;
      while (currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(newNode);

    }
    size++;
  }


  public void insertBefore(String value, String newValue) {

    if (includes((T) value)) {
      Node newNode = new Node(newValue);
      Node currentNode = head;
      Node previous = head;
      while (!Objects.equals(previous.getNext().getData(), value)) {
        previous = previous.getNext();
      }
      currentNode = previous.getNext();
      previous.setNext(newNode);
      newNode.setNext(current);
      size++;

    }


  }


  public void insertAfter(String value, String newValue) {

    if (includes((T) value)) {
      Node newNode = new Node(newValue);
      Node currentNode = head;
      Node previous = head;
      while (!Objects.equals(previous.getData(), value)) {
        previous = previous.getNext();
      }
      currentNode = previous.getNext();
      previous.setNext(newNode);
      newNode.setNext(currentNode);
      size++;

    }

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

  publi int kth(int k) throws NotValidIndex{

    if (counter == 0){

      ArrayList<int> arrayConverted = new ArrayList()<>;
      Node currentNode = head;
      while (currentNode != null){
        arrayConverted[i] = currentNode.value;
        currentNode = currentNode.nextReference;
      }
      int index = arrayConverted.size() - k -1;
      if (index < 0){
        throw new NotValidIndex(){
          "Not valid index" + k;
        }
        else {
          return arrayConverted[index];
        }
      }
    }
  }

  public Node getHead() {
    return head;
  }

  public static LinkedList zipLists(LinkedList list1, LinkedList list2) throws Exception {

    if (list1.size() == 0 && list2.size() == 0) {
      throw new Exception("Your Lists are empty");
    } else if (list2.size() == 0) {
      return list1;
    } else if (list1.size() == 0) {
      return list2;
    } else {

      Node c1 = list1.getHead();
      Node c2 = list2.getHead();
      Node t1, t2;


      while (c1.getNext() != null && c2 != null) {

        t1 = c1.getNext();
        t2 = c2.getNext();

        c1.setNext(c2);
        c2.setNext(t1);

        c1 = t1;
        c2 = t2;

        list1.size ++;

        if (c1.getNext() == null) {
          c1.setNext(c2);
          break;
        }

      }

      return list1;

    }


  }
}
