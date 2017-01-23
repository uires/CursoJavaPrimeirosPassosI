class Conta{
	// Variáveis...
	

	int numero;
	public int agencia;
	public String nome;
	private double saldo;
	private String cpf;
	private int numeroCriacaoDaConta;
	private	static int numeroDaConta = 1;
	

	public Conta(int numeroAdd, int agenciaAdd, String nomeAdd , String cpfAdd){
		this.numero = numeroAdd;
		this.agencia = agenciaAdd;
		this.nome = nomeAdd;
		this.cpf = cpfAdd;

	}

	public Conta(){

		this.numero = numeroDaConta;
		numeroDaConta++;
	}

	public int getNumeroDaConta(){
		
		return this.numero;
	}

	// teste métodos
	public void dados(String frase){
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
		
		Conta uires = new Conta();
		Conta joao = new Conta();

		System.out.println(joao.getNumeroDaConta());





	}
}
