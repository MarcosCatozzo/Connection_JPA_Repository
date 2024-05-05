package hibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	@Column(name="id")
	private long idCategoria;
	@Column(name="nome")
	private String nomeCategoria;

	public Categoria(){

	}

	public Categoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
}
