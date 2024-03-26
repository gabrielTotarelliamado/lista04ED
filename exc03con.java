package controller;

import br.edu.fateczl.pilhaint.*;
public class exc03con {
	public exc03con() {
		super();
	}
	 
	public static int FatController(int num) throws Exception {
	int aux;
		Pilha pi = new Pilha();	
	int fat = 1;
	
	for (int i = 1; i <= num; i++) {
		pi.push(i);
	}
	for (int b = 1; b<=num;b++) {
	aux = pi.pop();
	fat = fat * aux;
	}
	
	
	return fat;
	}

	

}
