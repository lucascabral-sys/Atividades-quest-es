import java.util.ArrayList; 
class Produto { 
 String nome; double preco; 
 Produto(String nome, double preco) { 
 this.nome = nome; this.preco = preco; 
 } 
} 
public class Main { 
 public static void main(String[] args) { 
 ArrayList<Produto> produtos = new ArrayList<>(); 
 produtos.add(new Produto("Caderno", 25)); 
 produtos.add(new Produto("Caneta", 3)); 
 produtos.add(new Produto("Mochila", 100)); 
 for (Produto p : produtos) 
 System.out.println(p.nome + " - R$ " + p.preco); 
 } 
}

