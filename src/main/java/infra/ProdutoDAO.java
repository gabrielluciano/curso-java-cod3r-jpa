package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

	// Posso ter métodos específicos de produto
	
	public ProdutoDAO() {
		super(Produto.class);
	}
}
