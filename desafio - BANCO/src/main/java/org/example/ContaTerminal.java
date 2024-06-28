package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // declaração de variáveis
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // criação do objeto da classe Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // entrada de dados
        System.out.println("Seja bem-vindo ao BANCO");
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo atual de sua conta em reais: ");
        saldo = scanner.nextDouble();

        // processamento e saída
        System.out.println(String.format("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo ));

    }
}