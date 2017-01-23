class Conta{
	
	public int numero;
	public int agencia;
	public String nome;
	private double saldo;
	public String cpf;

	public Conta(int numeroAdd, int agenciaAdd, String nomeAdd , String cpfAdd){
		this.numero = numeroAdd;
		this.agencia = agenciaAdd;
		this.nome = nomeAdd;
		this.cpf = cpfAdd;

	}

	// teste métodos
	public void imprimirDadosConta(String frase){
		System.out.println(frase);

	}

 
	public void depositarAoSaldo(double saldoAdicional){

		this.saldo += saldoAdicional;
		System.out.println("Senhor[a] " + nome + " o seu saldo é: " + "R$ " + saldo);

	}
	public void saca(double valorASerSacado){
		if (this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;			
		}
		
		System.out.println("Senhor[a] " + nome + " o seu saldo é: " + "R$ " + saldo);

	}
	public void transfere(double valorASerTranferido, Conta destino){
		this.saldo -= valorASerTranferido;
		destino.saldo += valorASerTranferido;

	}

}
class Programa{

	public static void main(String[] args){
		
		Conta uires = new Conta(115, 221, "Uires Deivide Santos Sousa", "220.114.448-14");


	
		
		uires.imprimirDadosConta(uires.Conta);





	}
}
