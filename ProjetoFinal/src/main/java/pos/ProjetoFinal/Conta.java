package pos.ProjetoFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Conta {
	private String agencia;
	private String numero;
	private double saldo;
	private StringBuilder extrato = new StringBuilder();

	public Conta() {
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void addDeposito(double valor) {
		movimento(valor, "Depósito");
	}

	public String addSaque(double valor) {
		if (valor <= this.saldo) {
			movimento(-valor, "Saque");
			return "Saque realizado com sucesso!";
		}

		return "Saldo insuficiente!";
	}

	protected void movimento(double valor, String descricao) {
		this.saldo += valor;

		extrato.append(descricao);
		extrato.append(" de: ");
		extrato.append(Math.abs(valor));
		extrato.append("\n");
	}

	public String getExtrato() {
		StringBuilder imp_extrato = new StringBuilder();
		imp_extrato.append("\n");
		imp_extrato.append("Agência: ");
		imp_extrato.append(this.agencia);
		imp_extrato.append("\n");
		imp_extrato.append("Conta: ");
		imp_extrato.append(this.numero);
		imp_extrato.append("\n");
		imp_extrato.append(this.extrato);
		imp_extrato.append("\n");
		imp_extrato.append("Saldo: ");
		imp_extrato.append(this.saldo);
		imp_extrato.append("\n");

		return imp_extrato.toString();
	}
}