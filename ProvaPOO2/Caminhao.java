package ProvaPOO2;



public class Caminhao extends VeiculodePasseio {
	
	float CapacidadeCarga;
	int numEixo;

	public Caminhao(String placa, String cor, String modelo, String fabricante, int anoFabricacao, int valorDiaria,
			int numPortas) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, numPortas);
		
	}

	public float getCapacidadeCarga() {
		return CapacidadeCarga;
	}

	public void setCapacidadeCarga(float capacidadeCarga) {
		CapacidadeCarga = capacidadeCarga;
	}

	public int getNumEixo() {
		return numEixo;
	}

	public void setNumEixo(int numEixo) {
		this.numEixo = numEixo;
	}

}
