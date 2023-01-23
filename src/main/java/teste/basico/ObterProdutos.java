package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> produtos = produtoDAO.obterTodos();
		
		for (Produto produto : produtos) {
			System.out.println("ID: " + produto.getId() +
					" NOME: " + produto.getNome());
		}
		
		System.out.println("Denovo...");
		
		produtos = produtoDAO.obterTodos(2, 1);
		
		for (Produto produto : produtos) {
			System.out.println("ID: " + produto.getId() +
					" NOME: " + produto.getNome());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		
		System.out.println(String.format("Valor total: R$%.2f", precoTotal));
	}
}
