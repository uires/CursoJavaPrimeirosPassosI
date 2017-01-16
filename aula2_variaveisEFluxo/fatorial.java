class fatorial {
	public static void main(String[] args){
		long fatorial = 1L;
		
			for (int i = 1;i < 31 ;i++ ) {
				fatorial = fatorial * i;
				System.out.println("O fatorial é de: " + i + " o resultado é:  " + (long) fatorial);
			}
	}
}
