package pos.ProjetoFinal;

import org.junit.Test;

public class PoupancaTest {
	
	@Test
	public void deveFazerSaqueMenorQueSaldo() {
		Poupanca poupanca = new Poupanca();
		poupanca.setAgencia("1234-1");
		poupanca.setNumero("5432-1");
		poupanca.setSaldo(150);
		poupanca.addSaque(100);
	}
	
	@Test
	public void deveFazerSaqueMaiorQueSaldo() {
		Poupanca poupanca = new Poupanca();
		poupanca.setAgencia("1234-1");
		poupanca.setNumero("5432-1");
		poupanca.setSaldo(150);
		poupanca.addSaque(200);
	}
	

	@Test
	public void deveFazerAtualizarRendimento() {
		Poupanca poupanca = new Poupanca();
		poupanca.setAgencia("1234-1");
		poupanca.setNumero("5432-1");
		poupanca.setSaldo(1000);
		poupanca.setTaxajuros(0.6);
		poupanca.atualizaJuros();
	}
	
	@Test
	public void deveRetornarExtratoContaPoupanca() {
		Poupanca poupanca = new Poupanca();
		poupanca.setAgencia("1234-1");
		poupanca.setNumero("5432-1");
		poupanca.setSaldo(1000);
		poupanca.addDeposito(500);
		poupanca.setTaxajuros(0.6);
		poupanca.atualizaJuros();
		System.out.println(poupanca.getExtrato());
	}
}
