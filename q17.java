import java.util.ArrayList; 
class Disciplina { 
 String nome; 
 Disciplina(String nome) { this.nome = nome; } 
} 
class Professor { 
 String nome; 
 ArrayList<Disciplina> disciplinas = new ArrayList<>(); 
 Professor(String nome) { this.nome = nome; } 
} 
public class Main { 
 public static void main(String[] args) { 
 Professor professor = new Professor("Carlos"); 
 professor.disciplinas.add(new Disciplina("Java")); 
 professor.disciplinas.add(new Disciplina("Banco de Dados")); 
 System.out.println(professor.nome); 
 for (Disciplina d : professor.disciplinas) 
 System.out.println(d.nome); 
 } 
}

