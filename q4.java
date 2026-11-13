import java.util.ArrayList; 
public class Main { 
 public static void main(String[] args) { 
 ArrayList<String> nomes = new ArrayList<>(); 
 nomes.add("Ana"); nomes.add("Maria"); nomes.add("João"); 
 nomes.add("Carlos"); nomes.add("Pedro"); 
 System.out.println(nomes.contains("Maria")); 
 nomes.remove("Pedro"); 
 System.out.println(nomes.size()); 
 } 
}
