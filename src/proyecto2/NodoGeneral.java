/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class NodoGeneral {
    private  String Nombre;
    private  String tipo;
  
    private  Object Placa;
    private   String NombreServicio;
    private  Object Precio;
  public NodoGeneral siguiente;
public NodoGeneral anterior;
private String estado;

    public NodoGeneral(String Nombre, String tipo, Object Placa, String NombreServicio, Object Precio, NodoGeneral siguiente, NodoGeneral anterior) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.Placa = Placa;
        this.NombreServicio = NombreServicio;
        this.Precio = Precio;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    public String ToString2(){
    return Nombre+","+tipo+","+Placa+","+NombreServicio+","+Precio;
}

    public String ToString3(){
    return Nombre+","+tipo+","+Placa+","+NombreServicio+","+Precio+","+estado;
}

    public NodoGeneral() {
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Placa
     */
    public Object getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(Object Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the NombreServicio
     */
    public String getNombreServicio() {
        return NombreServicio;
    }

    /**
     * @param NombreServicio the NombreServicio to set
     */
    public void setNombreServicio(String NombreServicio) {
        this.NombreServicio = NombreServicio;
    }

    /**
     * @return the Precio
     */
    public Object getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(Object Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the siguiente
     */
    public NodoGeneral getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoGeneral siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoGeneral getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoGeneral anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the Nombre
     */

}
