package br.com.desafio.dio.banco.domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
   public static final Banco BANCO_DO_BR = new Banco("Banco do Brasil");
   public static final Banco BANCO_ITAU = new Banco("ITAU");
   public static final Banco NUBANK = new Banco("NUBANK");


   private String nome;

   public Banco(String nome) {
      this.nome = nome;
   }

    public Banco() {
      List<Banco> banco = new ArrayList<>();
    }



    @Override
   public String toString() {
      return STR."Banco{nome='\{nome}'}";
   }

   public String getNome() {
      return nome;
   }
}
