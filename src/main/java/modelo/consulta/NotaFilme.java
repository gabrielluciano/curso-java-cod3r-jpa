package modelo.consulta;

public class NotaFilme {

	private double media;
	
	private int numeroFilmes;

	public NotaFilme(double media, int numeroFilmes) {
		super();
		this.media = media;
		this.numeroFilmes = numeroFilmes;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getNumeroFilmes() {
		return numeroFilmes;
	}

	public void setNumeroFilmes(int numeroFilmes) {
		this.numeroFilmes = numeroFilmes;
	}
}
