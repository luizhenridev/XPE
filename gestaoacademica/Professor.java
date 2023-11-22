package gestaoacademica;

public class Professor extends Pessoa implements Seguranca{
    //public, private, protected, default 
    private int salario;
    private String user;
    private String senha;


    //construtor
    Professor(int x, String y, String w){
        super(x, y, w);//acessando o construtor da classe mãe
        salario=1000;

    }

    //metodos get e set
    public int getSalario(){
        return this.salario;
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
    public void setSalario(int novoSalario){
        if (novoSalario >(2*this.salario)){
            this.salario=this.salario*2;
        } else{
            this.salario = novoSalario;
        }
        
    }
    
    //metodos
    @Override
    public void impressao(){
        System.out.println("Dados de professor");
        System.out.println("Nome"+this.getNome());
        System.out.println("Idade"+this.getIdade());
        System.out.println("Curso"+this.getCurso());
        System.out.println("Salario"+salario);
        System.out.println();
    }
    @Override
    public void senha(){
        this.user = "prof";
        this.senha="1234";

    }
   

    


}