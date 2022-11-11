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
public class Robots implements Movimiento{
    
    private int id;
    private int x;
    private int y;
    private boolean carga;
    private int añofab;

    public Robots(int id, int x, int y, boolean carga, int añofab) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.carga = carga;
        this.añofab = añofab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public int getAñofab() {
        return añofab;
    }

    public void setAñofab(int añofab) {
        this.añofab = añofab;
    }

    @Override
    public String toString() {
        return "Robots{" + "id=" + id + ", x=" + x + ", y=" + y + ", carga=" + carga + ", año de fabricacion=" + añofab + '}';
    }

    @Override
    public void adv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
