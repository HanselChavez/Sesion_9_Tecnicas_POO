/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Estudiante
 */
public abstract class Personaje {

    private String nombre;
    private int vida;// 1 a 100
    private int nivel;// 1 a 3
   
    public String getNombre() {
        return nombre;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
  
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
  
   
    public void getEstado(){
        if(this.vida<=0)
            System.out.println("\t"+this.nombre + " ha muerto.");
        else 
            System.out.println("\t"+this.nombre+ " tiene " +vida+" de vida");
    }
    public abstract void atacar(Personaje atacado);
    public abstract void defender(Personaje atacante);
}
