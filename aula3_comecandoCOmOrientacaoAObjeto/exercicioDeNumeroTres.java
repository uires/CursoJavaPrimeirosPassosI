class DadosDois{
	
	String nome;
	int idade;
	double salario;
	String telefoneCelular;


	double salarioAnual(){	
		return this.salario * 12;
	}

	void mostra(){

		System.out.println("Informações do funcionário: \n" + "NOME: " +  this.nome);
		System.out.println("IDADE FUNCIONÁRIO: " + this.idade);
		System.out.println("TELEFONE CELULAR: " + this.telefoneCelular);
		System.out.println("SALÁRIO FUNCIONÁRIO: R$ " + this.salario);
		System.out.println("SALÁRIO ANUAL: R$ " + salarioAnual());

	}
}

class metodosModelos {
	public static void main(String[] args){
		DadosDois lima = new DadosDois();

		lima.nome = "LIMA DOS SANTOS";
		lima.idade = 20;
		lima.salario = 3324.1;
		lima.telefoneCelular = "(71) 9824-7521";

		lima.mostra();




	}
}