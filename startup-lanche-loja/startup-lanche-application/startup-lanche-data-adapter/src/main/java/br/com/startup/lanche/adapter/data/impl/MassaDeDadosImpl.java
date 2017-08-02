package br.com.startup.lanche.adapter.data.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.startup.lanche.adapter.service.IMassaDeDados;
import br.com.startup.lanche.commons.dto.Ingrediente;
import br.com.startup.lanche.commons.dto.ItemLanche;
import br.com.startup.lanche.commons.dto.Lanche;
import br.com.startup.lanche.commons.dto.TipoIngrediente;

@Service
public class MassaDeDadosImpl implements IMassaDeDados {

	@Override
	public List<Lanche> obterLanches() {
		List<Ingrediente> ingredientes = new ArrayList<>();
		Integer quantidadePadrao = 1;
		
		Ingrediente  alface = new Ingrediente(TipoIngrediente.ALFACE,0.40f);
		
		Ingrediente  bacon = new Ingrediente(TipoIngrediente.BACON,2f);
		Ingrediente  hamburguer = new Ingrediente(TipoIngrediente.HAMBURGUER_DE_CARNE,3f);
		Ingrediente  ovo = new Ingrediente(TipoIngrediente.OVO,0.8f);
		Ingrediente queijo = new Ingrediente(TipoIngrediente.QUEIJO,1.5f);

		ingredientes.add(alface);
		ingredientes.add(bacon);
		ingredientes.add(hamburguer);
		ingredientes.add(ovo);
		ingredientes.add(queijo);
		
		List<ItemLanche> itensLancheXbacon = new ArrayList<>();
		itensLancheXbacon.add(new ItemLanche(bacon,quantidadePadrao));
		itensLancheXbacon.add(new ItemLanche(hamburguer,quantidadePadrao));
		itensLancheXbacon.add(new ItemLanche(queijo,quantidadePadrao));
		
		List<ItemLanche> itensLancheXburguer = new ArrayList<>();
		itensLancheXburguer.add(new ItemLanche(hamburguer,quantidadePadrao));
		itensLancheXburguer.add(new ItemLanche(queijo,quantidadePadrao));
		
		List<ItemLanche> itensLancheXegg = new ArrayList<>();
		itensLancheXegg.add(new ItemLanche(ovo,quantidadePadrao));
		itensLancheXegg.add(new ItemLanche(hamburguer,quantidadePadrao));
		itensLancheXegg.add(new ItemLanche(queijo,quantidadePadrao));
		
		List<ItemLanche> itensLancheXeggBacon = new ArrayList<>();
		itensLancheXeggBacon.add(new ItemLanche(ovo,quantidadePadrao));
		itensLancheXeggBacon.add(new ItemLanche(bacon,quantidadePadrao));
		itensLancheXeggBacon.add(new ItemLanche(hamburguer,quantidadePadrao));
		itensLancheXeggBacon.add(new ItemLanche(queijo,quantidadePadrao));
		
		Lanche xbacon = new Lanche("X-Bacon",1,itensLancheXbacon);
		Lanche xburguer = new Lanche("X-Bacon",2,	itensLancheXburguer);
		Lanche xegg = new Lanche("X-Bacon",3,itensLancheXegg);
		Lanche xeggBacon = new Lanche("X-Bacon",4,itensLancheXeggBacon);
		
		List<Lanche> lanches = new ArrayList<>();
		lanches.add(xbacon);
		lanches.add(xburguer);
		lanches.add(xegg);
		lanches.add(xeggBacon);
		
		return lanches;
	}

	@Override
	public List<Ingrediente> obterIngredientes() {
		List<Ingrediente> ingredientes = new ArrayList<>();
		
		Ingrediente  alface = new Ingrediente(TipoIngrediente.ALFACE,0.40f);
		
		Ingrediente  bacon = new Ingrediente(TipoIngrediente.BACON,2f);
		Ingrediente  hamburguer = new Ingrediente(TipoIngrediente.HAMBURGUER_DE_CARNE,3f);
		Ingrediente  ovo = new Ingrediente(TipoIngrediente.OVO,0.8f);
		Ingrediente queijo = new Ingrediente(TipoIngrediente.QUEIJO,1.5f);

		ingredientes.add(alface);
		ingredientes.add(bacon);
		ingredientes.add(hamburguer);
		ingredientes.add(ovo);
		ingredientes.add(queijo);
		
		return ingredientes;
	}


	
}
