public class Turma{
  private Aluno[] alunos; //criei um array de objetos do tipo Aluno, que vai armazenará os alunos da turma
  private int cont;// aqui so fiz um contador aonde vai acompanhar quantos alunos vão ser incluido na turma

  public Turma(int tamanho){
    alunos = new Aluno[tamanho];// Aquio array Aluno vai inicializa com tamanho especifico, no caso, quando cria a class main vamos dizer o tamanho da turma
    cont = 0; // aqui, fiz o cont recebe 0 por não ter aluno na turma
  }
 public void incluirAluno(Aluno aluno){
   if(cont < alunos.length){
     alunos[cont++] = aluno;// vou adiciona o aluno ao array na posição cont e incrementa "cont em 1".
   }else{ 
     System.out.println("A turma está completa") // Se o array estiver cheio quando cont é igual ao tamanho do array e vai imprimir dizendo que a turma tá completa
   }
 
   public void removerAluno(String matricula) {
        removerAlunoRecursivo(matricula, 0);//Chama o método auxiliar, passando a matrícula e começando a busca a partir do índice 0.
    }
   
  private void removerAlunoRecursivo(String matricula, int index) {
         if (index >= cont) {
            System.out.println("Esse aluno não está cadastrado.");
            return;
        }

        if (alunos[index].getMatricula().equals(matricula)) { // vai verificar se a matrícula do aluno na posição indice é igual à matrícula que está sendo removida.
            alunos[index] = alunos[cont - 1];// substitui o aluno removido pelo último aluno da lista
            alunos[cont - 1] = null; // vai remove a referência do último aluno e diminui o contador

            cont--;
            return;
        }

        removerAlunoRecursivo(matricula, index + 1);// Se o aluno não foi encontrado na posição atual, a gente vai chama recursivamente o método para o próximo índice.
  }
  public void listarAlunos() {
        listarAlunosRecursivo(0);
    }

    private void listarAlunosRecursivo(int index) {
        
        if (index >= cont) {
            return;
        }
        System.out.println(alunos[index]);
        
        listarAlunosRecursivo(index + 1); //imprime o aluno que está no índice atual do array
    }
