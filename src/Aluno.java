import java.time.LocalDate;

public class Aluno {
   
	private String numeroMatricula;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(String numeroMatricula, String nome, LocalDate dataNascimento) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

    
}
