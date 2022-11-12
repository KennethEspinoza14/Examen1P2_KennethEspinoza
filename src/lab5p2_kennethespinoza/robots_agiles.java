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
    
    private int nelementos = 1;
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

    @Override
    public String toString() {
        return "robots_agiles{" + "nelementos=" + nelementos + ", nllantas=" + nllantas + ", velocidad=" + velocidad + '}';
    }

   public void gir(int ang, char tecla) {

        // w = arriba
        // s = abajo
        // a = izquierda
        // d = derecha
        
        if (ang == 90 & tecla == 'a') {
            tecla = 'w';
        } else if (ang == 90 & tecla == 'd') {
            tecla = 's';
        } else if (ang == 90 & tecla == 'w') {
            tecla = 'd';
        } else if (ang == 90 & tecla == 's') {
            tecla = 'a';
        }

        if (ang == 180 & tecla == 'a') {
            tecla = 'd';
        } else if (ang == 180 & tecla == 'd') {
            tecla = 'a';
        } else if (ang == 180 & tecla == 'w') {
            tecla = 'a';
        } else if (ang == 180 & tecla == 's') {
            tecla = 's';
        }

        if (ang == 270 & tecla == 'a') {
            tecla = 'd';
        } else if (ang == 270 & tecla == 'd') {
            tecla = 's';
        } else if (ang == 270 & tecla == 'w') {
            tecla = 'a';
        } else if (ang == 270 & tecla == 's') {
            tecla = 'd';
        }
    }
    
    
    
    
}
