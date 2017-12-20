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
public class Poupanca extends Conta {
	private double taxajuros;

	public Poupanca() {
	}

	public double getTaxajuros() {
		return taxajuros;
	}

	public void setTaxajuros(double taxajuros) {
		this.taxajuros = taxajuros;
	}

	@Override
	public String getExtrato() {
		StringBuilder imp_extrato = new StringBuilder();
		imp_extrato.append("------- EXTRATO - CONTA POUPANÇA -------");
		imp_extrato.append(super.getExtrato());
		imp_extrato.append("----------------------------------------");

		return imp_extrato.toString();
	}

	public void atualizaJuros() {
		double juros = this.getSaldo() * (this.taxajuros / 100);
		movimento(juros, "Rendimento");
	}
}
