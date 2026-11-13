import java.util.ArrayList; 
import java.util.Collections; 
public class Main { 
 public static void main(String[] args) { 
 ArrayList<String> nomes = new ArrayList<>(); 
 nomes.add("Carlos"); nomes.add("Ana"); nomes.add("Pedro"); 
 nomes.add("Maria"); nomes.add("João"); 
 Collections.sort(nomes); 
 System.out.println(nomes); 
 } 
}


