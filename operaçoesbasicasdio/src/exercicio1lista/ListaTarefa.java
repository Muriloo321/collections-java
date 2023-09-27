package exercicio1lista;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> listaDeTarefas;
	
	public ListaTarefa() {
		this.listaDeTarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao){
		listaDeTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		if(listaDeTarefas.isEmpty()) {
			System.out.println("A lista está vazia.");
		}
		else {
		for(Tarefa T : listaDeTarefas) {
			if(T.getDescrição().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(T);
			}
			
		}
		listaDeTarefas.removeAll(tarefasParaRemover);
		}
	}
	
	public int obterNumeroTotalTarefas() {
		return listaDeTarefas.size();
	}
	
	public void obterDescricoesTarefas() {
		if(!listaDeTarefas.isEmpty()) {
		System.out.println(listaDeTarefas);
		}
		else {
			System.out.println("A lista está vazia.");
		}
		
	}

	public static void main(String[] args) {
		    ListaTarefa listaTarefa = new ListaTarefa();
		    
		    //Aqui estou adicionando tarefas na minha lista
		    listaTarefa.adicionarTarefa("Arrumar o quarto");
		    listaTarefa.adicionarTarefa("Estudar");
		    listaTarefa.adicionarTarefa("Limpar a casa");
		    listaTarefa.adicionarTarefa("Passear com o cachorro");
		    listaTarefa.adicionarTarefa("Fazer os deveres escolares");
		    
		    //Saber quantos elementos (tarefas) tenho na lista
		    System.out.println("Número total de tarefas: "+listaTarefa.obterNumeroTotalTarefas());
		    
		    //Descrições das tarefas
		    listaTarefa.obterDescricoesTarefas();
		    
		    //Removendo a tarefa "Estudar". Propositalmente coloquei em lowercase para ver a reação do programa
		    listaTarefa.removerTarefa("estudar");
		    
		    System.out.println("Número total de tarefas: "+listaTarefa.obterNumeroTotalTarefas());
		    
		    listaTarefa.obterDescricoesTarefas();
		    
		    
		    
		    
}}
