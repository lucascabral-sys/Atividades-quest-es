import java.io.*; 
class Produto implements Serializable { 
 String nome; double preco; 
 Produto(String nome, double preco) { 
 this.nome = nome; this.preco = preco; 
 } 
} 
public class Main { 
 public static void main(String[] args) throws Exception { 
 Produto produto = new Produto("Notebook", 3500.00); 
 ObjectOutputStream escritor = new ObjectOutputStream( 
 new FileOutputStream("produto.dat") 
 ); 
 escritor.writeObject(produto); 
 escritor.close(); 
 } 
}
