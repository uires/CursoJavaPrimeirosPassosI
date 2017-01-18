class Conta{
	

	
	public int numero;
	Cliente titular;
	private double saldo;
	public double limite;
	

	public void frase(String frase){

		System.out.println(frase);
	}


	public void depositaValor(double valor){

		this.saldo = this.saldo + valor;
		System.out.println("Senhor[a] " + this.titular.nome + " seu saldo é: R$" + getSaldo());
		
	}


	public double getSaldo(){

		return this.saldo;
	}


	public void saca(double valorASacar){
		if (this.limite >= valorASacar && this.saldo > valorASacar) {
			this.saldo -= valorASacar;	
			frase("Saque executado com sucesso !");
			frase("Saque de: R$ " + valorASacar);
			frase("Seu saldo atual é: R$ " + this.getSaldo());


		}else{
			frase("Você não pode sacar o valor menor que seu limite! ");
		}
	}

	public void setLimit(double newLimit){

		this.limite = newLimit;


	}

	public void deposita(double valorASerDepositado){

		this.saldo += valorASerDepositado;
		frase("Seu novo saldo é: R$ " + this.saldo);	

	}
}

class Cliente {
	String nome;
	String endereco;

}