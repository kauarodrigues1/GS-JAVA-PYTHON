package br.com.hirefair.recrutamento;

import java.util.Scanner;

public class Vaga {
	String tituloVaga;
	String[] skillsNecessarias;
	
	public void cadastrarVaga(Scanner entrada) { // Complexidade assintótica: O(n)
        System.out.println("Digite o titulo da vaga: ");
        tituloVaga = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Digite as skills necessarias (separado por vírgula):");
        String skillsStr = entrada.nextLine();
        skillsNecessarias = skillsStr.split(",");

        System.out.println("Vaga cadastrado: ");
        System.out.println("Nome: " + tituloVaga);
        System.out.println("Skills necessarias: ");
        for (String s : skillsNecessarias) System.out.println("- " + s.trim());
	}
    

};