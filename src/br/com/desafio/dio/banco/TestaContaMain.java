package br.com.desafio.dio.banco;

import br.com.desafio.dio.banco.domain.Cliente;
import br.com.desafio.dio.banco.domain.Conta;
import br.com.desafio.dio.banco.domain.ContaCorrente;
import br.com.desafio.dio.banco.domain.ContaPoupanca;

public class TestaContaMain {
    public static void main(String[] args) {
        Cliente rafael = new Cliente("Rafael", 25, "Soldador");

        Conta  cc = new ContaCorrente(rafael);
        Conta cp = new ContaPoupanca(rafael);
//        cc.setCliente(rafael);
        System.out.println("==== EXTRATO DA CONTA CORRENTE  ====\n" );
        System.out.println(cc);
        System.out.println("==== EXTRATO DA CONTA POUPANCA ====\n");
        System.out.println(cc);



    }
}
