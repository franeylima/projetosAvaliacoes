package br.com.startup.lanche.commons.dto;

public class RetornoCalculoPreco {

	private Float valor;

	private TipoPromocao promocao;
	
	public RetornoCalculoPreco(Float valor, TipoPromocao promocao){
		this.valor = valor;
		this.promocao = promocao;
	}
	
	public Float getValor() {
		return valor;
	}

	public TipoPromocao getPromocao() {
		return promocao;
	}
	
	
	
}
