package Util;

import jakarta.persistence.*;

public class JPAUtil {

	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("pr");

	public static EntityManager getEntityManager(){
		return FACTORY.createEntityManager();
	}
}
