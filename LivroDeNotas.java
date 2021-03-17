public class LivroDeNotas{

    //variável de instância
    //instância = objeto
    private String nomeDoCurso;

    public LivroDeNotas(String nomeDoCurso){
      setNomeDoCurso(nomeDoCurso);
    }


    public void setNomeDoCurso(String nomeDoCurso){
      //shadowing
      if (nomeDoCurso.length() >= 8)
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso (){
      return this.nomeDoCurso;
    }



    public void exibirMensagem (){
      System.out.printf("Bem vindo ao livro de notas do curso %s\n", getNomeDoCurso());
    }
    /*def exibirMensagem (self):
      print ("Bem vindo ao livro de notas")*/
}