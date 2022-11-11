/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_kennethespinoza;

/**
 *
 * @author Kenneth
 */
public class robots_agiles extends Robots{
    
    private int nelementos;
    private int nllantas;
    private int velocidad;

    public robots_agiles(int nelementos, int nllantas, int velocidad, int id, int x, int y, boolean carga, int añofab) {
        super(id, x, y, carga, añofab);
        this.nelementos = nelementos;
        this.nllantas = nllantas;
        this.velocidad = velocidad;
    }

    public int getNelementos() {
        return nelementos;
    }

    public void setNelementos(int nelementos) {
        this.nelementos = nelementos;
    }

    public int getNllantas() {
        return nllantas;
    }

    public void setNllantas(int nllantas) {
        this.nllantas = nllantas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

   
    
    
    
    
}
