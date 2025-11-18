package br.com.hirefair.recrutamento;

import java.util.Scanner;

public class Recrutamento {
    String nome;
    int idade;
    String[] skills;

    public void cadastrarCandidato(Scanner entrada) { // Complexidade assintótica: O(n)
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        entrada.nextLine();


        System.out.println("Digite suas skills (separado por vírgula):");
        String skillsStr = entrada.nextLine();
        skills = skillsStr.split(",");

        System.out.println("Candidato cadastrado:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Skills:");
        for (String s : skills) System.out.println("- " + s.trim());
    }
}
