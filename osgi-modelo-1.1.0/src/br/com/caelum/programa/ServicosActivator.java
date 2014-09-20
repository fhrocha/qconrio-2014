package br.com.caelum.programa;

import java.util.Arrays;
import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import br.com.caelum.comercial.ServicoComercial;
import br.com.caelum.financeiro.ServicoFinanceiro;
import br.com.caelum.modelo.Boleto;
import br.com.caelum.modelo.Cheque;
import br.com.caelum.modelo.Fatura;
import br.com.caelum.modelo.ParcelaCartao;

public class ServicosActivator implements BundleActivator {
	
	public void start(BundleContext paramBundleContext) throws Exception {
		System.out.println("Iniciando programa ... ");
		rodaPrograma();
	}

	public void stop(BundleContext paramBundleContext) throws Exception {
		System.out.println("Terminando programa ...");
	}

	private void rodaPrograma() {
		
		Fatura fatura = geraFatura();
		ServicoFinanceiro financeiro = new ServicoFinanceiro();
		ServicoComercial comercial = new ServicoComercial();
		
		List<Boleto> boletos = geraBoletos();
		financeiro.verificaFaturaComBoleto(boletos, fatura);
		
		System.out.println();
		
		List<ParcelaCartao> parcelas = geraParcelasCartao();
		financeiro.verificaFaturaComCartao(parcelas, fatura);
		
		System.out.println();

		List<Cheque> cheques = geraCheques();
		comercial.verificaFaturaComCheques(cheques, fatura);
		
		System.out.println();
	}

	private List<ParcelaCartao> geraParcelasCartao() {
		return Arrays.asList(new ParcelaCartao[] { new ParcelaCartao(100.0D) });
	}

	private List<Cheque> geraCheques() {
		return Arrays.asList(new Cheque[] { new Cheque(300.0D) });
	}

	private List<Boleto> geraBoletos() {
		return Arrays.asList(new Boleto[] { new Boleto(200.0D) });
	}

	private Fatura geraFatura() {
		return new Fatura("sun", 1000.0D);
	}
}