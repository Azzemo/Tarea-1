package com_example;

public class Personaje {

    String nombre;
    int vida; 
    int mana; 
    double ataque; 
    Long dinero; 
    boolean vivo;
    
    public Personaje(){
        
    }

    public Personaje(String nombre, int vida, int mana, double ataque, Long dinero, boolean vivo) {
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
        this.ataque = ataque;
        this.dinero = dinero;
        this.vivo = vivo;
    }

    @Override
    public String toString(){
         return "Personaje{"+
                 ", Nombre= "+ nombre + 
                 ", Vida= " + vida +
                 ", Mana= " + mana +
                 ", Ataque= " + ataque +
                 ", Dinero= "+ dinero +
                 ", Vivo= "+ vivo +
                 "}";
                }
}
                
    




