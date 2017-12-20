package pos.ProjetoFinal;

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
	private ArrayList<Cliente> cliente = new ArrayList<>();
	private ArrayList<Funcionario> funcionario = new ArrayList<>();

	public Banco() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}

	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}

	public String imprimeClientes() {
		StringBuilder imp_cliente = new StringBuilder();

		imp_cliente.append("Lista de Clientes: ");
		imp_cliente.append(this.nome);
		imp_cliente.append("\n");
		for (Cliente c : cliente) {

			imp_cliente.append("CPF: ");
			imp_cliente.append(c.getCpf());
			imp_cliente.append(" - ");
			imp_cliente.append(c.getNome());
			imp_cliente.append(" - ");
			imp_cliente.append(c.getDatanascimento());

			if (c.getCorrente() != null) {
				imp_cliente.append(", [Conta-corrente - Agência: ");
				imp_cliente.append(c.getCorrente().getAgencia());
				imp_cliente.append(", Número: ");
				imp_cliente.append(c.getCorrente().getNumero());
				imp_cliente.append(", Saldo: ");
				imp_cliente.append(c.getCorrente().getSaldo());
				imp_cliente.append("]");
			}

			if (c.getPoupanca() != null) {
				imp_cliente.append(", [Conta-poupança - Agência: ");
				imp_cliente.append(c.getCorrente().getAgencia());
				imp_cliente.append(", Número: ");
				imp_cliente.append(c.getPoupanca().getNumero());
				imp_cliente.append(", Saldo: ");
				imp_cliente.append(c.getPoupanca().getSaldo());
				imp_cliente.append(", Taxa de rendimento: ");
				imp_cliente.append(c.getPoupanca().getTaxajuros());
				imp_cliente.append("]");
			}
			imp_cliente.append("\n");
		}
		return imp_cliente.toString();
	}

	public String imprimeFuncionarios() {
		StringBuilder imp_funcionario = new StringBuilder();

		imp_funcionario.append("Lista de Funcionários: ");
		imp_funcionario.append(this.nome);
		imp_funcionario.append("\n");
		for (Funcionario f : funcionario) {

			imp_funcionario.append("CPF: ");
			imp_funcionario.append(f.getCpf());
			imp_funcionario.append(" - ");
			imp_funcionario.append(f.getNome());
			imp_funcionario.append(", Cargo: ");
			imp_funcionario.append(f.getCargo());
			imp_funcionario.append(", Salário: ");
			imp_funcionario.append(f.getSalario());

			imp_funcionario.append("\n");
		}
		return imp_funcionario.toString();
	}
}
