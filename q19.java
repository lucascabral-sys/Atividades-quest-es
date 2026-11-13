import java.util.HashSet; 
import java.util.Set; 
public class Main { 
 public static void main(String[] args) { 
 Set<String> produtos = new HashSet<>(); 
 produtos.add("A10"); produtos.add("B20"); 
 produtos.add("A10"); produtos.add("C30"); produtos.add("B20"); 
 System.out.println(produtos); 
 } 
}

