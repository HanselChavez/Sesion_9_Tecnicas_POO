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
public class Guerrero extends Personaje {
    private int fuerza;//1 a 10
    private int resistencia;// 1 a 10

    public int getFueza() {
        return fuerza;
    }
    public void setFueza(int fueza) {
        this.fuerza = fueza;
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }    
    public void ataqueEspecial(Personaje atacado){
        
        int vidaAtacado = atacado.getVida();
        if(this.getVida()>0&&vidaAtacado>0){
            System.out.println(this.getNombre()+" realizo un ataque especial a "
                    + atacado.getNombre());  
            atacado.setVida(vidaAtacado -(this.fuerza *8));    
            atacado.defender(this);    
        }else{
                 atacado.getEstado();
        }
    }

    @Override
    public void atacar(Personaje atacado) {
        int vidaAtacado = atacado.getVida();
        if(vidaAtacado>0 && this.getVida()>0){
            System.out.println(this.getNombre()+" realizo un ataque a "
                    + atacado.getNombre());   
            atacado.setVida(vidaAtacado - (this.fuerza * 5));    
            atacado.defender(this); 
        }else{
                 atacado.getEstado();
        }
    }

    @Override
    public void defender(Personaje atacante) {
        int vidaAtacado = this.getVida();
        int nivelAtacado = this.getNivel();   
        this.setVida(vidaAtacado +(resistencia * nivelAtacado));
        this.getEstado();
    }
}
