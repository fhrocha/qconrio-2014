package br.com.caelum.teste;

import java.util.Arrays;
import java.util.List;

import br.com.caelum.comercial.ServicoComercial;
import br.com.caelum.financeiro.ServicoFinanceiro;
import br.com.caelum.modelo.Boleto;
import br.com.caelum.modelo.Cheque;
import br.com.caelum.modelo.Fatura;
import br.com.caelum.modelo.ParcelaCartao;

public class Main_1_1_0 { 

	public static void main(String[] args) {
			
		Fatura fatura = geraFatura();
		List<Boleto> boletos = geraBoletos();
		List<ParcelaCartao> parcelas = geraParcelas();

		ServicoFinanceiro financeiro = new ServicoFinanceiro();

		financeiro.verificaFaturaComBoleto(boletos, fatura);
		financeiro.verificaFaturaComCartao(parcelas, fatura);
		
		//novo
		List<Cheque> cheques = geraCheques();

		ServicoComercial comercial = new ServicoComercial();

		comercial.verificaFaturaComCheques(cheques, fatura);
	
	}
	
	
	
	

	private static List<Cheque> geraCheques() {
		return Arrays.asList(new Cheque(200.0));
	}

	private static List<ParcelaCartao> geraParcelas() {
		return Arrays.asList(new ParcelaCartao(300.0));
	}

	private static List<Boleto> geraBoletos() {
		return Arrays.asList(new Boleto(400.0));
	}

	private static Fatura geraFatura() {
		return new Fatura("ClienteTeste" , 1000.0);
	}
}
