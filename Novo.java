package laço_while;

import java.util.Scanner;

public class Novo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.print("Digite seu nome ou (s) para sair:");
        nome = entrada.nextLine();
        while (!nome.equals("s")) {
            System.out.printf("Bem-Vindo. %s\n", nome);
            System.out.println("Digite seu nome ou (s) para sair: ");
            nome = entrada.nextLine();
        }
        System.out.print("Fim da execução.");
    }
}