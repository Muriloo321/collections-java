package exercicio2lista;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> carrinho;

	public CarrinhoDeCompras() {
		this.carrinho = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		if(carrinho.isEmpty()) {
			System.out.println("O carrinho está vazio");
		}
		else {
			for(Item I : carrinho) {
				if(I.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(I);
				}
			}
			carrinho.removeAll(itensParaRemover);
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal=0;
		for(Item I : carrinho) {
			valorTotal += (I.getQuantidade()*I.getPreço()); 
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(carrinho);
	}
	
    public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Óleo", 8.99, 2);
		carrinho.adicionarItem("Chocolate", 4, 4);
		carrinho.adicionarItem("Sabonete", 2.99, 5);
		
		carrinho.exibirItens();
		
		System.out.printf("Valor total: %.2f%n",carrinho.calcularValorTotal());
		
		
	}
}
