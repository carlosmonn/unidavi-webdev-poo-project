package pos.ProjetoFinal;

import org.junit.Test;

public class CorrenteTest {
	
	@Test
	public void deveFazerSaqueContaCorrenteSemUsarLimite() {
		Corrente corrente = new Corrente();
		corrente.setAgencia("1234-1");
		corrente.setNumero("5432-1");
		corrente.setSaldo(100);
		corrente.setLimite(1000);
		corrente.addSaque(50);
	}
	
	@Test
	public void deveFazerSaqueContaCorrenteUsandoLimite() {
		Corrente corrente = new Corrente();
		corrente.setAgencia("1234-1");
		corrente.setNumero("5432-1");
		corrente.setSaldo(100);
		corrente.setLimite(1000);
		corrente.addSaque(250);
	}
	

	@Test
	public void deveFazerSaqueContaCorrenteMaiorQueSaldoLimite() {
		Corrente corrente = new Corrente();
		corrente.setAgencia("1234-1");
		corrente.setNumero("5432-1");
		corrente.setSaldo(100);
		corrente.setLimite(1000);
		corrente.addSaque(1250);
	}
	
	@Test
	public void deveRetornarExtratoContaCorrenteSemUsarLimite() {
		Corrente corrente = new Corrente();
		corrente.setAgencia("1234-1");
		corrente.setNumero("5432-1");
		corrente.setSaldo(100);
		corrente.setLimite(1000);
		corrente.addDeposito(500);
		corrente.addSaque(129.90);
		
		System.out.println(corrente.getExtrato());
	}

	@Test
	public void deveRetornarExtratoContaCorrenteUsandoLimite() {
		Corrente corrente = new Corrente();
		corrente.setAgencia("1234-1");
		corrente.setNumero("5432-1");
		corrente.setSaldo(100);
		corrente.setLimite(1000);
		corrente.addSaque(229.90);
		
		System.out.println(corrente.getExtrato());
	}
}
