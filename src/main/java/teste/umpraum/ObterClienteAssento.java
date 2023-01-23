package teste.umpraum;

import infra.DAO;
import modelo.umpraum.BiAssento;
import modelo.umpraum.BiCliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<BiCliente> daoCliente = new DAO<>(BiCliente.class);

		BiCliente cliente = daoCliente.obterPorId(2L);
		System.out.println(cliente.getAssento().getNome());
		daoCliente.fechar();
		
		DAO<BiAssento> daoAssento = new DAO<>(BiAssento.class);

		BiAssento assento = daoAssento.obterPorId(3L);
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();
	}
}
