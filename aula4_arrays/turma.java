class Turma{
	Aluno[] alunos;


}


class Aluno{

	String nome;
	int nota;


}


class TesteDaTurma{
	public static void main (String [] args){

		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10];
		
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Ale";
		fj11.alunos[0].nota = 9;

	}
}