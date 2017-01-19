class FuncionariosEmpressa{


	public InformacoesFuncionario[] informacoes;


	public void imprimeFuncionarios(){
		for(int i = 0 ; i < this.informacoes.length; i++){
			InformacoesFuncionario informacoes = this.informacoes [i];	

			if(informacoes == null	) continue;
			System.out.println("Nome funcionário- "+ informacoes.nomeFuncionario + "\nSalário é : R$ " +  informacoes.salarioFuncionario + "\n\n");
			
		}
	}

	}

	public boolean contem(InformacoesFuncionario funcionario1){

		for(int i = 0 ; i < this.informacoes.length; i++){
			if (funcionario1 == this.informacoes[i]) {
				return true;				
			}
		}return false;
	}	


}




class InformacoesFuncionario{

	String nomeFuncionario;
	double salarioFuncionario;
	int cpfFuncionario;

}




class FuncionarioModelo{
	public static void main (String[] args){
		
		

		FuncionariosEmpressa funcionario1 = new FuncionariosEmpressa();
		funcionario1.informacoes = new InformacoesFuncionario[10];
		funcionario1.informacoes[0] = new InformacoesFuncionario();

		funcionario1.informacoes[0].nomeFuncionario = "Alejandro Santoro";
		funcionario1.informacoes[0].salarioFuncionario = 3002.1;
	

			

		funcionario1.informacoes[1] = new InformacoesFuncionario();

		funcionario1.informacoes[1].nomeFuncionario = "Mariana Santoro";
		funcionario1.informacoes[1].salarioFuncionario = 23002.1;
	

			

		funcionario1.informacoes[2] = new InformacoesFuncionario();

		funcionario1.informacoes[2].nomeFuncionario = "Luiz dos Santos";
		funcionario1.informacoes[2].salarioFuncionario = 302.1;
	

			
		funcionario1.informacoes[3] = new InformacoesFuncionario();

		funcionario1.informacoes[3].nomeFuncionario = "Jonatham Olivera";
		funcionario1.informacoes[3].salarioFuncionario = 4232.1;

		funcionario1.imprimeFuncionarios();
	


	}
}