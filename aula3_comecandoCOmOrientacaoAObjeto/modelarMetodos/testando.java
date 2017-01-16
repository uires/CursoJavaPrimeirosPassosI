class Funcionario{

	String nome;	
	double salario;
	Data data;
	void recebeAumento(double aumento){
		this.salario += aumento;
		System.out.println("Saĺário com aumento é : " + salario);
	}

	double calculaAnual(){

		return this.salario * 12;

	}
	void mostra(){

		System.out.println("Data de Entrada: " + this.data.getFormatada());
	}
}
class Data{

	int dia,mes,ano;


    String getFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}



class testUmDois {
	public static void main (String [] args){


		Funcionario f1 = new Funcionario();
		f1.nome = "mariana";
		f1.salario= 100.0;

		f1.data = new Data();
		f1.data.dia = 1;
		f1.data.mes = 4;
		f1.data.ano = 1997;

		f1.mostra();
		
	}
}


