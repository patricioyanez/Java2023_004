
import java.sql.Date;


public class GiftCard {
    private int codigo;
    private int clave;
    private int monto;
    private Date vigencia;
    private Trabajador trabajador;

    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.vigencia = null;
        this.trabajador = null;
    }
    
    public GiftCard(int codigo, int clave, int monto, Date vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajor(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String imprimir() {
        return  "Codigo              = " + codigo + 
                "Clave               = " + clave + 
                "Monto               = " + monto + 
                "Vigencia            = " + vigencia + 
                "trabajador ingresado= " + trabajador.imprimir();
    }
    
    public boolean validarClave()
    {
        String auxRut = this.trabajador.
                                getRut().
                                replace(".", "").
                                substring(0, 4);
        int auxClave = Integer.parseInt(auxRut);
//        if(auxClave == clave)
//            return true;
//        else
//            return false;
//
//        if(auxClave == clave)
//            return true;
//        return false;

        return auxClave == clave;
    }
    
    public boolean validarCompra(int montoCompra)
    {
        if(this.monto >= montoCompra)
            return true;
        return false;
    }
    
    public int descontarCompra(int montoCompra)
    {
        this.monto -= montoCompra;
        return this.monto;
    }
}
