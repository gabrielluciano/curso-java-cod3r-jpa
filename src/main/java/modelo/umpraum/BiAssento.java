package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bi_assentos")
public class BiAssento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@OneToOne(mappedBy = "assento")
	private BiCliente cliente;

	public BiAssento() {
	
	}
	
	public BiAssento(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public BiCliente getCliente() {
		return cliente;
	}

	public void setCliente(BiCliente cliente) {
		this.cliente = cliente;
	}
}
