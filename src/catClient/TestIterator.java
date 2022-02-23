import java.util.*;
import java.util.LinkedList;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new LinkedList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    collection.forEach((n) -> print(n));

    var iterator = collection.iterator();
    System.out.println("\n");
    while (iterator.hasNext()) {
      System.out.print(iterator.next().charAt(0) + " " );
    }
    
  }
  public static void print(String n)
  {
	  System.out.print(n.charAt(0) + " ");
  }
}