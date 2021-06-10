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
public class NodoCarros {
    public Object Placa;
    public Object Modelo;
public String  Marca;
    public  Object Foto;
public NodoCarros siguiente;
public NodoCarros anterior;
public int repetir;

    public NodoCarros(Object Placa, Object Modelo, String Marca, Object Foto, NodoCarros siguiente, NodoCarros anterior, int repetir) {
        this.Placa = Placa;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Foto = Foto;
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.repetir = repetir;
    }
    
     public String toString() {
        return "Nodo{" + ",PLACA=" + getPlaca()+ "Modelo=" + getModelo()+ ", Marca=" + getMarca()+",Archivo Foto=" + getFoto()+
               +   '}';
    }

     public String toString2() {
        return Placa.toString()+","+Marca+","+Modelo+","+Foto.toString();
     
     
     }
     public String toString3() {
      return Placa.toString()+","+Marca+","+Modelo+","+Foto.toString()+","+repetir;
     }
     public NodoCarros() {
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
     * @return the Modelo
     */
    public Object getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(Object Modelo) {
        this.Modelo = Modelo;
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
     * @return the Foto
     */
    public Object getFoto() {
        return Foto;
    }

    /**
     * @param Foto the Foto to set
     */
    public void setFoto(Object Foto) {
        this.Foto = Foto;
    }

    /**
     * @return the siguiente
     */
    public NodoCarros getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCarros siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoCarros getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoCarros anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the repetir
     */
    public int getRepetir() {
        return repetir;
    }

    /**
     * @param repetir the repetir to set
     */
    public void setRepetir(int repetir) {
        this.repetir = repetir;
    }
    
    
}
