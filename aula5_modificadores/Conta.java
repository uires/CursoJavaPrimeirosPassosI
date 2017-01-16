class Conta{
	/*Adicione o modificador de visibilidade (private ou public, se necessário) para cada atributo e método da classe Funcionario. 
	Tente criar um Funcionario no main e modificar ou ler um de seus atributos privados. O que acontece?
	Compartilhe o código de sua classe Funcionario.*/


	public int numero;
	public String nome;
	public double saldo;
	public double limite;


	void saca(double valorASacar){
		if (this.limite >= valorASacar) {
			this.saldo -= valorASacar;
		}else{
			System.out.println("Você não pode sacar o valor menor que seu limite! ");
		}
	}


	void deposita(double valorASerDepositado){

		this.saldo += valorASerDepositado;

	}
}

