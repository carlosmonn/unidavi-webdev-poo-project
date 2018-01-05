package pos.projetofinal;

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

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String addSaque(double valor) {
		if ((valor <= this.getSaldo()) || (valor <= (this.getSaldo() + this.getLimite()))) {
			movimento(-valor, "Saque");
			return "Saque realizado com sucesso!";
		}

		return "Saldo insuficiente!";
	}

	@Override
	public String getExtrato() {
		StringBuilder impExtrato = new StringBuilder();
		impExtrato.append("------- EXTRATO - CONTA CORRENTE -------");
		impExtrato.append(super.getExtrato());
		impExtrato.append("Limite: ");
		impExtrato.append(this.limite);
		impExtrato.append("\n");
		impExtrato.append("Limite disponível: ");
		impExtrato.append(this.getLimiteDisponivel());
		impExtrato.append("\n");
		impExtrato.append("----------------------------------------");

		return impExtrato.toString();
	}

	public double getLimiteDisponivel() {
		if (this.getSaldo() < 0) {
			return this.getSaldo() + this.limite;
		}

		return this.limite;
	}
}
