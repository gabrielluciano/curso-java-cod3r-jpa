package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Segundo parâmetro nesse caso é o Id, que foi definido com Long
		Usuario usuario = em.find(Usuario.class, 5L);
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}
}
