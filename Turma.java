public class Turma{
  private Aluno[] alunos;
  private int cont;

  public Turma(int tamanho){
    alunos = new Aluno[tamanho];
    cont = 0;
  }
 public void incluirAluno(Aluno aluno){
   if(cont < aluno.length){
     alunos[cont++] = aluno;
   }else{
     System.out.println("A turma está completa")
   }
 
   public void removerAluno(String matricula) {
        removerAlunoRecursivo(matricula, 0);
    }
   
  private void removerAlunoRecursivo(String matricula, int index) {
         if (index >= cont) {
            System.out.println("Esse aluno não está cadastrado.");
            return;
        }

        if (alunos[index].getMatricula().equals(matricula)) {
            alunos[index] = alunos[cont - 1];
            alunos[cont - 1] = null;
            cont--;
            return;
        }

        removerAlunoRecursivo(matricula, index + 1);
    }
 }
