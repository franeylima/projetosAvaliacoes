package br.com.startup.lanche.commons.contrato;

import br.com.startup.lanche.commons.dto.Lanche;
import br.com.startup.lanche.commons.dto.RetornoCalculoPreco;

public interface ICalculadorPrecoItemLanche {

	RetornoCalculoPreco calcularPrecoItemLanche(Lanche lanche);
}
