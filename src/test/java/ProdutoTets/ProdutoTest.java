package ProdutoTets;

import Dao.ProdutoDao;
import Util.JPAUtil;
import hibernate.Produto;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class ProdutoTest {

	public static void main(String[] args) {
		Produto pr = new Produto();
		pr.setNome("phone");
		pr.setDesscricao("Apple");
		pr.setPreco(new BigDecimal("800"));

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);

		em.getTransaction().begin();
		dao.cadastro(pr);
		em.getTransaction().commit();
		em.close();
	}
}
