package br.com.startup.lanche.commons.dto;

import java.util.List;

import br.com.startup.lanche.commons.contrato.ICalculadorPrecoItemLanche;

public class Pedido {

	private List<ItemPedido> itens;

	
	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	public Float obterValorTotal(ICalculadorPrecoItemLanche calculador){
		Float total = 0f;
		
		for (ItemPedido ip : itens){
			total += ip.obterValor(calculador);
		}
		
		return total;
	}
}
