package br.com.desafio.dio.banco.domain;

public class Cliente {

   private String nome;
   private int idade;
   private String profissao;

   public Cliente(String nome, int idade, String profissao) {
      this.nome = nome;
      this.idade = idade;
      this.profissao = profissao;
   }

   @Override
   public String toString() {
      return "Cliente{" +
              "nome='" + nome + '\'' +
              ", idade=" + idade +
              ", profissao='" + profissao + '\'' +
              '}';
   }
}
