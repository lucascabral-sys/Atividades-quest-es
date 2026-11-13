import java.util.ArrayList; 
public class Main { 
 public static void main(String[] args) { 
 ArrayList<String> frutas = new ArrayList<>(); 
 frutas.add("Maçã"); frutas.add("Banana"); 
 frutas.add("Laranja"); frutas.add("Uva"); 
 frutas.set(1, "Manga"); 
 frutas.remove("Laranja"); 
 System.out.println(frutas); 
 } 
}
