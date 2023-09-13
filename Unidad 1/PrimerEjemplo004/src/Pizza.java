// comentario

/*
    comentario más de una línea
*/
public class Pizza {
    // atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    
    // constructores
    public Pizza() // sin parametros
    {
        nombre = "";
        tamano = "personal";
        masa = "";
        precio = 0;
    }
    public Pizza(String nombre, String tamano, String masa, int precio)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        this.precio = precio;
    }
    
    
    // getter and setter (accesadores y mutadores)
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // métodos customer (personalizado)
    public void calentar()
    {
        System.out.println("La Pizza se está calentando...");
    }
    public void preparar()
    {
        System.out.println("La Pizza se está preparando...");
    }
    public String datos()
    {
        return "Nombre      : " + this.nombre +
               "\nTamaño      : " + this.tamano +
               "\nMasa        : " + this.masa +
               "\nPrecio      : " + this.precio;
    }
}
