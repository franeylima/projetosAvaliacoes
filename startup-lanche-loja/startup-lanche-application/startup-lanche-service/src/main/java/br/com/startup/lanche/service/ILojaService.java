package br.com.startup.lanche.service;

import java.util.List;

import br.com.startup.lanche.commons.dto.Ingrediente;
import br.com.startup.lanche.commons.dto.Lanche;
import br.com.startup.lanche.commons.dto.Pedido;
import br.com.startup.lanche.commons.dto.RetornoValorPedido;

public interface ILojaService {
  
	List<Lanche> obterCardapio();
		
	List<Ingrediente> obterIngredientes();
	
	RetornoValorPedido obterValorPedido(Pedido pedido);
	
}
