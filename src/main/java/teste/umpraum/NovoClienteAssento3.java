package teste.umpraum;

import infra.DAO;
import modelo.umpraum.BiAssento;
import modelo.umpraum.BiCliente;

public class NovoClienteAssento3 {

	public static void main(String[] args) {
		
		BiAssento assento = new BiAssento("6B");
		BiCliente cliente = new BiCliente("Renato", assento);
		
		DAO<BiCliente> dao = new DAO<>(BiCliente.class);
		dao.incluirAtomico(cliente);
	}
}
