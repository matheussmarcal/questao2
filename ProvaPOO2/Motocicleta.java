package ProvaPOO2;

public class Motocicleta extends VeiculodePasseio {
	
	int Potencia;
	String Tipo;

	public int getPotencia() {
		return Potencia;
	}

	public void setPotencia(int potencia) {
		Potencia = potencia;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Motocicleta(String placa, String cor, String modelo, String fabricante, int anoFabricacao, int valorDiaria,
			int numPortas) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, numPortas);
		
	}

}
