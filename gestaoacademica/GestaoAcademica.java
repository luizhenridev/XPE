package gestaoacademica;

public class GestaoAcademica {
    public static void main(String[] args){
        //crirar objeto
        //imprimir info
        //alterar as info
        //imprimir novamente

        Professor prof = new Professor(35,"Pedro","SI");
        Aluno aln = new Aluno(35, "Luiz", "SI");
        Aluno aln2 = new Aluno(8, 9, 35, "Pedro", "SI");
        prof.impressao();
        aln.impressao();
        aln2.impressao();

        //Polimorfismo de coersao
        Pessoa copia = (Pessoa) aln2;
        copia.impressao();

    }
}