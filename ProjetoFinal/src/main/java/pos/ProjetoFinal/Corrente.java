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
public class Corrente extends Conta {
	private double limite;

	public Corrente() {
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String addSaque(double valor) {
		if (valor <= this.getSaldo()) {
			movimento(-valor, "Saque");
			return "Saque realizado com sucesso!";
		} else if (valor <= (this.getSaldo() + this.getLimite())) {
			movimento(-valor, "Saque");
			return "Saque realizado com sucesso!";
		}

		return "Saldo insuficiente!";
	}

	@Override
	public String getExtrato() {
		StringBuilder imp_extrato = new StringBuilder();
		imp_extrato.append("------- EXTRATO - CONTA CORRENTE -------");
		imp_extrato.append(super.getExtrato());
		imp_extrato.append("Limite: ");
		imp_extrato.append(this.limite);
		imp_extrato.append("\n");
		imp_extrato.append("Limite disponível: ");
		imp_extrato.append(this.getLimiteDisponivel());
		imp_extrato.append("\n");
		imp_extrato.append("----------------------------------------");

		return imp_extrato.toString();
	}

	public double getLimiteDisponivel() {
		if (this.getSaldo() < 0) {
			return this.getSaldo() + this.limite;
		}

		return this.limite;
	}
}
