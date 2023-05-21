/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class Arquero extends Personaje{
    private int agilidad;//1 a 10
    private int precision;//1 a 10

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    private void dispararFlecha(Personaje atacado){
        int vidaAtacado = atacado.getVida();
        int nivelAtacante = this.getNivel();  
        int daño;
                
        if(precision < 4)
            daño = precision*nivelAtacante;            
        else if(precision>= 4 && precision<9)
            daño = precision * 2 * nivelAtacante;
        else {
            Random rand = new Random();
            int num = rand.nextInt(3) + 1;
            if(num == 3){
                daño = precision * 3 * nivelAtacante;
                System.out.println(this.getNombre()
                .concat(" le ha acertado un golpe crítico a ")
                .concat(atacado.getNombre()));            
            }
            else{
                daño = precision * 2 * nivelAtacante;
            }
        }
        atacado.setVida(vidaAtacado-daño);
        atacado.defender(this);  
      
    
    }

    @Override
    public void atacar(Personaje atacado) {
        if(this.getVida()>0&&atacado.getVida()>0){   
            System.out.println(this.getNombre()+" disparo una flecha a "
                +atacado.getNombre() );
            dispararFlecha(atacado);
        } 
        else{
            atacado.getEstado();
        }
    }

    @Override
    public void defender(Personaje atacante) {
        int vidaAtacado = this.getVida();
        int nivelAtacado = this.getNivel();   
        this.setVida(vidaAtacado + (agilidad * nivelAtacado));
        this.getEstado();
    }
    
    
}
