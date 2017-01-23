class Conta{
	
	int numero;
	int agencia;
	String nome;
	double saldo;
	long cpfl;
	void depositarAoSaldo(double saldoAdicional){

		this.saldo += saldoAdicional;
		System.out.println("Senhor[a] " + nome + " o seu saldo é: " + "R$ " + saldo);

	}
	void saca(double valorASerSacado){
		if (this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;			
		}
		
		System.out.println("Senhor[a] " + nome + " o seu saldo é: " + "R$ " + saldo);

	}
	void transfere(double valorASerTranferido, Conta destino){
		this.saldo -= valorASerTranferido;
		destino.saldo += valorASerTranferido;

	}

}
class Programa{

	public static void main(String[] args){
		Conta uires = new Conta();
		
		
		uires.numero = 30034;
		uires.nome = "UIRES DEIVIDE SANTOS SOUSA";
		uires.saldo = 3000.0;
		uires.agencia = 220;
		
		// Fim conta cliente  -- 
		uires.depositarAoSaldo(33124.0);
		uires.saca(5000.0);


		Conta poliana = new Conta();
		poliana.numero = 20034;
		poliana.nome = "POLIANA SANTOS SANTANA";
		poliana.saldo = 3323.3;
		poliana.agencia = 221;

		poliana.depositarAoSaldo(5541.0);



		uires.transfere(3000.0, poliana);
		System.out.println("O saldo de POLIANA É: R$ " + poliana.saldo);

	}
}
