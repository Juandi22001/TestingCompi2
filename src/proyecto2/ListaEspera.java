/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.dnd.Autoscroll;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaEspera{
    
   public  NodoGeneral fin= new NodoGeneral();
   public   NodoGeneral Inicio= new  NodoGeneral();
private JTable Tabla;
    public ListaEspera(NodoGeneral fin, NodoGeneral Inicio,JTable Tabla) {
        this.fin = fin;
        this.Inicio = Inicio;
    this.Tabla=Tabla;
    }

    public ListaEspera() {
    
    Inicio=null;
    fin=null;
    }
    
    
    public  void agregar(String Nombre,  String Tipo, Object Placa,String Servicio, Object Precio){
     NodoGeneral auto = new NodoGeneral();
auto.setNombre(Nombre);
 auto.setPlaca(Placa);
auto.setPrecio(Precio)
         ;
 auto.setTipo(Tipo);
auto.setNombreServicio(Servicio);
 

        if (!EstaVacia()) {
            fin.siguiente=auto;
            fin=fin.siguiente;
            
        }else{
            Inicio=fin=auto;
        }
 
}
    
    public boolean  EstaVacia(){
        return Inicio==null;
    }
        public void imprimir() {
        NodoGeneral aux = Inicio;

        while (aux != null) {
            System.out.println(aux.ToString2()); 
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
    public void agregarA() {
        NodoGeneral aux = new NodoGeneral();
        aux = Inicio;
        DefaultTableModel modeloS = (DefaultTableModel)Tabla.getModel();
        while   (aux!=null){
            String TServicios [] = aux.ToString2().split(",");
            modeloS.addRow(TServicios);
            aux =aux.siguiente;
                    
        }Tabla.setModel(modeloS);
    }
    public void MoverDatos(){
        NodoGeneral  aux = new NodoGeneral();
        aux=Inicio;
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Nombre");
   modelo2.addColumn("Tipo");
   modelo2.addColumn("Placa");
   modelo2.addColumn("Servicio");
   modelo2.addColumn("Precio");
        while (aux!=null) {            
            
        String TServicios [] = aux.ToString2().split(",");
            modelo2.addRow(TServicios);
            aux =aux.siguiente;
                    
        }Tabla.setModel(modelo2);
    }
    public void agregarFINAL(String Nombre,  String Tipo, Object Placa,String Servicio, Object Precio){
     NodoGeneral auto = new NodoGeneral();
auto.setNombre(Nombre);
auto.setPlaca(Placa);
 auto.setPrecio(Precio)
         ;
 auto.setTipo(Tipo);
auto.setNombreServicio(Servicio);
 
        if (!EstaVacia()) {
            fin.siguiente=auto;
            fin=fin.siguiente;
            
        }else{
            Inicio=fin=auto;
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


