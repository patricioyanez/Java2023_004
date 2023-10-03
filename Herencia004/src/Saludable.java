
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
}
