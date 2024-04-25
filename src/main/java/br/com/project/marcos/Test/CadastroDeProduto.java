package br.com.project.marcos.Test;

import br.com.project.marcos.produto.mode.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

	public static void main(String[] args){
		Produto celular = new Produto();
		celular.setNome("iphone");
		celular.setDescricao("novo");
		celular.setpreco(new BigDecimal(800));

		EntityManagerFactory Factory = Persistence.createEntityManagerFactory("produto");

		EntityManager val = Factory.createEntityManager();

		val.getTransaction().begin();
		val.persist(celular);
		val.getTransaction().commit();
		val.close();
	}
}
