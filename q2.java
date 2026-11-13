class Produto { 
 String nome; 
 double preco; 
 Produto(String nome, double preco) { 
 this.nome = nome; this.preco = preco; 
 } 
} 
public class Main { 
 public static void main(String[] args) { 
 Produto[] produtos = new Produto[3]; 
 produtos[0] = new Produto("Caderno", 25.00); 
 produtos[1] = new Produto("Caneta", 3.50); 
 produtos[2] = new Produto("Mochila", 120.00); 
 for (Produto produto : produtos) 
 System.out.println(produto.nome + " - R$ " + produto.preco); 
 } 
}
