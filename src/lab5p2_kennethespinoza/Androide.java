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
public class Androide extends Robots{
    
    int nelementos;
    int altura;
    int peso;

    public Androide(int nelementos, int altura, int peso, int id, int x, int y, boolean carga, int añofab) {
        super(id, x, y, carga, añofab);
        this.nelementos = nelementos;
        this.altura = altura;
        this.peso = peso;
    }

    public int getNelementos() {
        
        return nelementos;
    }

    public void setNelementos(int nelementos) {
        if (nelementos >= 0 && nelementos <= 2) {
            this.nelementos = nelementos;
        } else {
            System.out.println("El robot no puede cargar mas elementos");

        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"Androide{" + "nelementos=" + nelementos + ", altura=" + altura + ", peso=" + peso + '}';
    }

  
    
    
}
