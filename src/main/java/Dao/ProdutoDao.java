package Dao;

import hibernate.Produto;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ProdutoDao {

	private EntityManager controler;

	public ProdutoDao(EntityManager controler) {
		this.controler = controler;
	}

	public void cadastro(Produto produto){
		this.controler.persist(produto);
	}

	public Produto buscaDeProduto(Long id){
		return controler.find(Produto.class, id);
	}

	public List<Produto> buscarProduto(){
		String jpql = "SELECT * p FROM Produto p";
		return controler.createQuery(jpql, Produto.class).getResultList();
	}
}
