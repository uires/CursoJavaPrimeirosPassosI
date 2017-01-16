class InteiroComWhile{
	
	/* Utilizando o laço do tipo while, tente imprimir todos os números de 150 até 300.
	Faça o laço enquanto esse valor não alcance 300. Dentro do laço não esqueça de imprimir o número e alterá-lo!
	Para isso comece declarando a variável inteira que utilizará, e configure o valor inicial dela.*/

	public static void main (String[] args){

	
		int inteiroInicial = 150;
		int limite = 300;

		while(inteiroInicial <= limite){
			System.out.println(inteiroInicial);
			inteiroInicial = inteiroInicial + 1;

		}
	}
}