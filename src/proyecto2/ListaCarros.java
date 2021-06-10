/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static proyecto2.ListaRepuestos.contadorRepuestos;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaCarros {
     NodoCarros  A1 = new NodoCarros ();
     NodoCarros  A2 = new NodoCarros ();  
     NodoCarros  A3 = new NodoCarros ();             
         NodoCarros  A4 = new NodoCarros ();
              NodoCarros  A5 = new NodoCarros ();
    NodoCarros repetidos = null;
    private JTable Tabla;
    public static int contadorempleados=0;
     
NodoCarros Inicio = null;
NodoCarros fin=null;

    public ListaCarros() {
        Inicio = null;
        fin=null;
    }
public void repetido(NodoCarros carro){
    NodoCarros nuevo = new NodoCarros();
    nuevo=carro;
    nuevo.setMarca(carro.getMarca());
    nuevo.setModelo(carro.getModelo());
    nuevo.setPlaca(carro.getPlaca());
    nuevo.setFoto(carro.getFoto());
    NodoCarros prueba = Listas.listaCarros.Inicio;
    int c=0;
    do {        
        if (nuevo.getMarca().equals(prueba.getMarca()) && nuevo.getModelo().equals(prueba.getModelo())) {
            c++;
        }
        prueba=prueba.getSiguiente();
    } while (prueba!=Listas.listaCarros.Inicio);
    int d1=0,d2=0,d3=0,d4=0,d5=0;
    if (A1!=null) {
        d1=A1.getRepetir();
    }
    if (A2!=null) {
        d2=A2.getRepetir();
    }
    if (A3!=null) {
        d3=A3.getRepetir();
    }
    if (A4!=null) {
        d4=A4.getRepetir();
    }
    if (A5!=null) {
        d5=A5.getRepetir();
    }
    nuevo.setRepetir(c);
    if (c>=d1) {
        A5=A4;
        A4=A3;
        A3=A2;
        A2=A1;
        A1=nuevo;
    }else if (c>=d2) {
        A5=A4;
        A4=A3;
        A3=A2;
        A2=nuevo;
    }else if (c>=d3) {
        A5=A4;
        A4=A3;
        A3=nuevo;
    }else if (c>=d4) {
        A5=A4;
        A4=nuevo;
    }else if (c>=d5) {
        A5=nuevo;
    }
}
// 
public void ordenar(){
    repetidos=A1;
    A1.setSiguiente(A2);
    A2.setSiguiente(A3);
    A3.setSiguiente(A4);
    A4.setSiguiente(A5);
    A5.setSiguiente(null);
}
    public ListaCarros(NodoCarros Inicio,NodoCarros Fin,JTable Tabla) {
        this.Inicio = Inicio;
        this.fin= Fin;
        this.Tabla = Tabla;
    }
    public boolean  EstaVacia(){
        return Inicio==null;
    }
    
        public void Agregar( Object Placa, Object Modelo, String Marca, Object Foto) {
       
 NodoCarros NuevoNodo = new NodoCarros
        ();
      NuevoNodo.setPlaca(Placa);
 NuevoNodo.setModelo(Modelo);
             NuevoNodo.setMarca(Marca);
        NuevoNodo.setFoto(Foto);


        if (EstaVacia()) {

            Inicio= fin=NuevoNodo;
            
            
            NuevoNodo.setSiguiente(fin);
        } else {
            fin.setSiguiente(NuevoNodo);
            NuevoNodo.setSiguiente(Inicio);
            fin=NuevoNodo;
        }
    }
          
    public String imprimir() {
NodoCarros aux = new NodoCarros();
aux=fin;
String Carros= "Los carros son";do {
Carros+=aux.toString()+" ";
    JOptionPane.showMessageDialog(null, aux);
            aux = aux.getSiguiente();
        } 
while (aux != Inicio);
        System.out.println();
    return  Carros;
    
    }


public void Agregar2 ( JTable Tabla1){
    NodoCarros aux;
   DefaultTableModel modelo =(DefaultTableModel)Tabla1.getModel();
      aux=fin;
do  {
    String [] carros2= aux.toString2().split(",");
    System.out.println(carros2);
    modelo.addRow(carros2);
            aux=aux.getSiguiente();
 }
    while (aux!=fin );
     Tabla1.setModel(modelo);
    
         

}
public void Agregar3 ( JTable Tabla1){
    NodoCarros aux;
   DefaultTableModel modelo =(DefaultTableModel)Tabla1.getModel();
      aux=fin;
do  {
    String [] carros2= aux.toString3().split(",");
    System.out.println(carros2);
    modelo.addRow(carros2);
            aux=aux.getSiguiente();
 }
    while (aux!=fin );
     Tabla1.setModel(modelo);
    
         

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
    /**
     * @return the Tabla1
     */
   
}
