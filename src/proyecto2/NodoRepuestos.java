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
public class NodoRepuestos {
        private Double idRepuestos;
    private String NombreRepuesto;
    private String Marca;
  private String Modelo;
   private Object Existencias;
   public Double Precio;
public NodoRepuestos siguiente;
public NodoRepuestos anterior;
public int Registro;
    public NodoRepuestos() {

    }

    public NodoRepuestos(Double idRepuestos, String NombreRepuesto, String Marca, String Modelo, Object Existencias, Double Precio, NodoRepuestos siguiente, NodoRepuestos anterior,int Registro) {
        this.idRepuestos = idRepuestos;
        this.NombreRepuesto = NombreRepuesto;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Existencias = Existencias;
        this.Precio = Precio;
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.Registro =Registro;
    }

     public String toString() {
        return "Nodo{" + ",ID Repuesto =" + getIdRepuestos()+ "Nombre Repuestos=" + getNombreRepuesto()+ ", Marca=" + getMarca()+",Modelo=" + getModelo() +", Existencias Producto=" + getExistencias()+", Precio=" + getPrecio()+   '}';
    }
  public String toString2() {
        return idRepuestos+","+NombreRepuesto+","+Marca+","+Modelo+","+Existencias+","+Precio;
        
    }public String toString3() {
        return idRepuestos+","+NombreRepuesto+","+Marca+","+Modelo+","+Existencias+","+Precio+","+Registro;
        
    }
    /**
     * @return the idRepuestos
     */
    public Double getIdRepuestos() {
        return idRepuestos;
    }

    /**
     * @param idRepuestos the idRepuestos to set
     */
    public void setIdRepuestos(Double idRepuestos) {
        this.idRepuestos = idRepuestos;
    }

    /**
     * @return the NombreRepuesto
     */
    public String getNombreRepuesto() {
        return NombreRepuesto;
    }

    /**
     * @param NombreRepuesto the NombreRepuesto to set
     */
    public void setNombreRepuesto(String NombreRepuesto) {
        this.NombreRepuesto = NombreRepuesto;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Existencias
     */
    public Object getExistencias() {
        return Existencias;
    }

    /**
     * @param Existencias the Existencias to set
     */
    public void setExistencias(Object Existencias) {
        this.Existencias = Existencias;
    }

    /**
     * @return the Precio
     */
    public Double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the siguiente
     */
    public NodoRepuestos getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoRepuestos siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoRepuestos getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoRepuestos anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the Registro
     */
    public int getRegistro() {
        return Registro;
    }

    /**
     * @param Registro the Registro to set
     */
    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }
    /**
     * @return the idRepuestos
     */
    
}
