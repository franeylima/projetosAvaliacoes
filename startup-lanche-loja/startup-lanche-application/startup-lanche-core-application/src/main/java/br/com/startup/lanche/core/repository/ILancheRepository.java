package br.com.startup.lanche.core.repository;

import java.util.List;

import br.com.startup.lanche.commons.dto.Ingrediente;
import br.com.startup.lanche.commons.dto.Lanche;

public interface ILancheRepository {
	
	List<Lanche> obterLanches();
	
	List<Ingrediente> obterIngredientes();
}
