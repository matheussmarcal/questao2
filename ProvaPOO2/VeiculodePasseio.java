package ProvaPOO2;

public abstract class VeiculodePasseio {
	
	String Placa, Cor, Modelo, Fabricante;
	int AnoFabricacao, ValorDiaria, NumPortas;
	
	public VeiculodePasseio(String placa, String cor, String modelo, String fabricante, int anoFabricacao,
			int valorDiaria, int numPortas) {
		super();
		Placa = placa;
		Cor = cor;
		Modelo = modelo;
		Fabricante = fabricante;
		AnoFabricacao = anoFabricacao;
		ValorDiaria = valorDiaria;
		NumPortas = numPortas;
	}
	


}
