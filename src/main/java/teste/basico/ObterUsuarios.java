package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
//		List<Usuario> usuarios = em
//				.createQuery("SELECT u FROM Usuario u", Usuario.class)
//				.setMaxResults(3)
//				.getResultList();
		
		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(3);
		
		List<Usuario> usuarios = query.getResultList();
		
		usuarios.forEach(u -> System.out.println(u.getId() + ": " + u.getNome()));
		
		em.close();
		emf.close();
	}
}
