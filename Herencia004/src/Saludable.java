
public class Saludable extends Comida{
    private boolean esOrigenNatural;
    
    public Saludable()
    {
        this.esOrigenNatural = false;
    }
    
    public Saludable(boolean esOrigenNatural, int codigo, String nombre, int precio, int calorias, int grasa, int sodio) {
        super(codigo, nombre, precio, calorias, grasa, sodio);
        this.esOrigenNatural = esOrigenNatural;
    }

    public boolean isEsOrigenNatural() {
        return esOrigenNatural;
    }

    public void setEsOrigenNatural(boolean esOrigenNatural) {
        this.esOrigenNatural = esOrigenNatural;
    }

    public String imprimir() {
        return "**** Producto Saludable ****" +
               "\nCódigo            : " + getCodigo() +
               "\nNombre            : " + getNombre()+
               "\nPrecio            : " + getPrecio()+
               "\nCalorias          : " + getCalorias()+
               "\nGrasa             : " + getGrasa()+
               "\nSodio             : " + getSodio()+                
               "\nes Origen Natural : " + (esOrigenNatural?"Si":"No");
    } 
    
// sobre escribir: cambiar la funcionalidad del metodo heredado

    @Override //notacion 
    public String tipoComida() {
        return "Esta comida es saludable";
    }

    @Override
    public String toString() {
        return "Saludable{" + "esOrigenNatural=" + esOrigenNatural + '}';
    }

// Sobre Carga
    
    public String cocinar()
    {
        return "Cocinar en 15 minutos";
    }
    public String cocinar(int minutos)
    {
        return "Cocinar en " + minutos + " minutos";
    }
    public String cocinar(int minutos, String tipoCoccion)
    {
        return "Cocinar en " + minutos + " minutos." +
                " Tipo cocción: " + tipoCoccion;
    }
}
