package br.com.desafio.dio.banco.domain;

public class Conta extends Banco{


    // gera de forma sequencial a implementação do numero
    private static  int NUMERODACONTA = 3;

    // gera de forma sequencial a implementação da agencia
    private static  int AGENCIA = 4591 ;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    // define que para utilizar uma conta tem que ter o cliente vinculado
    public Conta(Cliente cliente) {

        this.agencia = AGENCIA++;
        this.numero = NUMERODACONTA++;
        this.cliente=cliente;

    }

    @Override
    public String toString() {
        return STR."""
                Conta{agencia=\{agencia}, numero=\{numero}, saldo=\{saldo}
                \{cliente}}""";
    }

    public void sacar(double valorSaque){
        if (saldo>=valorSaque){
            this.saldo-=valorSaque;
        }else {
            System.out.println(STR."""
                    O seu saldo é: \{saldo}
                    valor do saque é: \{valorSaque}
                    Então não é possivel realizar o saque""");
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
