package hibernate;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String nome;
	@Column(name = "descricao")
	private String desscricao;
	private BigDecimal preco;
	@ManyToOne
	private Categoria categoria;
	private LocalDate dataCadastro = LocalDate.now();

	public Produto(){

	}

	public Produto(String nome, String desscricao, BigDecimal preco, Categoria categoria) {
		this.nome = nome;
		this.desscricao = desscricao;
		this.preco = preco;
		this.categoria = categoria;
	}


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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
