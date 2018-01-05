package pos.projetofinal;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Banco {
	private String nome;
	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}

	public String imprimeClientes() {
		StringBuilder impCliente = new StringBuilder();

		impCliente.append("Lista de Clientes: ");
		impCliente.append(this.nome);
		impCliente.append("\n");
		for (Cliente c : cliente) {

			impCliente.append("CPF: ");
			impCliente.append(c.getCpf());
			impCliente.append(" - ");
			impCliente.append(c.getNome());
			impCliente.append(" - ");
			impCliente.append(c.getDatanascimento());

			if (c.getCorrente() != null) {
				impCliente.append(", [Conta-corrente - Agência: ");
				impCliente.append(c.getCorrente().getAgencia());
				impCliente.append(", Número: ");
				impCliente.append(c.getCorrente().getNumero());
				impCliente.append(", Saldo: ");
				impCliente.append(c.getCorrente().getSaldo());
				impCliente.append("]");
			}

			if (c.getPoupanca() != null) {
				impCliente.append(", [Conta-poupança - Agência: ");
				impCliente.append(c.getCorrente().getAgencia());
				impCliente.append(", Número: ");
				impCliente.append(c.getPoupanca().getNumero());
				impCliente.append(", Saldo: ");
				impCliente.append(c.getPoupanca().getSaldo());
				impCliente.append(", Taxa de rendimento: ");
				impCliente.append(c.getPoupanca().getTaxajuros());
				impCliente.append("]");
			}
			impCliente.append("\n");
		}
		return impCliente.toString();
	}

	public String imprimeFuncionarios() {
		StringBuilder impFuncionario = new StringBuilder();

		impFuncionario.append("Lista de Funcionários: ");
		impFuncionario.append(this.nome);
		impFuncionario.append("\n");
		for (Funcionario f : funcionario) {

			impFuncionario.append("CPF: ");
			impFuncionario.append(f.getCpf());
			impFuncionario.append(" - ");
			impFuncionario.append(f.getNome());
			impFuncionario.append(", Cargo: ");
			impFuncionario.append(f.getCargo());
			impFuncionario.append(", Salário: ");
			impFuncionario.append(f.getSalario());

			impFuncionario.append("\n");
		}
		return impFuncionario.toString();
	}
}
