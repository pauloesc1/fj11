package br.edu.caelum.fj11.capitulo_03;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro 	= 15000;
		int gastosFevereiro = 23000;
		int gastosMarco		= 17000;
		
		int gastoTrimestre 	= gastosJaneiro +
				gastosFevereiro +
				gastosMarco;
		
		int mediaTrimestre	= gastoTrimestre / 3;
		
		System.out.println("Gasto trimestral: " + gastoTrimestre);
		System.out.println("Média trimestral: " + mediaTrimestre);
	}

}
