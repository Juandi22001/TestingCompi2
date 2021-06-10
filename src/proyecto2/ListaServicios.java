/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaServicios {

    public static int contador = 0;
    public static Double contadorRepuestos = 20.1;
    public static double C = 0;
   private  NodoSevicio Inicio ;
  NodoSevicio fin ;
    private JTable Tabla;
 public ListaServicios() {
        Inicio = null;
        fin = null;
    }
    public ListaServicios(NodoSevicio Inicio, NodoSevicio fin, JTable Tabla) {
        this.Inicio = Inicio;
        this.fin = fin;
        this.Tabla = Tabla;
    }



   



    public void Agregar(String NombreServicio, String MarcaS, String ModeloS, ListaRepuestos Lista, Double PrecioManodeObra, Double PrecioTotal) {
        contadorRepuestos++;
        NodoSevicio NuevoNodo = new NodoSevicio();
        NodoRepuestos NuevoNodo2 = new NodoRepuestos();
   
        NuevoNodo.setIdservicio(contadorRepuestos);
        NuevoNodo.setNombreServicio(NombreServicio);
        NuevoNodo.setModeloS(ModeloS);
        NuevoNodo.setMarcaS(MarcaS);
        NuevoNodo.setPrecioManodeObra(PrecioManodeObra);
        NuevoNodo.setPrecioTotal(PrecioTotal + PrecioManodeObra);
        NuevoNodo.setListaRepuestos(Lista);
        if (Inicio == null) {
            Inicio =fin =NuevoNodo;
            
        } else {
           fin.setSiguiente(NuevoNodo);
            fin = NuevoNodo;
        }
    }

    public void imprimir() {
        NodoSevicio aux = Inicio;

        while (aux != null) {
            JOptionPane.showMessageDialog(null, aux.toString());
            aux = aux.getSiguiente();
        }
        System.out.println();
    }
public void D (Double DPI){
       NodoSevicio aux = new NodoSevicio();
    aux=Inicio;
    while (aux != null ) {
        if (aux.getIdservicio().equals(DPI)) {
aux.setRegistro(aux.getRegistro()+1);
            System.out.println(aux.getIdservicio());
            System.out.println(DPI);
NodoRepuestos R=new NodoRepuestos();
            
R=Listas.ListaRepuestosGeneral.fin;
            while (R!=null) {
             Listas.ListaRepuestosGeneral.Repuestos(R.getIdRepuestos());
             R=R.getSiguiente();
            }
     
        }
        aux = aux.getSiguiente();
}
}
public void Buscar(Object _DPI) {
        NodoSevicio aux = Inicio;
        while (aux != null) {
            if (aux.getIdservicio().toString().equals(_DPI.toString())) {
                System.out.println("pruebaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

                JOptionPane.showMessageDialog(null, aux);
                return;
            }
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
        System.out.println();

        System.out.println("prueba 2");
    }

    public Object elminarfinal(Object Dpi) {
        Dpi = fin.getIdservicio();
        if (Inicio == fin) {
            Inicio = fin = null;

        } else {
            fin = fin.getSiguiente();
            fin.setAnterior(null);

        }
        return Dpi;
    }

    public Object elminarprincipio(Object Dpi) {
        Dpi = Inicio.getIdservicio();
        if (Inicio == fin) {
            Inicio = fin = null;

        } else {
            Inicio = Inicio.getSiguiente();
            Inicio.setAnterior(null);

        }
        return Dpi;
    }

    public void Servicios() {
        NodoSevicio aux = Inicio;
        DefaultTableModel modeloS = (DefaultTableModel) Tabla.getModel();
        while   (aux!=null){
            String TServicios [] = aux.toString2().split("/");
            modeloS.addRow(TServicios);
            aux =aux.siguiente;
                    
        }Tabla.setModel(modeloS);
    }

    public void Servicios2() {
        NodoSevicio aux = Inicio;
        DefaultTableModel modeloS = (DefaultTableModel) Tabla.getModel();
        while   (aux!=null){
            String TServicios [] = aux.toString3().split("/");
            modeloS.addRow(TServicios);
            aux =aux.siguiente;
                    
        }Tabla.setModel(modeloS);
    }
    
    public void Servicios3() {
        NodoSevicio aux = Inicio;
        DefaultTableModel modeloS = (DefaultTableModel) Tabla.getModel();
        while   (aux!=null){
 aux.getListaRepuestos().LlenarTabla2();
            aux =aux.siguiente;
                    
        }Tabla.setModel(modeloS);
    }
    
    
    
    
    
    
    
    
         public void Barras (JPanel _ContenedorGrafica){
            DefaultCategoryDataset Datos = new DefaultCategoryDataset();
            
    NodoSevicio aux =Listas.ListaServiciosGeneral.Inicio;
           
            
            while (aux!=null) {
               
                Datos.addValue(Double.parseDouble(aux.getPrecioTotal().toString()),aux.getNombreServicio(),aux.getNombreServicio());
                aux=aux.siguiente;
            }
            JFreeChart chart = ChartFactory.createBarChart("Repuestos", "Repuestos", "Servicios", Datos);
            ChartPanel PanelGrafico = new ChartPanel(chart);
        PanelGrafico.setBounds(10, 10, _ContenedorGrafica.getWidth() - 50, _ContenedorGrafica.getHeight() - 50);
        PanelGrafico.setMouseWheelEnabled(true);
        _ContenedorGrafica.add(PanelGrafico);
        _ContenedorGrafica.repaint();
            
        }
    
    
    
    
    public void Editar(Object ID) {
        NodoSevicio aux = Inicio;
        while (aux != null) {
            if (aux.getIdservicio().toString().equals(ID.toString())) {

                int EditarNombre = JOptionPane.showConfirmDialog(null, "Desea Editar el nombre: [" + aux.getNombreServicio() + "]del Servicicio con ID: " + aux.getIdservicio(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                if (EditarNombre == JOptionPane.YES_OPTION) {
                    String NuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del Nuevo Servicio", aux.getNombreServicio());
                    aux.setNombreServicio(NuevoNombre);
                }
                int EditarModelo = JOptionPane.showConfirmDialog(null, "Desea Editar el Modelo: [" + aux.getModeloS() + "]del Servicio con ID: " + aux.getIdservicio(), "Editar Modelo", JOptionPane.YES_NO_OPTION);
                if (EditarModelo == JOptionPane.YES_OPTION) {
                    String NuevoModelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo del Servicio", aux.getModeloS());
                    aux.setModeloS(NuevoModelo);
                }

                int EditarMarca = JOptionPane.showConfirmDialog(null, "Desea Editar la Marca: [" + aux.getMarcaS() + "]del Servicio con ID: " + aux.getIdservicio(), "Editar Marca", JOptionPane.YES_NO_OPTION);
                if (EditarMarca == JOptionPane.YES_OPTION) {
                    String NuevMarca = JOptionPane.showInputDialog("Ingrese la nueva marca del  servicio", aux.getMarcaS());
                    aux.setMarcaS(NuevMarca);
                }

                int EditarContraseña = JOptionPane.showConfirmDialog(null, "Desea Editar el precio de mano de obra: [" + aux.getPrecioManodeObra() + "]del Servicio con ID: " + aux.getIdservicio(), "Editar Precio", JOptionPane.YES_NO_OPTION);
                if (EditarContraseña == JOptionPane.YES_OPTION) {
                    String NuevaContra = JOptionPane.showInputDialog("Ingrese el nuevo precio de la mano de obra", aux.getPrecioManodeObra());
                    aux.setPrecioManodeObra(Double.parseDouble(NuevaContra));
                }
                JOptionPane.showMessageDialog(null, "Repuesto editado Correctamente");
                return;
            }
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
        System.out.println();

        System.out.println("prueba 2");
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
