import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Digite o número de matrícula do aluno: ");
        String numeroMatricula = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento do aluno (dd/mm/aaaa): ");
        String dataNascimentoStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        
        System.out.print("Digite o código do curso: ");
        String codigoCurso = scanner.nextLine();

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();

        System.out.print("Digite a data de início do curso (dd/mm/aaaa): ");
        String dataInicioStr = scanner.nextLine();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        
        Aluno aluno = new Aluno(numeroMatricula, nome, dataNascimento);
        Curso curso = new Curso(codigoCurso, nomeCurso, dataInicio);

       
        System.out.print("Digite a data de matrícula (dd/mm/aaaa): ");
        String dataMatriculaStr = scanner.nextLine();
        LocalDate dataMatricula = LocalDate.parse(dataMatriculaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Matricula matricula = new Matricula(aluno, curso, dataMatricula);

     
        if (matricula.isAlunoMaiorDeIdade()) {
            System.out.println("Aluno matriculado com sucesso.");
        } else {
            System.out.println("Aluno não é maior de idade.");
        }

      
        System.out.println("\nDados do Aluno:");
        System.out.println(aluno);

        System.out.println("\nDados do Curso:");
        System.out.println(curso);

        System.out.println("\nDados da Matrícula:");
        System.out.println(matricula);

        scanner.close();
    }
}
