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
public class robots_pesados extends Robots{
    
    private int nelementos;
    private int peso;
    private int capacidad;

    public robots_pesados(int nelementos, int peso, int capacidad, int id, int x, int y, boolean carga, int añofab) {
        super(id, x, y, carga, añofab);
        this.nelementos = nelementos;
        this.peso = peso;
        this.capacidad = capacidad;
    }

    public int getNelementos() {
        return nelementos;
    }

    public void setNelementos(int nelementos) {
        if (nelementos > 5) {
            this.nelementos = nelementos;
        } else {
            System.out.println("El robot debe tener mas elementos");

        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (nelementos > 5) {
            this.capacidad = capacidad;
        } else {
            System.out.println("El robot debe cargar mas elementos");

        }

    }

    @Override
    public String toString() {
        return "robots_pesados{" + "nelementos=" + nelementos + ", peso=" + peso + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
