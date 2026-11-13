import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
public class Main { 
 public static void main(String[] args) throws Exception { 
 Path arquivo = Path.of("texto.txt"); 
 Files.writeString(arquivo, "Programação é muito interessante!", StandardCharsets.UTF_8); 
 String texto = Files.readString(arquivo, StandardCharsets.UTF_8); 
 System.out.println(texto); 
 } 
}

