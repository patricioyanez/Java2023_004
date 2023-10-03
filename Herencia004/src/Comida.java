
public class Comida {
    private int codigo;
    private String nombre;
    private int precio;
    private int calorias;
    private int grasa;
    private int sodio;

    public Comida()
    {
        this.codigo = 0;
        this.nombre = "";
        this.precio = 0;
        this.calorias = 0;
        this.grasa = 0;
        this.sodio = 0;
    }
    public Comida(int codigo, String nombre, int precio, int calorias, int grasa, int sodio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.grasa = grasa;
        this.sodio = sodio;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getGrasa() {
        return grasa;
    }

    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }

    public String imprimir() {
        return "Comida{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + ", grasa=" + grasa + ", sodio=" + sodio + '}';
    }
    
    
}
