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
public class NodoSevicio {

    private Double idservicio;
    public String NombreServicio;
    public String MarcaS;
    public String ModeloS;
    public Double PrecioManodeObra;
    public Object PrecioTotal;
    public NodoSevicio siguiente;
    public NodoSevicio anterior;
    public ListaRepuestos ListaRepuestos = new ListaRepuestos();
    public int Registro;
    private NodoRepuestos ListaRST;

    public NodoSevicio() {
    }

    public NodoSevicio(Double idservicio, String NombreServicio, String MarcaS, String ModeloS, Double PrecioManodeObra, Object PrecioTotal, NodoSevicio siguiente, NodoSevicio anterior, ListaRepuestos ListaRepuestos, int Registro, NodoRepuestos ListaRST) {
        this.idservicio = idservicio;
        this.NombreServicio = NombreServicio;
        this.MarcaS = MarcaS;
        this.ModeloS = ModeloS;
        this.PrecioManodeObra = PrecioManodeObra;
        this.PrecioTotal = PrecioTotal;
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.ListaRepuestos = ListaRepuestos;
        this.Registro = Registro;
        this.ListaRST = ListaRST;
    }

    public String toString() {
        return "Nodo{" + ",ID Servicio =" + getIdservicio() + "Nombre Servicio=" + getNombreServicio() + ", Marca=" + getMarcaS() + ",Modelo=" + getModeloS()
                + ", Precio Mano de obra=" + getPrecioManodeObra() + ", Precio Total=" + getPrecioTotal() + ", Lista Repuestos=" + ListaRepuestos.imprimir() + '}';
    }

    public String toString2() {
        return NombreServicio + "/" + MarcaS + "/" + ModeloS + "/" + PrecioTotal + "/" + idservicio;
    }

    public String toString3() {
        return NombreServicio + "/" + MarcaS + "/" + ModeloS + "/" + PrecioTotal + "/" + Registro;
    }

    /**
     * @return the idservicio
     */
    public Double getIdservicio() {
        return idservicio;
    }

    /**
     * @param idservicio the idservicio to set
     */
    public void setIdservicio(Double idservicio) {
        this.idservicio = idservicio;
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
     * @return the MarcaS
     */
    public String getMarcaS() {
        return MarcaS;
    }

    /**
     * @param MarcaS the MarcaS to set
     */
    public void setMarcaS(String MarcaS) {
        this.MarcaS = MarcaS;
    }

    /**
     * @return the ModeloS
     */
    public String getModeloS() {
        return ModeloS;
    }

    /**
     * @param ModeloS the ModeloS to set
     */
    public void setModeloS(String ModeloS) {
        this.ModeloS = ModeloS;
    }

    /**
     * @return the PrecioManodeObra
     */
    public Double getPrecioManodeObra() {
        return PrecioManodeObra;
    }

    /**
     * @param PrecioManodeObra the PrecioManodeObra to set
     */
    public void setPrecioManodeObra(Double PrecioManodeObra) {
        this.PrecioManodeObra = PrecioManodeObra;
    }

    /**
     * @return the PrecioTotal
     */
    public Object getPrecioTotal() {
        return PrecioTotal;
    }

    /**
     * @param PrecioTotal the PrecioTotal to set
     */
    public void setPrecioTotal(Object PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    /**
     * @return the siguiente
     */
    public NodoSevicio getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSevicio siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoSevicio getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoSevicio anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the ListaRepuestos
     */
    public ListaRepuestos getListaRepuestos() {
        return ListaRepuestos;
    }

    /**
     * @param ListaRepuestos the ListaRepuestos to set
     */
    public void setListaRepuestos(ListaRepuestos ListaRepuestos) {
        this.ListaRepuestos = ListaRepuestos;
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
     * @return the ListaRST
     */
    public NodoRepuestos getListaRST() {
        return ListaRST;
    }

    /**
     * @param ListaRST the ListaRST to set
     */
    public void setListaRST(NodoRepuestos ListaRST) {
        this.ListaRST = ListaRST;
    }

    /**
     * @return the idservicio
     */
}
