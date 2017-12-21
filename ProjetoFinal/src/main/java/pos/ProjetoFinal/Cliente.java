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
public class Cliente extends Pessoa {
	private Corrente corrente;
	private Poupanca poupanca;

	public Corrente getCorrente() {
		return corrente;
	}

	public void setCorrente(Corrente corrente) {
		this.corrente = corrente;
	}

	public Poupanca getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(Poupanca poupanca) {
		this.poupanca = poupanca;
	}
}
