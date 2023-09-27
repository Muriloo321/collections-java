package exercicio1livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	List<Livro> listadeObjetos;

	public CatalogoLivros() {
		this.listadeObjetos = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listadeObjetos.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public void pesquisarPorAutor(String autor){
		if(listadeObjetos.isEmpty()) {
			System.out.println("A lista está vazia");
		}
		else {
			System.out.println("Procurando por livros de "+ autor);
			for(Livro l : listadeObjetos) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					System.out.println("Livro: "+l.getTítulo()+" // Ano de publicação: "+l.getAnodePublicação());
				}
			}
		}
	}
	
	public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) throws Exception {
		boolean livrosEncontrados = false;

		if(listadeObjetos.isEmpty()) {
			System.out.println("A lista está vazia");
		}
		else if (anoFinal < anoInicial){
			throw new Exception("Ano inicial maior do que ano final.");
		}
		else{
			System.out.println("Procurando livros entre o intervalo de tempo "+anoInicial+" a "+anoFinal+"...");
			System.out.println();
			for (Livro l : listadeObjetos) {
	            if (l.getAnodePublicação() >= anoInicial && l.getAnodePublicação() <= anoFinal) {
	                System.out.println(l.getTítulo()+" // "+l.getAutor()+" // "+l.getAnodePublicação());
	                livrosEncontrados = true;
			  }
			}
			if (!livrosEncontrados) {
	            System.out.println("Nenhum livro encontrado no intervalo de tempo especificado.");
			}
		}	
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
	    Livro livroPorTitulo = null;
	    if (!listadeObjetos.isEmpty()) {
	      for (Livro l : listadeObjetos) {
	        if (l.getTítulo().equalsIgnoreCase(titulo)) {
	          livroPorTitulo = l;
	          break;
	        }
	      }
	      return livroPorTitulo;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }
	
	public static void main(String[] args) throws Exception {
		CatalogoLivros livro = new CatalogoLivros();
		
		livro.adicionarLivro("O clima tá seco aqui no Maranhão", "Roberto", 1998);
		livro.adicionarLivro("Mamãe me dê pirulito", "Roberto", 1990);
		livro.adicionarLivro("As vantagens de ser um tiktoker famoso", "Murilo", 2022);
		livro.adicionarLivro("O clima tá frio aqui no Maranhão", "Roberto", 2003);
		
		//Testando o método de busca pelo autor (fiquei bem feliz de ter conseguido!!). O primeiro, em lowercase, e o segundo, começando com a letra maiúscula
		livro.pesquisarPorAutor("roberto");
		System.out.println();
		livro.pesquisarPorAutor("Murilo");
		
		//Testando o método de procurar livros por intervalo de tempo especificados
		System.out.println();
		livro.pesquisarPorIntervaloAnos(1997, 2008);
		
		//Pesquisando pelo título e retornando apenas o primeiro resultado
		System.out.println();
		System.out.println(livro.pesquisarPorTitulo("As vantagens de ser um tiktoker famoso"));
		
		
	}
	
}
