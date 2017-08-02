package br.com.startup.lanche.core.service.impl;

import org.springframework.stereotype.Component;

import br.com.startup.lanche.commons.contrato.ICalculadorPrecoItemLanche;
import br.com.startup.lanche.commons.dto.ItemLanche;
import br.com.startup.lanche.commons.dto.Lanche;
import br.com.startup.lanche.commons.dto.RetornoCalculoPreco;
import br.com.startup.lanche.commons.dto.TipoIngrediente;
import br.com.startup.lanche.commons.dto.TipoPromocao;

@Component
public class CalculadorPrecoLanche implements ICalculadorPrecoItemLanche{

	@Override
	public RetornoCalculoPreco calcularPrecoItemLanche(Lanche lanche) {

		RetornoCalculoPreco retorno = null;
		
		retorno = promocaoLight(lanche);
		
		if (retorno != null)
			return retorno;
		
		retorno = promocaoMuitaCarne(lanche);
		
		if (retorno != null)
			return retorno;
		
		retorno = promocaoMuitoQueijo(lanche);
		
		if (retorno != null)
			return retorno;
		
		retorno = calculaPrecoPadrao(lanche);
		
		return retorno;
	}
	
	public RetornoCalculoPreco calculaPrecoPadrao(Lanche lanche){
		
		Float valor = 0f;
		
		for (ItemLanche i : lanche.getComposicao()){
			valor += i.getQuantidade() * i.getIngrediente().getValor();	
		}
		
		return new RetornoCalculoPreco(valor ,TipoPromocao.SEM_PROMOCAO);
	}
	
	public RetornoCalculoPreco promocaoLight(Lanche lanche){
		
		boolean achouBacon = false;
		boolean achouAlface = false;
		Float valor = 0f;
		
		for (ItemLanche i : lanche.getComposicao()){
			if (i.getIngrediente().getTipo()== TipoIngrediente.ALFACE)
				achouAlface = true;
			
			if (i.getIngrediente().getTipo()== TipoIngrediente.BACON)
				achouBacon = true;
		}
		
		valor = calculaPrecoPadrao(lanche).getValor();
		
		if (!achouBacon && achouAlface)   
			return new RetornoCalculoPreco((valor * 0.9f) ,TipoPromocao.LIGHT);
		else 
			return null;
	}
	
	public RetornoCalculoPreco promocaoMuitaCarne(Lanche lanche){
		
		Float valor = 0f;
		
		for (ItemLanche i : lanche.getComposicao()){
			if (i.getIngrediente().getTipo()!= TipoIngrediente.HAMBURGUER_DE_CARNE)
				continue;
			
			if (i.getQuantidade() % 3 == 0)
				valor = (i.getQuantidade()/3 * 2) * i.getIngrediente().getValor();  
		}
		
		if (valor != 0f)
			return new RetornoCalculoPreco(valor ,TipoPromocao.MUITA_CARNE);
		else 
			return null;
	}

	public RetornoCalculoPreco promocaoMuitoQueijo(Lanche lanche){
		
		Float valor = 0f;
		
		for (ItemLanche i : lanche.getComposicao()){
			if (i.getIngrediente().getTipo()!= TipoIngrediente.QUEIJO)
				continue;
			
			if (i.getQuantidade() % 3 == 0)
				valor = (i.getQuantidade()/3 * 2) * i.getIngrediente().getValor();  
		}
		
		if (valor != 0f)
			return new RetornoCalculoPreco(valor ,TipoPromocao.MUITO_QUEIJO);
		else 
			return null;
	}
	
}
