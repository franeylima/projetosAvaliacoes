package br.com.startup.lanche.commons.dto;

public class ItemLanche {

	private Ingrediente ingrediente;
	
	private Integer quantidade;

	public ItemLanche (Ingrediente ingrediente, Integer quantidade){
		this.ingrediente = ingrediente;
		this.quantidade = quantidade;
	}
	
	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
