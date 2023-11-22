package gestaoacademica;
//ABSTRAÇÃO: ABSTRACT
//NUNCA VAI SER INSTANCIADA DIRETAMENTE
//METODO ABSTRATO -- Tem apenas a assinatura
//HIERARQUIA DE CLASSE E PADRONIZAR

public abstract class Pessoa {
    private int idade;
    private String nome;
    private String curso;

    //construtor
    Pessoa(int x, String y, String w){
        idade = x;
        nome = y;
        curso = w;
    }

    public abstract void impressao();


    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCurso(){
        return this.curso;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setCurso(String novoCurso){
        this.curso = novoCurso;
    }
    
}
