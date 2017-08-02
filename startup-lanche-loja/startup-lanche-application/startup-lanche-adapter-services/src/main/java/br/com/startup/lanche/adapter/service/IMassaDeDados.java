package br.com.startup.lanche.adapter.service;

import java.util.List;

import br.com.startup.lanche.commons.dto.Ingrediente;
import br.com.startup.lanche.commons.dto.Lanche;

public interface IMassaDeDados {

	public List<Lanche> obterLanches();

	public List<Ingrediente> obterIngredientes();
}
