package br.com.startup.lanche.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.startup.lanche.commons.contrato.ICalculadorPrecoItemLanche;
import br.com.startup.lanche.commons.dto.Ingrediente;
import br.com.startup.lanche.commons.dto.Lanche;
import br.com.startup.lanche.commons.dto.Pedido;
import br.com.startup.lanche.commons.dto.RetornoValorPedido;
import br.com.startup.lanche.core.repository.ILancheRepository;
import br.com.startup.lanche.service.ILojaService;

@Service
public class LojaServiceImpl implements ILojaService {

	@Autowired
	private ILancheRepository repo;
	
	@Autowired
	private ICalculadorPrecoItemLanche calculador;
	
	@Override
	public List<Lanche> obterCardapio() {

		return repo.obterLanches();
	}

	@Override
	public List<Ingrediente> obterIngredientes() {
		return repo.obterIngredientes();
	}

	@Override
	public RetornoValorPedido obterValorPedido(Pedido pedido) {
		RetornoValorPedido retorno = new RetornoValorPedido(pedido, pedido.obterValorTotal(calculador));
		return retorno;
	}

}
