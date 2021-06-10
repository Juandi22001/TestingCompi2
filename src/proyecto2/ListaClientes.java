/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaClientes {    
    public static int contadorempleados=2299801;
     public static String NombreCliente;
          public  static String TipoCliente;
          public  static  Object DPI;
          public static String Foto;
          public NodoClientes Inicio;

NodoClientes fin;
private JTable jTable1;
    public ListaClientes(NodoClientes Inicio, JTable jTable1, NodoClientes fin) {
        this.Inicio = Inicio;
        this.jTable1 = jTable1;
        this.fin = fin;
    }
    public ListaClientes() {
Inicio=null;
        fin=null;
    }
  public void GenerarGrafica(JPanel _ContenedorGrafica) {
        DefaultPieDataset DatosGrafica = new DefaultPieDataset();
        NodoClientes InicioAux = Listas.listaClientesGeneral.getInicio();
      
        Object [ ]TiposdeCliente={"Oro","Normal"};
           for (Object object : TiposdeCliente) {
               
           Double existencias = Double.valueOf("" + Buscar(object));
            String NombreRepuesto = object.toString();
            DatosGrafica.setValue(NombreRepuesto, existencias);

            InicioAux = InicioAux.getSiguiente();

        
        
           }

        JFreeChart chart = ChartFactory.createPieChart3D("Clientes", DatosGrafica, true, false, false);
        ChartPanel PanelGrafico = new ChartPanel(chart);
        PanelGrafico.setBounds(10, 10, _ContenedorGrafica.getWidth() - 50, _ContenedorGrafica.getHeight() - 50);
        PanelGrafico.setMouseWheelEnabled(true);
        _ContenedorGrafica.add(PanelGrafico);
        _ContenedorGrafica.repaint();
    }
  
  
  
  public int Buscar (Object Cliente){
       NodoClientes aux =Listas.listaClientesGeneral.Inicio;
       int contadorClientes = 0;
       do{ if (Inicio.getTipoCliente().equalsIgnoreCase(Cliente.toString())) {
               contadorClientes++;
           }
           aux=aux.siguiente;
       }while   (aux!=Inicio);
               return contadorClientes;
  }

    public void GuardarReporteRepuestos(String Extension) throws IOException {
        NodoClientes InicioAux =Listas.listaClientesGeneral.getInicio();
        String FilaTabla = "";
        String HTML = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "    <head>\n"
                + "        <title>Reporte Clientes</title>\n"
                + "        <style>\n"
                + "            table.blueTable {\n"
                + "                border: 1px solid #1C6EA4;\n"
                + "                background-color: #EEEEEE;\n"
                + "                width: 100%;\n"
                + "                text-align: left;\n"
                + "                border-collapse: collapse;\n"
                + "            }\n"
                + "            table.blueTable td, table.blueTable th {\n"
                + "                border: 1px solid #AAAAAA;\n"
                + "                padding: 3px 2px;\n"
                + "            }\n"
                + "            table.blueTable tbody td {\n"
                + "                font-size: 13px;\n"
                + "            }\n"
                + "            table.blueTable tr:nth-child(even) {\n"
                + "                background: #D0E4F5;\n"
                + "            }\n"
                + "            table.blueTable thead {\n"
                + "                background: #1C6EA4;\n"
                + "                background: -moz-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);\n"
                + "                background: -webkit-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);\n"
                + "                background: linear-gradient(to bottom, #5592bb 0%, #327cad 66%, #1C6EA4 100%);\n"
                + "                border-bottom: 2px solid #444444;\n"
                + "            }\n"
                + "            table.blueTable thead th {\n"
                + "                font-size: 15px;\n"
                + "                font-weight: bold;\n"
                + "                color: #FFFFFF;\n"
                + "                border-left: 2px solid #D0E4F5;\n"
                + "            }\n"
                + "            table.blueTable thead th:first-child {\n"
                + "                border-left: none;\n"
                + "            }\n"
                + "\n"
                + "            table.blueTable tfoot {\n"
                + "                font-size: 14px;\n"
                + "                font-weight: bold;\n"
                + "                color: #FFFFFF;\n"
                + "                background: #D0E4F5;\n"
                + "                background: -moz-linear-gradient(top, #dcebf7 0%, #d4e6f6 66%, #D0E4F5 100%);\n"
                + "                background: -webkit-linear-gradient(top, #dcebf7 0%, #d4e6f6 66%, #D0E4F5 100%);\n"
                + "                background: linear-gradient(to bottom, #dcebf7 0%, #d4e6f6 66%, #D0E4F5 100%);\n"
                + "                border-top: 2px solid #444444;\n"
                + "            }\n"
                + "            table.blueTable tfoot td {\n"
                + "                font-size: 14px;\n"
                + "            }\n"
                + "            table.blueTable tfoot .links {\n"
                + "                text-align: right;\n"
                + "            }\n"
                + "            table.blueTable tfoot .links a{\n"
                + "                display: inline-block;\n"
                + "                background: #1C6EA4;\n"
                + "                color: #FFFFFF;\n"
                + "                padding: 2px 8px;\n"
                + "                border-radius: 5px;\n"
                + "            }\n"
                + "            body{\n"
                + "                background: #FE9A2E;\n"
                + "            }\n"
                + "        </style>    \n"
                + "    </head>\n"
                + "    <body>\n"
                + "    <center>\n"
                + "        <h1> Reporte Clientets</h1>\n"
                + "        <table class=\"blueTable\" style=\"width: 80%\" border=\"\">\n"
                + "            <thead>\n"
                + "                <tr>\n"
                + "                    <td>DPI</td>\n"
                + "                    <td>NombreCliente</td>\n"
                + "                    <td>NombreUsuario</td>\n"
                + "                    <td>Contraseña</td>\n"    
                +"                       <td>TipoCliente</td>\n"
                + "                          </tr> \n"
                + "            </thead>\n"
                + "ContenidoTabla\n"//Todas las filas de la tabla 
                + "        </table>   \n"
                + "    </center>\n"
                + "</body>\n"
                + "</html>";

         do {
            System.out.println(InicioAux.getNombreCliente());
            FilaTabla += " <tr>\n"
                    + "    <td>" + InicioAux.getDpiCliente()+ "</td>\n"
                    + "    <td>" + InicioAux.getNombreCliente()+ "</td>\n"
                    + "    <td>" + InicioAux.getNombreUsuario()+ "</td>\n"
                    + "    <td>" + InicioAux.getContraseña() + "</td>\n"
                    + "    <td>" + InicioAux.getTipoCliente()+ "</td>\n" + "   "
                  
                    
                    
                    + "  </tr>\n";
            InicioAux = InicioAux.getSiguiente();
        } while (InicioAux != Inicio);
         

        //Agregamos el contenido de la tabla al html
        String ReporteHTML = HTML.replace("ContenidoTabla", FilaTabla);
        GuardarArchivo(ReporteHTML, "html");

    }
public void GuardarArchivo(String Contenido, String Extension) {
        try {

            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.setFileFilter(new FileNameExtensionFilter("Archivos con extension *." + Extension, Extension));
            file.showSaveDialog(file);
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                /*guardamos el archivo y le damos el formato directamente*/
                FileWriter save = new FileWriter(guarda + "." + Extension);

                save.write(Contenido);
                save.close();
                JOptionPane.showMessageDialog(null, "Reporte Guardado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                //Runtime.getRuntime().exec(guarda + "." + Extension);
                Abrir_Archivo_Externo(guarda + "." + Extension);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void Abrir_Archivo_Externo(String Ruta) {
        try {
            File path = new File(Ruta);
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void GenerarReporteRepuestos(JEditorPane _ContenedorHTML) {
        NodoClientes InicioAux = Listas.listaClientesGeneral.getInicio();
        String FilaTabla = "";
        String HTML = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "    <head>\n"
                + "        <title>Reporte Repuestos</title>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "    <center>\n"
                + "        <h1 class=\"h\"> Reporte Repuestos</h1>\n"
                + "        <table class=\"blueTable\" style=\"width: 80%\" border=\"\">\n"
                + "            <thead>\n"
                + "                <tr>\n"
                + "                    <td>DPI</td>\n"
                + "                    <td>NombreCliente</td>\n"
                + "                    <td>NombreUsuario</td>\n"
                + "                    <td>Contraseña</td>\n"    
                +"                       <td>TipoCliente</td>\n"
                + "                </tr> \n"
                + "            </thead>\n"
                + "ContenidoTabla\n"//Todas las filas de la tabla 
                + "        </table>   \n"
                + "    </center>\n"
                + "</body>\n"
                + "</html>";

      do {

                  System.out.println(InicioAux.getNombreCliente());
            FilaTabla += " <tr>\n"
                    + "    <td>" + InicioAux.getDpiCliente()+ "</td>\n"
                    + "    <td>" + InicioAux.getNombreCliente()+ "</td>\n"
                    + "    <td>" + InicioAux.getNombreUsuario()+ "</td>\n"
                    + "    <td>" + InicioAux.getContraseña() + "</td>\n"
                    + "    <td>" + InicioAux.getTipoCliente()+ "</td>\n" + "   "
                  
                    
                    
                    + "  </tr>\n";
            InicioAux = InicioAux.getSiguiente();
        }  while (InicioAux != Inicio); 

        //Agregamos el contenido de la tabla al html
        String ReporteHTML = HTML.replace("ContenidoTabla", FilaTabla);
        _ContenedorHTML.setContentType("text/html");
        _ContenedorHTML.setText("");
        HTMLEditorKit kit = new HTMLEditorKit();
        StyleSheet styleSheet = kit.getStyleSheet();
        //Reglas CSS
        styleSheet.addRule("body{background: #FE9A2E;}");

        Document doc = kit.createDefaultDocument();
        _ContenedorHTML.setEditable(false);
        _ContenedorHTML.setDocument(doc);
        _ContenedorHTML.setText(ReporteHTML);

    }
    public boolean  EstaVacia(){
        return getInicio()==null;
    }

    public void AgregarAlfin( Object Dpi,String _Nombre, String NombreUsuario,Object contraseña,String TipoCliente,ListaCarros Lista) {
     
        contadorempleados++;
 NodoClientes NuevoNodo = new NodoClientes();
      NuevoNodo.setDpiCliente(Dpi);
 NuevoNodo.setNombreCliente(_Nombre);
     
        NuevoNodo.setNombreUsuario(NombreUsuario);
        NuevoNodo.setContraseña(contraseña);
        NuevoNodo.setTipoCliente(TipoCliente);
NuevoNodo.setListaCarros(Lista);


         if (getInicio()==null) {
            setInicio(fin=NuevoNodo);
    Inicio.siguiente=fin;
    fin.siguiente=getInicio();
    Inicio.anterior=fin;
    fin.anterior=getInicio();
            }else{ 
             fin.siguiente=NuevoNodo;
            NuevoNodo.anterior=fin;
            NuevoNodo.siguiente=getInicio();
            fin=NuevoNodo;
             
         }
         }
    
    public void imprimir() {
NodoClientes aux = getInicio();

do {
            JOptionPane.showMessageDialog(null, aux.toString());
            aux = aux.getSiguiente();
        }

while (aux != getInicio());
        System.out.println();
    }

    
    public void Buscar2(Object _DPI) {
NodoClientes aux = getInicio();
      do {
            if (aux.getDpiCliente().toString().equals(_DPI.toString())) {
                System.out.println("pruebaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

                JOptionPane.showMessageDialog(null, aux);
                return;
            }
            aux = aux.getSiguiente();
        }  while (aux != getInicio());
        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
        System.out.println();

        System.out.println("prueba 2");
    }
public boolean buscar (String Nombre , Object Contraseña){

    try {
     
    NodoClientes aux ;
   aux=     getInicio();
do  {
       if(aux.getNombreUsuario().equals(Nombre)&& aux.getContraseña().toString().equals(Contraseña.toString())) {
NombreCliente=aux.getNombreUsuario();
TipoCliente= aux.getTipoCliente();
DPI=aux.getDpiCliente();
         MenuClientes M = new MenuClientes();
         M.setVisible(true);
         return true;  
   }     
       
            aux=aux.getSiguiente();
 }
    while (aux!=getInicio() );{
     
      }     
    } catch (Exception e) {
       JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta");

        return false;
 }
 return  false;
}
public void Carros(String  NombreUsuario){
   NodoClientes aux;
          aux= getInicio();
    do {        
        if (aux.getNombreUsuario().equals(NombreCliente)) {
            aux.getListaCarros().Agregar2(jTable1);
            return;
            
        }aux=aux.getSiguiente();
        
    } while (aux!=getInicio());
   
}

public void Carros2(String  NombreUsuario){
   NodoClientes aux;
          aux= getInicio();
    do {        
            aux.getListaCarros().Agregar3(jTable1);
            return;
        
        
    } while (aux!=getInicio());
   
}
    public void  eliminar (Object DPI){
    
   
        if (!EstaVacia()) {
            if (getInicio()==fin && DPI==getInicio().getDpiCliente()) {
                setInicio(fin);
            } else if(DPI==getInicio().getDpiCliente()){
                setInicio(getInicio().siguiente);
            }else {
               NodoClientes anterior ,temporal;
                anterior=getInicio();
                temporal=getInicio().siguiente;
                while   (temporal!=getInicio() && temporal.getDpiCliente()!=DPI){
                    
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                }
                if (temporal!=getInicio()) {
  anterior.siguiente=temporal.siguiente;
                   
                    if (temporal==fin) {
                        fin=anterior;
                        
                        
                    }
                }
            }
        }
}
    
    
public void Agregar2 ( JTable Tabla1){
    NodoClientes aux;
   DefaultTableModel modelo =(DefaultTableModel)Tabla1.getModel();
      aux=fin;
do  {
    String [] carros2= aux.Tostring2().split(",");
    System.out.println(carros2);
    modelo.addRow(carros2);
            aux=aux.getSiguiente();
 }
    while (aux!=fin );
     Tabla1.setModel(modelo);
    
         

}
    
 public void Editar(Object ID){
   NodoClientes aux = getInicio();
        while (aux != null) {
            if (aux.getDpiCliente().toString().equals(ID.toString())) {
            
                int EditarNombre = JOptionPane.showConfirmDialog(null, "Desea Editar el nombre del cliente: [" +aux.getNombreCliente()+ "]del cliente con  Dpi: " + aux.getDpiCliente(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                    if (EditarNombre == JOptionPane.YES_OPTION) {
                        String NuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente",aux.getNombreCliente());
                     aux.setNombreCliente(NuevoNombre);
                    }
                     int EditarRol = JOptionPane.showConfirmDialog(null, "Desea Editar el Tipo de Cliente: [" +aux.getTipoCliente()+ "]del cliente con Dpi: " + aux.getDpiCliente(), "Editar Rol", JOptionPane.YES_NO_OPTION);
                    if (EditarRol == JOptionPane.YES_OPTION) {
                        String NuevoRol = JOptionPane.showInputDialog("Ingrese el nuevo tipo del cliente",aux.getTipoCliente());
                     aux.setTipoCliente(NuevoRol);
                    }
                    
                     int EditarNombreUsuario = JOptionPane.showConfirmDialog(null, "Desea Editar el NombreUSUARIO: [" +aux.getNombreUsuario()+ "]del cliente con Dpi: " + aux.getDpiCliente(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                    if (EditarNombreUsuario == JOptionPane.YES_OPTION) {
                        String NuevNombreUSUARIO = JOptionPane.showInputDialog("Ingrese el Nuevo nombre de Usuario del Cliente",aux.getNombreUsuario());
                     aux.setNombreUsuario(NuevNombreUSUARIO);
                    }
                    
                     int EditarContraseña = JOptionPane.showConfirmDialog(null, "Desea Editar La Contraseña: [" +aux.getContraseña()+ "]del empleado con ID: " + aux.getDpiCliente(), "Editar Contraseña", JOptionPane.YES_NO_OPTION);
                    if (EditarContraseña == JOptionPane.YES_OPTION) {
                        String NuevaContra = JOptionPane.showInputDialog("Ingrese la nueva contraseña del Cliente",aux.getContraseña());
                     aux.setContraseña(NuevaContra);
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

    /**
     * @return the jTable1
     */
    public JTable getjTable1() {
        return jTable1;
    }

    /**
     * @param jTable1 the jTable1 to set
     */
    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    /**
     * @return the Inicio
     */
    public NodoClientes getInicio() {
        return Inicio;
    }

    /**
     * @param Inicio the Inicio to set
     */
    public void setInicio(NodoClientes Inicio) {
        this.Inicio = Inicio;
    }
            
}
