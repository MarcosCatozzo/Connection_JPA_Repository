package Dao;

import hibernate.Produto;
import jakarta.persistence.EntityManager;

public class ProdutoDao {

	private EntityManager controler;

	public ProdutoDao(EntityManager controler) {
		this.controler = controler;
	}

	public void cadastro(Produto produto){
		this.controler.persist(produto);
	}
}
