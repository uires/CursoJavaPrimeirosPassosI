class balancoTrimestal{
	public static void main(String[] args){
		// Declaração das variáveis: 
		
		int gastosJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;

		int gastosTrimestal = gastosJaneiro + gastoFevereiro + gastoMarco;
		int mediaMensal = gastosTrimestal / 3;

		System.out.println("O gasto total é: R$ " + gastosTrimestal + " reais. A media mensal é : " + mediaMensal );

	}
}