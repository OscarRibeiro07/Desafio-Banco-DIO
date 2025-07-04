package br.com.desafio.dio.banco;

import br.com.desafio.dio.banco.domain.Conta;
import br.com.desafio.dio.banco.domain.ContaCorrente;
import br.com.desafio.dio.banco.domain.ContaPoupanca;

public class TestaContaMain {
    public static void main(String[] args) {
        Conta rafael = new ContaCorrente();
        Conta pedro = new ContaPoupanca();
        System.out.println("==== EXTRATO DA CONTA RAFAEL ====\n" );
        System.out.println(rafael);
        System.out.println("==== EXTRATO DA CONTA PEDRO ====\n");
        System.out.println(pedro);
        rafael.depositar(150);


    }
}
