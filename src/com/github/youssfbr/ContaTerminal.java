package com.github.youssfbr;

import com.github.youssfbr.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Por favor, digite o número da Conta: ");
        final String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        final int numeroConta = Integer.parseInt(sc.nextLine());

        System.out.print("Por favor, digite o nome do Cliente: ");
        final String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo do Cliente: ");
        final Double saldoCliente = Double.valueOf(sc.nextLine());

        Conta conta = new Conta(numeroConta, agencia, nomeCliente, saldoCliente);

        System.out.println();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. " +
                "Sua agencia é %s, " +
                "Conta %d " +
                "e seu saldo de R$ %.2f já está disponível para saque.", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

        System.out.println();

        sc.close();
    }
}