import java.util.HashSet; 
import java.util.Objects; 
import java.util.Set; 
class Produto { 
 String codigo, nome; double preco; 
 Produto(String codigo, String nome, double preco) { 
 this.codigo = codigo; this.nome = nome; this.preco = preco; 
 } 
 @Override 
 public boolean equals(Object obj) { 
 if (this == obj) return true; 
 if (!(obj instanceof Produto)) return false; 
 Produto outro = (Produto) obj; 
 return codigo.equals(outro.codigo); 
 } 
 @Override 
 public int hashCode() { return Objects.hash(codigo); } 
} 
public class Main { 
 public static void main(String[] args) { 
 Set<Produto> produtos = new HashSet<>(); 
 produtos.add(new Produto("P01", "Caderno", 25)); 
 produtos.add(new Produto("P02", "Caneta", 3.5)); 
 produtos.add(new Produto("P01", "Caderno Especial", 30)); 
 produtos.add(new Produto("P03", "Mochila", 120)); 
 System.out.println("Quantidade: " + produtos.size()); 
 } 
}
