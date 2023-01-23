package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto1 = new Produto("Caneta", 3.99);
		dao.abrirT().incluir(produto1).fecharT();
		
		Produto produto2 = new Produto("TV", 1899.89);
		dao.incluirAtomico(produto2);
		dao.fechar();
	}
}
