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
        return super.toString()+"robots_agiles{" + "nelementos=" + nelementos + ", nllantas=" + nllantas + ", velocidad=" + velocidad + '}';
    }

    public void adv(Object[][] mapa, int x1, int y1, int x2, int y2, char tecla, int pasos) {

        int movimientos = 0;

            if (tecla == 'w') { // arriba
                if (mapa[y1 - 1][x1] == "[x]") {
                    System.out.println("Hay un obstaculo");
                } else {
                    mapa[y1 - 1][x1] = mapa[y1][x1];
                    y1 -= 1;
                    mapa[y1][x1] = null;
                    movimientos += 1;
                }
            } else if (tecla == 's') { // abajo
                if (mapa[y1 + 1][x1] == "[x]") {
                    System.out.println("Hay un obstaculo");
                } else {
                    mapa[y1 + 1][x1] = mapa[y1][x1];
                    y1 += 1;
                    mapa[y1][x1] = null;
                    movimientos += 1;
                }
            } else if (tecla == 'a') { //izquierda
                if (mapa[y1][x1 - 1] == "[x]") {
                    System.out.println("Hay un obstaculo");
                } else {
                    mapa[y1][x1 - 1] = mapa[y1][x1];
                    x1 -= 1;
                    mapa[y1][x1] = null;
                    movimientos += 1;
                }
            } else if (tecla == 'd') { // derecha
                if (mapa[y1][x1 + 1] == "[x]") {
                    System.out.println("Hay un obstaculo");
                } else {
                    mapa[y1][x1 + 1] = mapa[y1][x1];
                    x1 += 1;
                    mapa[y1][x1] = null;
                    movimientos += 1;
                }
            }
       
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
