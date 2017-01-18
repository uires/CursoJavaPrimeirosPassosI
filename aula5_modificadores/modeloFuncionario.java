class Funcionario{
	public static void main(String[] args) {
	
		Conta joao = new Conta();
		
		joao.titular = new Cliente ();


		joao.titular.nome = "JOAO DORIS";
		joao.depositaValor(599.1);
		joao.numero = 221;


		joao.setLimit(600.0);

		System.out.println(joao.getSaldo());

		joao.saca(598.1);

		joao.depositaValor(3353.9);

		


	}


}