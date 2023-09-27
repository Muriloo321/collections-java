package exercicio1lista;

public class Tarefa {
	private String descrição;

	public Tarefa(String descrição) {
		this.descrição = descrição;
	}

	public String getDescrição() {
		return descrição;
	}

	@Override
	public String toString() {
		return descrição;
	}
	
	
}
