import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Professor, qual o nome do curso?");
    LivroDeNotas livroDeNotas;
    livroDeNotas = new LivroDeNotas(nome);
    livroDeNotas.exibirMensagem();


  }

  
  
  /*def hello (msg="oi"):
    print (msg)*/
}
