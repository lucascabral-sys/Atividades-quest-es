import java.util.Scanner; 
public class Main { 
 public static void main(String[] args) { 
 Scanner entrada = new Scanner(System.in); 
 System.out.print("Nome: "); 
 String nome = entrada.nextLine(); 
 System.out.print("Idade: "); 
 int idade = entrada.nextInt(); 
 System.out.println("Olá, " + nome + "! Você tem " + idade + " anos."); 
 entrada.close(); 
 } 
}

