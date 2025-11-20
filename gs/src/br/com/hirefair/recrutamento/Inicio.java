package br.com.hirefair.recrutamento;

import java.util.Scanner;

public class Inicio {
	
	Scanner entrada = new Scanner(System.in);
	
	public void iniciarPrograma() { // Complexidade assintótica: O(n + m)
		System.out.println("Escolha o que deseja fazer: \n 1 - Cadastrar candidato. \n 2 - Cadastrar vaga. \n 3 - Contratar. \n Digite a opção que deseja: ");
		
		int opcao = entrada.nextInt();
		
		if (opcao ==1) {
			Recrutamento candidato1 = new Recrutamento();
			candidato1.cadastrarCandidato(entrada);
		}
		else if (opcao ==2) {
			Vaga vaga1 = new Vaga();
			vaga1.cadastrarVaga(entrada);
		}
		else if (opcao == 3) {
		    Recrutamento candidato = new Recrutamento();
		    candidato.cadastrarCandidato(entrada);

		    Vaga vaga = new Vaga();
		    vaga.cadastrarVaga(entrada);

		    Contrato contrato = new Contrato();
		    contrato.avaliarCandidato(candidato, vaga);

		    contrato.mostrarHistorico();
		}


	}

}
