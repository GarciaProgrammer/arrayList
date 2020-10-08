
package atividade2;

import java.util.ArrayList;


public class Pessoa {
    
    private String nome;
    private String sexo;
    ArrayList <Compromisso> compromisso = new ArrayList<Compromisso>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCompromisso(Compromisso maisCompromisso){
        this.compromisso.add(maisCompromisso);
    }
    
    public Compromisso getCompromisso(int i){
        return this.compromisso.get(i);
    }
    
    public ArrayList<Compromisso> getCompromissos(){
        return this.compromisso;
    }
}
