/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Entidades.*;

/**
 *
 * @author chave
 */
public class Main {
    public static void main(String[] args){
       
        Mago mago = new Mago();
        mago.setNombre("Oz");
        mago.setVida(100);
        mago.setNivel(2);
        mago.setMagia(5);
        mago.setSabiduria(5);
        
        Guerrero guerrero = new Guerrero();
        guerrero.setNombre("Hercules");
        guerrero.setVida(100);
        guerrero.setNivel(3);
        guerrero.setFueza(8);
        guerrero.setResistencia(5);
        
        Arquero arquero = new Arquero();
        arquero.setNombre("Robin Hood");
        arquero.setVida(100);
        arquero.setNivel(3);
        arquero.setPrecision(8);
        arquero.setAgilidad(5);
        
        
       
        arquero.atacar(guerrero);
        
        guerrero.ataqueEspecial(arquero);
       
        arquero.atacar(guerrero);      
        
        guerrero.ataqueEspecial(arquero);        
        
        arquero.atacar(guerrero);
        mago.lazarHechizodeCuracion(arquero);
         
        guerrero.ataqueEspecial(arquero);
        
        
    }
    
}
