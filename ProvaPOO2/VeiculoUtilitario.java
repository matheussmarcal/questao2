package ProvaPOO2;

import java.util.Scanner;

public class VeiculoUtilitario extends VeiculodePasseio {
	
	String TipoTracao, Tipo, numPortas;

	public VeiculoUtilitario(String placa, String cor, String modelo, String fabricante, int anoFabricacao,
			int valorDiaria, int numPortas) {
		
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, numPortas);
		
	}

	public String getTipoTracao() {
		return TipoTracao;
	}

	public void setTipoTracao(String tipoTracao) {
		TipoTracao = tipoTracao;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(String numPortas) {
		this.numPortas = numPortas;
	}
	
	public void CadastrarUtilitario () {
		System.out.println("");
	}
		
		
	
	

}
