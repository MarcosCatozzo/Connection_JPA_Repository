package hibernate;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table (name = "produtos")
public class Produto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private long id;
	private String nome;
	@Column(name = "descricao")
	private String desscricao;
	private BigDecimal preco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesscricao() {
		return desscricao;
	}

	public void setDesscricao(String desscricao) {
		this.desscricao = desscricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
