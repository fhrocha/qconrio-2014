package br.com.caelum.financeiro;

import java.util.List;

import br.com.caelum.modelo.Boleto;
import br.com.caelum.modelo.Fatura;
import br.com.caelum.modelo.ParcelaCartao;
import br.com.caelum.modelo.ProcessadorDeBoletos;
import br.com.caelum.modelo.ProcessadorDeCartaoDeCredito;

public class ServicoFinanceiro {

	public void verificaFaturaComCartao(List<ParcelaCartao> parcelas,
			Fatura fatura) {
		new ProcessadorDeCartaoDeCredito().processa(parcelas, fatura);
	}

	public void verificaFaturaComBoleto(List<Boleto> boletos, Fatura fatura) {
		new ProcessadorDeBoletos().processa(boletos, fatura);
	}
}
