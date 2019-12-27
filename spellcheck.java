import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class spellcheck {
  public static void main(String[] args) {
    Trie trie = new Trie();
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader("english.0"));
      String line = reader.readLine();
      while(line != null) {
        if(!line.equals("")) {
          trie.add(line);
        }
        // next line
        line = reader.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Sugg: " + trie.suggest("duck"));
    System.out.println("\nSugg: " + trie.suggest("ducc"));


  }
}
