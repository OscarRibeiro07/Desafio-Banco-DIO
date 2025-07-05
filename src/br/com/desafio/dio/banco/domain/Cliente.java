package br.com.desafio.dio.banco.domain;

public class Cliente extends Banco{

   private String nome;
   private int idade;
   private String profissao;
   private  Banco banco;
   public Cliente(String nome, int idade, String profissao, Banco banco) {
      this.nome = nome;
      this.idade = idade;
      this.profissao = profissao;
      this.banco =banco;
   }

   public Cliente(String nome, int idade, String profissao) {
      this.nome = nome;
      this.idade = idade;
      this.profissao = profissao;
   }

   @Override
   public String toString() {
      return STR."Cliente{nome='\{nome}', idade=\{idade}, profissao='\{profissao}',\{banco}}";
   }
}
