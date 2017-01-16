class somaMil{
	
	/*Imprima a soma de 1 até 1000 (inclusive).
	Para isso você deve utilizar alguma variável extra que armazena a soma temporária e aumentá-la a cada novo passo. Compartilhe sua solução.*/

	public static void main(String[] args){
		int soma = 0;

		for (int i = 0;i <= 999; i++){
			
			soma = soma + 1;
			System.out.println( "\n" + soma);			

		}
	}
}