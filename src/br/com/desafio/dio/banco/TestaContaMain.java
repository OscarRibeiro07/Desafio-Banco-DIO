package br.com.desafio.dio.banco;

import br.com.desafio.dio.banco.domain.Cliente;
import br.com.desafio.dio.banco.domain.Conta;
import br.com.desafio.dio.banco.domain.ContaCorrente;
import br.com.desafio.dio.banco.domain.ContaPoupanca;

public class TestaContaMain {
    public static void main(String[] args) {
        Cliente rafael = new Cliente("Rafael", 25, "Soldador");
        Cliente manuel = new Cliente("manuel", 25, "Cozinheiro");
        Cliente jessica = new Cliente("Jessica", 25, "Administradora");

        Conta contaRafael = new ContaCorrente(rafael);
        Conta contaManuel = new ContaPoupanca(manuel);
        Conta contaJessica = new ContaPoupanca(jessica);
        contaManuel.depositar(150);
        contaRafael.depositar(150);
        contaJessica.depositar(150);
//        cc.setCliente(rafael);
        System.out.println("==== EXTRATO DA CONTA CORRENTE  ====\n" );
        System.out.println(contaRafael);
        System.out.println("==== EXTRATO DA CONTA POUPANCA ====\n");
        System.out.println(contaJessica);
        System.out.println("==== EXTRATO DA CONTA POUPANCA ====\n");
        System.out.println(contaManuel);





    }
}
