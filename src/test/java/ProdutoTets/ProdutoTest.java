package ProdutoTets;

import Dao.CategoriaDao;
import Dao.ProdutoDao;
import Util.JPAUtil;
import hibernate.Categoria;
import hibernate.Produto;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class ProdutoTest {

	public static void main(String[] args) {

		cadastrarProduto();
		Long id = 1L;
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);

	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto pr = new Produto("phone","Apple",new BigDecimal("800"), celulares);

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);


		em.getTransaction().begin();

		em.persist(celulares);
		celulares.setNomeCategoria("CAPINHA");

		em.persist(pr);

		categoriaDao.cadastro(celulares);
		produtoDao.cadastro(pr);

		em.flush();
		em.clear();

		celulares = em.merge(celulares);
		celulares.setNomeCategoria("CARREGADOR");
		em.flush();
		em.remove(celulares);
		em.flush();
	}
}
