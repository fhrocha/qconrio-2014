package br.com.caelum.modelo;

import java.util.Iterator;
import java.util.List;

public class ProcessadorDeCartaoDeCredito implements ProcessadorDeMeiosDePagamento<ParcelaCartao> {
	
	public void processa(List<ParcelaCartao> parcelas, Fatura fatura) {
	
		Iterator<ParcelaCartao> localIterator = parcelas.iterator();
		while (localIterator.hasNext()) {
			MeioDePagamento localMeioDePagamento = (MeioDePagamento) localIterator
					.next();
			Pagamento localPagamento = new Pagamento(
					localMeioDePagamento.getValor(), MeiosDePagamento.CARTAO);
			fatura.getPagamentos().add(localPagamento);
		}
	}
}
