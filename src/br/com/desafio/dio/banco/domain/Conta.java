package br.com.desafio.dio.banco.domain;

public class Conta extends Banco{


    private static  int NUMERODACONTA = 003;
    private static  int AGENCIA = 4591 ;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA++;
        this.numero = NUMERODACONTA++;
    }

    @Override
    public String toString() {
        return "Conta:" +
                "\nagencia:" + agencia +
                "\nnumero: " + numero +
                "\nsaldo: " + saldo;
    }

    public void sacar(double valorSaque){
        if (saldo>=valorSaque){
            this.saldo-=valorSaque;
        }else {
            System.out.println("O seu saldo é: " + saldo
                    + "\nvalor do saque é: " + valorSaque +"\n" + "Então não é possivel realizar o saque");
        }
    }

    public  void depositar(double valor){
        saldo+=valor;
    }
    public  void transferir(double valor, Conta contaDestino){
        if (saldo>=valor){
        saldo-=valor;
        contaDestino.depositar(valor);
        }else {
            System.out.println("Não possui saldo suficiente");
        }

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
