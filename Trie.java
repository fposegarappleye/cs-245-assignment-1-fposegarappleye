import java.util.*;
import java.util.HashMap;
import java.util.Map;


public class Trie {
  Node root;

  // CONSTRUCTORS
  public Trie() {
    root = new Node(); // Starts by creating null root Node
  }

  /*Add:
  =========
  Adds new nodes as required, for each letter. Sets last's isWord to true
  */
  public void add(String str) {
    // Retrieve the children HashMap from the root node
    HashMap<Character, Node> children = root.children;
    // For each character of 'i'...
    for(int i = 0 ; i < str.length() ; i++) {
      // Grabs letter from the string (esp. for comparisons)
      Character letter = str.charAt(i);
      // Grabs the node (esp. for comparisons, recursion) // TODO: Is this bit necessary
      Node node;
      // If the letter node DNE
      if(!children.containsKey(letter)) {
        // Create a new Node from the letter
        node = new Node(letter);
        // Put the new Node into the children list
        children.put(letter, node);
        //System.out.println("[" + letter + "] added" ); // TODO: Nullify (testing purposes)
      } else {
        // If the letter does exist, retrieve the child
        node = children.get(letter);
      }
      // if the end of the String "str" input is reached
      if(i == str.length()-1) {
        // Set the "isWord" of the last node to true, signifying that it is a valid word
        node.isWord = true;
        //System.out.println("+ " + str); // TODO: Nullify (testing purposes)
      }
      // Retrieve children of the (new) node, move a layer forward
      children = node.children;
    }
  }


  /*Contains:
    ========
    Essentially a search function.
  */
  boolean contains(String str) {
    Node node = root;
    for(int i = 0 ; i < str.length() ; i++) {
      // Check if the letter matches
      if(node.isWord && i == str.length()) return true;
      if(node.children.containsKey(str.charAt(i))) node = node.children.get(str.charAt(i));
      else return false;
    }
    return true;
  }


  /*Suggest:
    ========
    Provides suggestion based on close spellings
  */
  String suggest(String str) {
    if(contains(str)) return str;
    for(int i = 0 ; i < str.length() ; i++) {
      // If the current char of str does not exist as a node
      node.children.forEach((Character, Node) ->
        

      )
      if()
    }
    return "";
  }

  /*
  String suggest(String str) {
    // If str DNE, suggest nothing
    // If it exists, return it.
    if(this.contains(str)) return str;
    else return suggest(root, str, 0, 0);
    // If it DNE, recursively calculate edit distance
  }

  String suggest(Node node, String str, int inDiff, int inI) {
    // If it DNE, recursively calculate edit distance
    int i = inI;
    int diff = inDiff;
    char c = str.charAt(i);
    if(diff > 3) return null;


    // REGULAR CASE
    if(node.has(c)) {
      System.out.print(c); // TODO: Remove from code. Used for clarification
      suggest(node.get(c), str, diff, i+1);
    }


    // SUBSTITUTION
    // If expected node is not found
    if(!node.has(c)) {
      // Immediate: iterate diff by +1
      /
      // Check each child of the node to see if it matches w/ next char

      //node.children.forEach((Character, Node) -> {suggest(node, str, diff, i);});
    }
    return null;
  }
  */
}
