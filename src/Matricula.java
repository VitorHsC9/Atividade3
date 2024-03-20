import java.time.LocalDate;
import java.time.Period;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private LocalDate dataMatricula;

    public Matricula(Aluno aluno, Curso curso, LocalDate dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

    public boolean isAlunoMaiorDeIdade() {
        int idade = Period.between(aluno.getDataNascimento(), dataMatricula).getYears();
        return idade >= 18;
    }
	
}
