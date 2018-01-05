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
public class Poupanca extends Conta {
	private double taxajuros;

	public double getTaxajuros() {
		return taxajuros;
	}

	public void setTaxajuros(double taxajuros) {
		this.taxajuros = taxajuros;
	}

	@Override
	public String getExtrato() {
		StringBuilder impExtrato = new StringBuilder();
		impExtrato.append("------- EXTRATO - CONTA POUPANÇA -------");
		impExtrato.append(super.getExtrato());
		impExtrato.append("----------------------------------------");

		return impExtrato.toString();
	}

	public void atualizaJuros() {
		double juros = this.getSaldo() * (this.taxajuros / 100);
		movimento(juros, "Rendimento");
	}
}
