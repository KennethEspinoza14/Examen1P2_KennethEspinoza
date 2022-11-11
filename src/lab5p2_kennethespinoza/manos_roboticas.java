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
public class manos_roboticas extends Robots{
    
    private int nelementos = 1;
    private int servomotor;

    public manos_roboticas(int nelementos, int servomotor, int id, int x, int y, boolean carga, int añofab) {
        super(id, x, y, carga, añofab);
        this.nelementos = nelementos;
        this.servomotor = servomotor;
    }

    public int getNelementos() {
       
        return nelementos;
    }

    public void setNelementos(int nelementos) {
        this.nelementos = nelementos;
    }

    public int getServomotor() {
        return servomotor;
    }

    public void setServomotor(int servomotor) {
        this.servomotor = servomotor;
    }

    @Override
    public String toString() {
        return "manos_roboticas{" + "nelementos=" + nelementos + ", servomotor=" + servomotor + '}';
    }
    
    
    
}
