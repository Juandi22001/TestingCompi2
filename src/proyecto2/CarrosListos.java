/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class CarrosListos{
    
   public  NodoGeneral fin;
   public   NodoGeneral Inicio;
    private JTable Tabla;

    public CarrosListos(NodoGeneral fin, NodoGeneral Inicio, JTable Tabla) {
        this.fin = fin;
        this.Inicio = Inicio;
        this.Tabla = Tabla;
    }
    
    public CarrosListos() {
    
    Inicio=null;
    fin=null;
    }
    
    public void agregarA() {
        NodoGeneral aux = new NodoGeneral();
        aux = Inicio;
        DefaultTableModel modeloS = (DefaultTableModel) getTabla().getModel();
        while   (aux!=null){
            String TServicios [] = aux.ToString3().split(",");
            modeloS.addRow(TServicios);
            aux =aux.siguiente;
                    
        }getTabla().setModel(modeloS);
    }
    public boolean  EstaVacia(){
        return Inicio==null;
    }
    
    public  void agregar(String Nombre,  String Tipo, Object Placa,String Servicio, Object Precio){
     NodoGeneral auto = new NodoGeneral();
auto.setNombre(Nombre);
 auto.setPlaca(Placa);
auto.setPrecio(Precio)
         ;
 auto.setTipo(Tipo);
auto.setNombreServicio(Servicio);
auto.setEstado("SIN PAGAR");
 
        if (Inicio == null) {
            Inicio= auto;
        } else {
           auto.setSiguiente(Inicio);
            Inicio= auto;
        }
        
 
}
    
    
          public void imprimir() {
        NodoGeneral aux = Inicio;

        while (aux != null) {
            System.out.println(aux.ToString2()); 
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
     public void agregarFINAL(String Nombre,  String Tipo, Object Placa,String Servicio, Object Precio){
     NodoGeneral auto = new NodoGeneral();
auto.setNombre(Nombre);
auto.setPlaca(Placa);
 auto.setPrecio(Precio)
         ;
 auto.setTipo(Tipo);
auto.setNombreServicio(Servicio);
 
        if (fin == null) {
           fin= auto;
        } else {
           auto.setSiguiente(fin);
            fin= auto;
        }
 
}

    /**
     * @return the Tabla
     */
    public JTable getTabla() {
        return Tabla;
    }

    /**
     * @param Tabla the Tabla to set
     */
    public void setTabla(JTable Tabla) {
        this.Tabla = Tabla;
    }
}

