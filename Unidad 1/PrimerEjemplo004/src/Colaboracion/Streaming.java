
package Colaboracion;

public class Streaming {
    private Cancion cancion;
    private int segundosReproducidos;
    
    public Streaming() {
        this.cancion = null; // new Cancion();
        this.segundosReproducidos = 0;
    }
       
    public Streaming(Cancion cancion, int segundosReproducidos) {
        this.cancion = cancion;
        this.segundosReproducidos = segundosReproducidos;
    }

    public int getSegundosReproducidos() {
        return segundosReproducidos;
    }

    public void setSegundosReproducidos(int segundosReproducidos) {
        this.segundosReproducidos = segundosReproducidos;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public String imprimir() {
        return cancion.imprimir() + 
                "\nSegundos Reproducidos=" + segundosReproducidos;
    }
    
    public int segundosFaltantes()
    {
        return this.cancion.getDuracion() - segundosReproducidos;
    }
    
}
