package br.com.startup.lanche.core.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.startup.lanche.adapter.service.IMassaDeDados;
import br.com.startup.lanche.commons.dto.Ingrediente;
import br.com.startup.lanche.commons.dto.Lanche;
import br.com.startup.lanche.core.repository.ILancheRepository;

@Service
public class LancheRepository implements ILancheRepository{

	@Autowired
	private IMassaDeDados massa;
	
	private List<Lanche> lanches;
	
	private List<Ingrediente> ingredientes;

	
	public List<Lanche> obterLanches() {
		this.lanches = massa.obterLanches();
		return this.lanches;
	}

	public List<Ingrediente> obterIngredientes() {
		this.ingredientes = massa.obterIngredientes();
		return this.ingredientes;
	}


	
}
