package br.com.startup.lanche.commons.dto;

import br.com.startup.lanche.commons.contrato.ICalculadorPrecoItemLanche;

public class ItemPedido {

	private Lanche lanche;
	private Integer quantidade;

	public Lanche getLanche() {
		return lanche;
	}

	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Float obterValor(ICalculadorPrecoItemLanche calculador){
		return quantidade * lanche.obterValor(calculador);
	}
}
