package br.com.startup.lanche.commons.dto;

import java.util.List;

import br.com.startup.lanche.commons.contrato.ICalculadorPrecoItemLanche;

public class Lanche {

	private String nome;
	
	private Integer id;
	
	List<ItemLanche> composicao;
	
	public Lanche(String nome, Integer id, List<ItemLanche> composicao){
		this.nome = nome;
		this.id = id;
		this.composicao = composicao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<ItemLanche> getComposicao() {
		return composicao;
	}

	public void setComposicao(List<ItemLanche> composicao) {
		this.composicao = composicao;
	}
	
	public Float obterValor(ICalculadorPrecoItemLanche calculador){
		
		Float valor = 0f;
		
		RetornoCalculoPreco retorno = null;
		retorno = calculador.calcularPrecoItemLanche(this);
		valor += retorno.getValor();
		
		
		return valor;
		
	}
	
}
