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
public class Mago extends Personaje{
    private int sabiduria;//1 a 10
    private int magia;//1 a 10

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
    
    private void lanzarHechizo(Personaje atacado){
        int vidaAtacado = atacado.getVida();
        int nivelAtacante = this.getNivel();        
        atacado.setVida(vidaAtacado-(sabiduria * magia * nivelAtacante)/3);    
        atacado.defender(this);  
    }
    public void lazarHechizodeCuracion(Personaje aliado){
        int vidaAliado = aliado.getVida();
        if(vidaAliado>0){
            System.out.println(this.getNombre()+ " ha curado a "
                    +aliado.getNombre());
            aliado.setVida(vidaAliado + (9 * magia));
        }else
            System.out.println(aliado.getNombre()+" no puede ser curado "
                    + "por que ha muerto");
    }

    @Override
    public void atacar(Personaje atacado) {    
        if( this.getVida()>0 && atacado.getVida()>0){        
            System.out.println(this.getNombre()+" lanzo un hechizo a "+
                    atacado.getNombre());
            lanzarHechizo(atacado);
        }
        else{
            atacado.getEstado();
        }
    }

    @Override
    public void defender(Personaje atacante) {
        int vidaAtacado = this.getVida();
        int nivelAtacado = this.getNivel();   
        this.setVida(vidaAtacado + (magia * nivelAtacado));
        this.getEstado();
    }
}
