package Dao;

import hibernate.Categoria;
import jakarta.persistence.EntityManager;

public class CategoriaDao {

	private EntityManager em;

	public CategoriaDao(EntityManager controler) {
		this.em = controler;
	}

	public void cadastro(Categoria categoria){
		this.em.persist(categoria);
	}

	public void atualizar(Categoria categoria){
		this.em.merge(categoria);
	}
}
