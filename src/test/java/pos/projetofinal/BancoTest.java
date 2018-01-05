package pos.projetofinal;

import org.junit.Test;

public class BancoTest {
	
	@Test
	public void deveRetornarListaClientesBancoInformandoContaCorrentePoupanca() {
		Corrente corrente1 = new Corrente();
		corrente1.setAgencia("1234-1");
		corrente1.setNumero("5432-1");
		corrente1.setSaldo(100);
		corrente1.setLimite(1000);
		
		Poupanca poupanca1 = new Poupanca();
		poupanca1.setAgencia("1234-1");
		poupanca1.setNumero("5432-1");
		poupanca1.setSaldo(500);
		poupanca1.setTaxajuros(0.6);
		
		Cliente cliente1 = new Cliente();
		cliente1.setCpf("12345678912");
		cliente1.setNome("Cliente 1");
		cliente1.setDatanascimento("25/12/1992");
		cliente1.setCorrente(corrente1);
		cliente1.setPoupanca(poupanca1);
		
		Corrente corrente2 = new Corrente();
		corrente2.setAgencia("2234-1");
		corrente2.setNumero("5432-2");
		corrente2.setSaldo(300);
		corrente2.setLimite(500);
		
		Poupanca poupanca2 = new Poupanca();
		poupanca2.setAgencia("2234-1");
		poupanca2.setNumero("5432-2");
		poupanca2.setSaldo(800);
		poupanca2.setTaxajuros(0.6);
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("01234567891");
		cliente2.setNome("Cliente 2");
		cliente2.setDatanascimento("21/03/1990");
		cliente2.setCorrente(corrente2);
		cliente2.setPoupanca(poupanca2);
		
		Corrente corrente3 = new Corrente();
		corrente3.setAgencia("3234-1");
		corrente3.setNumero("5432-3");
		corrente3.setSaldo(250);
		corrente3.setLimite(800);
		
		Poupanca poupanca3 = new Poupanca();
		poupanca3.setAgencia("3234-1");
		poupanca3.setNumero("5432-3");
		poupanca3.setSaldo(750);
		poupanca3.setTaxajuros(0.6);
		
		Cliente cliente3 = new Cliente();
		cliente3.setCpf("02345678912");
		cliente3.setNome("Cliente 3");
		cliente3.setDatanascimento("07/09/1984");
		cliente3.setCorrente(corrente3);
		cliente3.setPoupanca(poupanca3);
		
		Banco banco = new Banco();
		banco.setNome("Banco do Brasil");
		banco.setCliente(cliente1);
		banco.setCliente(cliente2);
		banco.setCliente(cliente3);
		
		System.out.println(banco.imprimeClientes());
	}
	
	@Test
	public void deveRetornarListaClientesBancoSemInformarContaCorrenteOuPoupanca() {		
		Cliente cliente1 = new Cliente();
		cliente1.setCpf("12345678912");
		cliente1.setNome("Cliente 1");
		cliente1.setDatanascimento("25/12/1992");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("01234567891");
		cliente2.setNome("Cliente 2");
		cliente2.setDatanascimento("21/03/1990");
		
		Cliente cliente3 = new Cliente();
		cliente3.setCpf("02345678912");
		cliente3.setNome("Cliente 3");
		cliente3.setDatanascimento("07/09/1984");
		
		Banco banco = new Banco();
		banco.setNome("Banco do Brasil");
		banco.setCliente(cliente1);
		banco.setCliente(cliente2);
		banco.setCliente(cliente3);
		
		System.out.println(banco.imprimeClientes());
	}
	
	@Test
	public void deveRetornarListaFuncionariosBanco() {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setCpf("12345678912");
		funcionario1.setNome("Funcionário 1");
		funcionario1.setDatanascimento("25/10/1990");
		funcionario1.setCargo("Cargo 1");
		funcionario1.setSalario(1952.20);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCpf("01234567891");
		funcionario2.setNome("Funcionário 2");
		funcionario2.setDatanascimento("12/10/1991");
		funcionario2.setCargo("Cargo 2");
		funcionario2.setSalario(3350.00);
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setCpf("02234567893");
		funcionario3.setNome("Funcionário 3");
		funcionario3.setDatanascimento("03/06/1989");
		funcionario3.setCargo("Cargo 3");
		funcionario3.setSalario(2756.80);
		
		Banco banco = new Banco();
		banco.setNome("Banco do Brasil");
		banco.setFuncionario(funcionario1);
		banco.setFuncionario(funcionario2);
		banco.setFuncionario(funcionario3);
		
		System.out.println(banco.imprimeFuncionarios());
	}
}
