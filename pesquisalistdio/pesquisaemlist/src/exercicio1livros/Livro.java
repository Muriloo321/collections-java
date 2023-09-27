package exercicio1livros;

public class Livro {

	private String título;
	private String autor;
	private int anodePublicação;
	
	public Livro(String título, String autor, int anodePublicação) {
		this.título = título;
		this.autor = autor;
		this.anodePublicação = anodePublicação;
	}

	public String getTítulo() {
		return título;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnodePublicação() {
		return anodePublicação;
	}
	

	public void setAnodePublicação(int anodePublicação) {
		this.anodePublicação = anodePublicação;
	}

	@Override
	public String toString() {
		return "Livro [título=" + título + ", autor=" + autor + ", anodePublicação=" + anodePublicação + "]";
	}
	
	
	
}
