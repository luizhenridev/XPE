package gestaoacademica;

public class Aluno extends Pessoa implements Seguranca{
    private float notamedia;
    private float nps;
    private String user;
    private String senha;

    //polimorfismo de sobrecarga
    public Aluno(float a, float b, int x, String y, String w){
        super(x, y, w);
        this.notamedia=a;
        this.nps=b;

    }

    public Aluno(int x, String y, String w){
        super(x, y, w);
        this.notamedia=10;
        this.nps=10;

    }

    //get e set
    public float getNotaMedia(){
        return this.notamedia;
    }
    public float getNps(){
        return this.nps;
    }
    public String getSenha(){
        return this.senha;
    }
    public String getUser(){
        return this.user;
    }


    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    public void setUser(String novoUser){
        this.senha = novoUser;
    }
    public void setNotaMedia(float novaNota){
        this.notamedia = novaNota;
    }
    public void setNps(float novoNps){
        this.nps = novoNps;
    }

    //metodo
    @Override
    public void impressao(){
        System.out.println("Dados de aluno");
        System.out.println("Nome"+this.getNome());
        System.out.println("Idade"+this.getIdade());
        System.out.println("Curso"+this.getCurso());
        System.out.println("Nota Média"+notamedia);
        System.out.println("NPS"+nps);
        
        System.out.println();
    }

    @Override
    public void senha(){
        this.user = "aluno";
        this.senha="12";

    }


    
}
