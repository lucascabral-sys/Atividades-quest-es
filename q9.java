import java.io.BufferedReader; 
import java.io.FileReader; 
public class Main { 
 public static void main(String[] args) throws Exception { 
 BufferedReader leitor = new BufferedReader(new FileReader("alunos.txt")); 
 String linha; 
 while ((linha = leitor.readLine()) != null) 
 System.out.println(linha); 
 leitor.close(); 
 } 
}
