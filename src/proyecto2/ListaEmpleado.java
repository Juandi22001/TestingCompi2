    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import com.sun.xml.internal.bind.v2.model.core.ID;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaEmpleado {
    
    
    
    
    public static int contadorempleados=0;
     public static String NOmbre;
NodoEmpleados Inicio = null;
NodoEmpleados fin=null;
    public ListaEmpleado() {
        Inicio = null;
        fin=null;
    }

    public ListaEmpleado(NodoEmpleados Inicio,NodoEmpleados Fin) {
        this.Inicio = Inicio;
        this.fin= Fin;
    }
    public boolean  EstaVacia(){
        return Inicio==null;
    }

public boolean buscar (String Nombre , Object Contraseña){


     
    NodoEmpleados aux=Inicio;
    while (aux!=null ){
     
   if(aux.getNombreUsuarioEmpleado().toString().equals(Nombre)&& aux.getContraseñaEmpleado().toString().equals(Contraseña.toString())) {

Mecanico M= new Mecanico();
         M.setVisible(true);
         return true; 
           
        }
       aux=aux.siguiente;
     }
         
    JOptionPane.showMessageDialog(null,"NO ENCONTRADO");
 return  false;
}
    public void AgregarAlInicio( String _Nombre,String Rol, Object NombreUsuario,Object contraseña) {
     
        contadorempleados++;

         if (!EstaVacia()) {
            Inicio=  new NodoEmpleados(contadorempleados,_Nombre, Rol, NombreUsuario, contraseña,Inicio,null );
           Inicio.siguiente.anterior=Inicio;
        } else {
        Inicio=fin=new NodoEmpleados(contadorempleados,_Nombre, Rol, NombreUsuario,contraseña);
        
        }
    }
    
    public void AgregarAlfinal(String _Nombre,String Rol, String NombreUsuario,int contraseña) {
      
        contadorempleados++;
 NodoEmpleados NuevoNodo = new NodoEmpleados();
      NuevoNodo.setIdEmpleado(contadorempleados);
 NuevoNodo.setNombreEmpleado(_Nombre);
             NuevoNodo.setRolEmpleado(Rol);
        NuevoNodo.setNombreUsuarioEmpleado(NombreUsuario);
        NuevoNodo.setContraseñaEmpleado(contraseña);




        if (!EstaVacia()) {
            fin =  new NodoEmpleados(contadorempleados,_Nombre, Rol, NombreUsuario, contraseña,null,fin);
            fin.anterior.siguiente=fin;
        } else {
        Inicio=fin=new NodoEmpleados(contadorempleados, _Nombre, Rol,NombreUsuario, contraseña);
        
        }
    }
    
    public void imprimir() {
NodoEmpleados aux = Inicio;

while (aux != null) {
            JOptionPane.showMessageDialog(null, aux);
            aux = aux.getSiguiente();
        }
        System.out.println();
    }

    
    public void Buscar(int _DPI) {
NodoEmpleados aux = Inicio;
        while (aux != null) {
            if (aux.getIdEmpleado()== _DPI) {
                System.out.println("pruebaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

                JOptionPane.showMessageDialog(null, aux);
                return;
            }
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado"); 
        System.out.println();

        System.out.println("prueba 2");
    }

    
    public int elminarfinal(int Dpi){
        Dpi= fin.getIdEmpleado();
        if (Inicio==fin) {
            Inicio=fin=null;
            
            
        }else{
            Inicio=Inicio.siguiente;
            Inicio.anterior=null;
            
            
        }
        return Dpi;
    }
    
    
    public int elminarprincipio(int Dpi){
        Dpi= Inicio.getIdEmpleado();
        if (Inicio==fin) {
            Inicio=fin=null;
            
            
        }else{
            Inicio=Inicio.siguiente;
            Inicio.anterior=null;
            
            
        }
        return Dpi;
    }
 public void Editar(int ID){
     NodoEmpleados aux = Inicio;
        while (aux != null) {
            if (aux.getIdEmpleado()== ID) {
            
                int EditarNombre = JOptionPane.showConfirmDialog(null, "Desea Editar el nombre: [" +aux.getNombreEmpleado()+ "]del empleado con ID: " + aux.getIdEmpleado(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                    if (EditarNombre == JOptionPane.YES_OPTION) {
                        String NuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del Empleado",aux.getNombreEmpleado());
                     aux.setNombreEmpleado(NuevoNombre);
                    }
                     int EditarRol = JOptionPane.showConfirmDialog(null, "Desea Editar el Rol: [" +aux.getRolEmpleado()+ "]del empleado con ID: " + aux.getIdEmpleado(), "Editar Rol", JOptionPane.YES_NO_OPTION);
                    if (EditarRol == JOptionPane.YES_OPTION) {
                        String NuevoRol = JOptionPane.showInputDialog("Ingrese el rol nuevo del Empleado",aux.getRolEmpleado());
                     aux.setRolEmpleado(NuevoRol);
                    }
                    
                     int EditarNombreUsuario = JOptionPane.showConfirmDialog(null, "Desea Editar el NombreUSUARIO: [" +aux.getNombreUsuarioEmpleado()+ "]del empleado con ID: " + aux.getIdEmpleado(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                    if (EditarNombreUsuario == JOptionPane.YES_OPTION) {
                        String NuevNombreUSUARIO = JOptionPane.showInputDialog("Ingrese el Nuevo nombre de Usuario del Empleado",aux.getNombreEmpleado());
                     aux.setNombreUsuarioEmpleado(NuevNombreUSUARIO);
                    }
                    
                     int EditarContraseña = JOptionPane.showConfirmDialog(null, "Desea Editar La Contraseña: [" +aux.getContraseñaEmpleado()+ "]del empleado con ID: " + aux.getIdEmpleado(), "Editar Contraseña", JOptionPane.YES_NO_OPTION);
                    if (EditarContraseña == JOptionPane.YES_OPTION) {
                        String NuevaContra = JOptionPane.showInputDialog("Ingrese la nueva contraseña del Empleado",aux.getContraseñaEmpleado());
                     aux.setContraseñaEmpleado(NuevaContra);
                    }
                 JOptionPane.showMessageDialog(null, "Empleado editado Correctamente");
                return;
            }
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
        System.out.println();

        System.out.println("prueba 2");
    }
     
 }   

