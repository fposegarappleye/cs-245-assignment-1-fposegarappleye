import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Node {
  char data;
  boolean isWord;
  HashMap<Character, Node> children = new HashMap<Character, Node>(); // Function runtime of hashmap is faster than iterating over a LinkedList, array of nodes takes a lot of space and is less reactive
  int count;

  // Constructors
  public Node(char c) {
    //children = new HashMap<Character, Node>();
    data = c;
    isWord = false;
    count = 0;
  }

  public Node() {
    //children = new HashMap<Character, Node>();
    isWord = false;
    count = 0;
  }

  Node get(char input) {
    if(this.children.containsKey(input)) return this.children.get(input);
    return null;
  }

  boolean has(char input) {
    return this.children.containsKey(input);
  }



}
