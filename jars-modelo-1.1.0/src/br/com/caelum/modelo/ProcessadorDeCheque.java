package br.com.caelum.modelo;

import java.util.Iterator;
import java.util.List;

public class ProcessadorDeCheque implements ProcessadorDeMeiosDePagamento<Cheque> {
	
	public void processa(List<Cheque> cheques, Fatura fatura) {
		
		Iterator<Cheque> iterator = cheques.iterator();
		
		while (iterator.hasNext()) {
			MeioDePagamento localMeioDePagamento = (MeioDePagamento) iterator
					.next();
			Pagamento localPagamento = new Pagamento(
					localMeioDePagamento.getValor(), MeiosDePagamento.CARTAO);
			fatura.getPagamentos().add(localPagamento);
		}
	}

}
