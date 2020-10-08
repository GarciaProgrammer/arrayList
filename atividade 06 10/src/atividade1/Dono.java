package atividade1;

import java.util.ArrayList;

public class Dono {
    private String nome;
    private String endereco;
    private int idade;
    private ArrayList<Pet> pet = new ArrayList<Pet>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idadeParam) {
        idade = idadeParam;
    }

    public void setPet(Pet pet) {
        this.pet.add(pet);
    }
    
    public Pet getPet(int index) {
        return pet.get(index);
    }
   
    public ArrayList<Pet> getPets() {
        return this.pet;
    }
    
    
}