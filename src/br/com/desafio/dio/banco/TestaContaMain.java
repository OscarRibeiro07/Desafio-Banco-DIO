package br.com.desafio.dio.banco;

import br.com.desafio.dio.banco.domain.*;

public class TestaContaMain {
    public static void main(String[] args) {
        Cliente rafael = new Cliente("Rafael", 25, "Soldador",Banco.BANCO_ITAU);
        Cliente jones = new Cliente("Jones",26,"Banqueiro", Banco.NUBANK);

        Conta  cc = new ContaCorrente(rafael);
        Conta cp = new ContaPoupanca(rafael);
//        cc.setCliente(rafael);
        System.out.println("==== EXTRATO DA CONTA CORRENTE RAFAEL ====\n" );
        System.out.println(cc);
        System.out.println("==== EXTRATO DA CONTA POUPANCA RAFAEL ====\n");
        System.out.println(cc);
        System.out.println("==== EXTRATO DA CONTA CORRENTE JONES ====\n" );
        Conta  ccJones = new ContaPoupanca(jones);
        System.out.println(ccJones);



    }
}
