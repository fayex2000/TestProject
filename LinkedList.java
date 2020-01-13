import java.util.ArrayList;

class Node<T>{
  T value;
  
  Node prev;
  Node next;
  
  Node(T str)
  {
    this.value = str;
  }
  
}

class LinkedList <T>{
  
  Node head;
  Node end;
  
  void add(T value)
  {
    Node nd = new Node<T> (value);
    
    if (nd != null)
    {
      if (head == null || end == null)
      {
        head = nd;
        end = nd;
        return;
      }
      
      end.next = nd;
      nd.prev = end.prev;
      end = nd;
       
    }
    
  }
  
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java ");

    LinkedList lst = new LinkedList<String>();
    
    for (String string : strings) {
      lst.add(string);
      
    }
    
    System.out.println(lst.end.value);
    
    
  }
}

