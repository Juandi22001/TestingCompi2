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
public class NodoEmpleados {
    private int idEmpleado;
    private Object NombreEmpleado;
    private Object RolEmpleado;
   private Object NombreUsuarioEmpleado;
   private Object ContraseñaEmpleado;
public NodoEmpleados siguiente;
public  NodoEmpleados anterior;
    public NodoEmpleados() {
    }

    public NodoEmpleados(int idEmpleado, Object NombreEmpleado, Object RolEmpleado, Object NombreUsuarioEmpleado, Object ContraseñaEmpleado, NodoEmpleados siguiente, NodoEmpleados anterior) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.RolEmpleado = RolEmpleado;
        this.NombreUsuarioEmpleado = NombreUsuarioEmpleado;
        this.ContraseñaEmpleado = ContraseñaEmpleado;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
public NodoEmpleados (int idEmpleado, Object NombreEmpleado, Object RolEmpleado, Object NombreUsuarioEmpleado, Object ContraseñaEmpleado){
    this(idEmpleado,NombreEmpleado,RolEmpleado,NombreUsuarioEmpleado,ContraseñaEmpleado,null,null);
}    
     public String toString() {
        return "Nodo{" + ",ID =" + getIdEmpleado()+ "Nombre=" + getNombreEmpleado()  + ", Rol=" + getRolEmpleado()+""
                + ", Nombre Usuario=" + getNombreUsuarioEmpleado() +", CONTRASEÑA=" + getContraseñaEmpleado()+   '}';
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the NombreEmpleado
     */
    public Object getNombreEmpleado() {
        return NombreEmpleado;
    }

    /**
     * @param NombreEmpleado the NombreEmpleado to set
     */
    public void setNombreEmpleado(Object NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    /**
     * @return the RolEmpleado
     */
    public Object getRolEmpleado() {
        return RolEmpleado;
    }

    /**
     * @param RolEmpleado the RolEmpleado to set
     */
    public void setRolEmpleado(Object RolEmpleado) {
        this.RolEmpleado = RolEmpleado;
    }

    /**
     * @return the NombreUsuarioEmpleado
     */
    public Object getNombreUsuarioEmpleado() {
        return NombreUsuarioEmpleado;
    }

    /**
     * @param NombreUsuarioEmpleado the NombreUsuarioEmpleado to set
     */
    public void setNombreUsuarioEmpleado(Object NombreUsuarioEmpleado) {
        this.NombreUsuarioEmpleado = NombreUsuarioEmpleado;
    }

    /**
     * @return the ContraseñaEmpleado
     */
    public Object getContraseñaEmpleado() {
        return ContraseñaEmpleado;
    }

    /**
     * @param ContraseñaEmpleado the ContraseñaEmpleado to set
     */
    public void setContraseñaEmpleado(Object ContraseñaEmpleado) {
        this.ContraseñaEmpleado = ContraseñaEmpleado;
    }

    /**
     * @return the siguiente
     */
    public NodoEmpleados getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoEmpleados siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoEmpleados getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoEmpleados anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the idEmpleado
     */

}
