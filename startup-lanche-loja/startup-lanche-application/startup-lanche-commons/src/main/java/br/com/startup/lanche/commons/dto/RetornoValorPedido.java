package br.com.startup.lanche.commons.dto;

public class RetornoValorPedido {

	private Pedido pedido;

	private Float valor;
	
	public RetornoValorPedido(Pedido pedido, Float valor){
		this.pedido = pedido;
	}
	
	public Pedido getPedido() {
		return pedido;
	}


	public Float getValor() {
		return valor;
	}

	
	
	
	
}
