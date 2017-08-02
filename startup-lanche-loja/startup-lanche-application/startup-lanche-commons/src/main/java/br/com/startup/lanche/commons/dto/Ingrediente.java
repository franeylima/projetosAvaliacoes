package br.com.startup.lanche.commons.dto;

public class Ingrediente {

	private TipoIngrediente tipo;
	
	private Float valor;
	
	
	public Ingrediente(TipoIngrediente tipoIngrediente, Float valor){
		this.tipo = tipoIngrediente;
		this.valor = valor;
	
	}
	
	public TipoIngrediente getTipo() {
		return tipo;
	}

/*	public void setTipo(TipoIngrediente tipo) {
		this.tipo = tipo;
	}*/

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
