public class Aluno {
    private String matricula;
    private String nome;
    private double mediaFinal;

    public Aluno(String matricula, String nome, double mediaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.mediaFinal = mediaFinal;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public double getMediaFinal() {
        return this.mediaFinal;
    }

    public String toString() {
        return "\nAluno: " +  "\nnome: " + nome + '\'' + "\nMatricula: " + matricula + '\''+
                "\nmediaFinal: " + mediaFinal;
    }
}
