package br.com.hirefair.recrutamento;

import java.util.*;

public class Contrato {

    // LISTA LIGADA 
    LinkedList<String> historicoContratacao = new LinkedList<>();

    // FILA 
    Queue<String> filaCandidatos = new LinkedList<>();

    // PILHA 
    Stack<String> log = new Stack<>();


    public void avaliarCandidato(Recrutamento candidato, Vaga vaga) { // Complexidade assintótica: O(n x m)
        filaCandidatos.add(candidato.nome);
        log.push("Candidato " + candidato.nome + " entrou na fila.");
        

        //ARRAY 
        String[] skillsCandidato = candidato.skills;
        String[] skillsNecessarias = vaga.skillsNecessarias;

        int totalSkills = skillsNecessarias.length;
        int match = 0;

        for (String skillNec : skillsNecessarias) {
            for (String skillUser : skillsCandidato) {
                if (skillUser.trim().equalsIgnoreCase(skillNec.trim())) {
                    match++;
                    break;
                }
            }
        }

        int score = (int) (((double) match / totalSkills) * 100);

        //LinkedList
        historicoContratacao.add(candidato.nome + " → Score: " + score + "%");
        log.push("Score calculado: " + score + "%");

        System.out.println("\n===== Resultado da Avaliação =====");
        System.out.println("Candidato: " + candidato.nome);
        System.out.println("Vaga: " + vaga.tituloVaga);
        System.out.println("Skills necessárias: " + totalSkills);
        System.out.println("Skills compatíveis: " + match);
        System.out.println("Score final: " + score + "%");

        filaCandidatos.poll();
    }


    public void mostrarHistorico() {
        System.out.println("\n===== Histórico de Contratações =====");
        for (String item : historicoContratacao) {
            System.out.println(item);
        }

        System.out.println("\n===== LOG (Pilha) =====");
        while (!log.isEmpty()) {
            System.out.println(log.pop());
        }
    }

}
