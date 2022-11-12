
package lab5p2_kennethespinoza;

/**
 *
 * @author Kenneth
 */
public class Androide extends Robots {

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
        return super.toString() + "Androide{" + "nelementos=" + nelementos + ", altura=" + altura + ", peso=" + peso + '}';
    }

    public void adv(Object[][] mapa, int x1, int y1, int x2, int y2, char tecla, int pasos) {

        int movimientos = 0;

        if (pasos == 1) {
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
