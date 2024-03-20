import java.time.LocalDate;

public class Curso {
    private String codigoCurso;
    private String nomeCurso;
    private LocalDate dataInicio;

    public Curso(String codigoCurso, String nomeCurso, LocalDate dataInicio) {
        this.codigoCurso = codigoCurso;
        this.nomeCurso = nomeCurso;
        this.dataInicio = dataInicio;
    }

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

    
}
