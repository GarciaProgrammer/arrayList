
package atividade2;

import java.util.Scanner;
import static javax.print.attribute.Size2DSyntax.MM;

public class Principal {
    
    public static void main (String[] args){
        
        
        Scanner teclado = new Scanner (System.in);
        Pessoa pessoa = new Pessoa ();
        

        System.out.println("Digite seu nome:");
        pessoa.setNome(teclado.nextLine());
        
        System.out.println("Digite seu sexo:");
        pessoa.setSexo(teclado.nextLine());
        
        System.out.println("Digite a quantidade de compromissos que você tem:");
        int qtd = Integer.parseInt(teclado.next());
        
        for (int i = 0; i < qtd; i ++){
            Compromisso compromisso = new Compromisso();
            System.out.println("Digite o titulo do compromisso:");
            compromisso.setTitulo(teclado.next());
            
            System.out.println("Digite o tipo do compromisso:");
            compromisso.setTipo(teclado.next());
            
            System.out.println("Digite a data do compromisso::");
            compromisso.setData(teclado.next());
            
            
            System.out.println("Digite o local do compromisso:");
            compromisso.setLocal(teclado.next());
            
            pessoa.setCompromisso(compromisso);
        }
        System.out.println("Nome:" + pessoa.getNome());
        System.out.println("Sexo:" + pessoa.getSexo());
        for(int i = 0; i < pessoa.getCompromissos().size(); i ++){
            System.out.println("Titulo: " + pessoa.getCompromisso(i).getTitulo());
            System.out.println("Tipo: " + pessoa.getCompromisso(i).getTipo());
            System.out.println("Data: " + pessoa.getCompromisso(i).getData());
            System.out.println("Local: " + pessoa.getCompromisso(i).getLocal());
            System.out.println("*--------------------------------*");
        }
        
        System.exit(0);
    }
}
