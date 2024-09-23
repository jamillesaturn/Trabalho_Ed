        import java.util.Scanner;
       
       public class Main{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma(10);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1.Adiciona Aluno");
            System.out.println("2.Remover Aluno");
            System.out.println("3.lista Aluno");
            System.out.println("4.Ordenar por Média Final");
            System.out.println("5.Ordenar por Matrícula");
            System.out.println("6.Buscar Aluno por Matrícula");
            System.out.println("0.Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Coloque  a matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Coloque o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Coloque a nota final do aluno: ");
                    double notaFinal = scanner.nextDouble();
                    Aluno aluno = new Aluno(matricula, nome, notaFinal);
                    turma.incluirAluno(aluno);
                    break;
                case 2:
                    System.out.print("Coloque a matrícula do aluno a ser removido: ");
                    matricula = scanner.nextLine();
                    turma.removerAluno(matricula);
                    break;
                case 3:
                    System.out.println("Alunos na turma:");
                    turma.listarAlunos();
                    break;
                case 4:
                 
                case 5:
                    
                case 6:
                   
                case 0:
                    System.out.println("Saindo");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Gamer over ");
            }
        }
    }
}
