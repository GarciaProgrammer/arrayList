package atividade1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here4
        Scanner scEntrada = new Scanner(System.in);
        Dono dono = new Dono();
        
        System.out.println("Informe seu nome:");
        dono.setNome(scEntrada.next());
        
        System.out.println("Informe sua idade");
        dono.setIdade(Integer.parseInt(scEntrada.next()));
        
        System.out.println("Quantos Pets você possui?");
        int qtdPet = Integer.parseInt(scEntrada.next());
        
        for (int i = 0; i < qtdPet; i++) {
            Pet pet = new Pet();
            System.out.println("Qual o nome do seu pet?");
            pet.setNome(scEntrada.next());

            System.out.println("Qual o tipo do seu pet?");
            pet.setTipo(scEntrada.next());

            System.out.println("Qual a cor do seu pet");
            pet.setCor(scEntrada.next());
            
            dono.setPet(pet);
        }
        
        System.out.println("Dono:" + dono.getNome());
        for (int i = 0; i < dono.getPets().size(); i++) {
            System.out.println("Pet :" + dono.getPet(i).getNome());
            System.out.println("Tipo :" + dono.getPet(i).getTipo());
            System.out.println("Cor :" + dono.getPet(i).getCor());
            System.out.println("=====================");
        }
        
        scEntrada.close();
    }
    
    
}