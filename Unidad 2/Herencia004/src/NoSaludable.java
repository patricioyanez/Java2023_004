
public class NoSaludable extends Comida {
    private String marca;

    public NoSaludable(){
        this.marca = marca;
    }
    public NoSaludable(String marca, int codigo, String nombre, int precio, int calorias, int grasa, int sodio) {
        super(codigo, nombre, precio, calorias, grasa, sodio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String imprimir() {
        return "NoSaludable{" + "marca=" + marca + '}';
    }
    
    
}
