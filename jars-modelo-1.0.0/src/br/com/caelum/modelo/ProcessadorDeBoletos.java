package br.com.caelum.modelo;

import java.util.Iterator;
import java.util.List;

public class ProcessadorDeBoletos implements ProcessadorDeMeiosDePagamento<Boleto> {

	@Override
	public void processa(List<Boleto> boletos, Fatura fatura) {

		Iterator<Boleto> localIterator = boletos.iterator();

		while (localIterator.hasNext()) {
			
			MeioDePagamento localMeioDePagamento = (MeioDePagamento) localIterator.next();
			Pagamento localPagamento = new Pagamento(localMeioDePagamento.getValor(),
					MeiosDePagamento.BOLETO);
			fatura.getPagamentos().add(localPagamento);
		}
	}
}