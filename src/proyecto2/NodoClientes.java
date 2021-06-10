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
public class NodoClientes {

    private Object DpiCliente;
    private String NombreCliente;
    private String NombreUsuario;
    private Object Contraseña;
    private     String TipoCliente;
    public NodoClientes siguiente;
public NodoClientes anterior;
private int Registro;

    public ListaCarros ListaCarros=new  ListaCarros();

    public NodoClientes() {
    }

    public NodoClientes(Object DpiCliente, String NombreCliente, String NombreUsuario, Object Contraseña, String TipoCliente,int  Registro, ListaCarros ListaCarros) {
        this.DpiCliente = DpiCliente;
        this.NombreCliente = NombreCliente;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        this.TipoCliente = TipoCliente;
        this.Registro=Registro;
        siguiente = this;

        this.ListaCarros = ListaCarros;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nodo{" + ",Dpi Cliente="
                + getDpiCliente() + "Nombre Cliente="
  
              + getNombreCliente() + ", NombreUsuario=" + getNombreUsuario() + ",Contraseña=" + getContraseña() + ", TipoCliente=" + getTipoCliente() + ", ListaVehiculos=" + ListaCarros.imprimir() + '}';
    }
    public String Tostring2(){
        return DpiCliente+","+NombreCliente+","+NombreUsuario+","+Contraseña+","+TipoCliente+","+ListaCarros.imprimir();
    }
    /**
     * @return the DpiCliente
     */
    public Object getDpiCliente() {
        return DpiCliente;
    }

    /**
     * @param DpiCliente the DpiCliente to set
     */
    public void setDpiCliente(Object DpiCliente) {
        this.DpiCliente = DpiCliente;
    }

    /**
     * @return the NombreCliente
     */
    public String getNombreCliente() {
        return NombreCliente;
    }

    /**
     * @param NombreCliente the NombreCliente to set
     */
    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    /**
     * @return the NombreUsuario
     */
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    /**
     * @param NombreUsuario the NombreUsuario to set
     */
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    /**
     * @return the Contraseña
     */
    public Object getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(Object Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the TipoCliente
     */
    public String getTipoCliente() {
        return TipoCliente;
    }

    /**
     * @param TipoCliente the TipoCliente to set
     */
    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    /**
     * @return the siguiente
     */
    public NodoClientes getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoClientes siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoClientes getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoClientes anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the ListaCarros
     */
    public ListaCarros getListaCarros() {
        return ListaCarros;
    }

    /**
     * @param ListaCarros the ListaCarros to set
     */
    public void setListaCarros(ListaCarros ListaCarros) {
        this.ListaCarros = ListaCarros;
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
}
