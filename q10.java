import java.io.FileWriter; 
public class Main { 
 public static void main(String[] args) throws Exception { 
 FileWriter escritor = new FileWriter("alunos.txt"); 
 escritor.write("Ana\n"); 
 escritor.write("João\n"); 
 escritor.write("Maria\n"); 
 escritor.close(); 
 } 
}
