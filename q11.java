import java.io.FileWriter; 
import java.io.PrintWriter; 
public class Main { 
 public static void main(String[] args) throws Exception { 
 PrintWriter escritor = new PrintWriter(new FileWriter("produtos.txt")); 
 escritor.println("Caderno"); 
 escritor.println("Caneta"); 
 escritor.println("Mochila"); 
 escritor.close(); 
 } 
}
