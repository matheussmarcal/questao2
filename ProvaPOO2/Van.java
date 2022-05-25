package ProvaPOO2;

public class Van extends VeiculodePasseio {
	
	int numPassageiro, numEixo;

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	public int getNumEixo() {
		return numEixo;
	}

	public void setNumEixo(int numEixo) {
		this.numEixo = numEixo;
	}

	public Van(String placa, String cor, String modelo, String fabricante, int anoFabricacao, int valorDiaria,
			int numPortas) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, numPortas);
		
	}

}
