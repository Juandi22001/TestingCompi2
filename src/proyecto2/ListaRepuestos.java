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
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ListaRepuestos{
    
    
    
    
    public static double contadorRepuestos=77.1;
    
 NodoRepuestos Inicio ;
NodoRepuestos fin;
    private JTable Tabla;
    public ListaRepuestos() {
        Inicio = null;
        fin=null;
    } 

    public ListaRepuestos(NodoRepuestos Inicio, NodoRepuestos fin, JTable Tabla) {
        this.Inicio = Inicio;
        this.fin = fin;
        this.Tabla = Tabla;
    }

    public NodoRepuestos ObtenerNodoRepuesto(Object ID, ListaRepuestos _ListaRepuestos) {
        NodoRepuestos aux = _ListaRepuestos.getInicio();
        while (aux != null) {
            if (aux.getIdRepuestos().equals(ID)) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Repuesto con ID: " + ID + " No encontrado");
        return null;
    }

        public void LlenarTabla() {
        NodoRepuestos aux = new NodoRepuestos();
        aux=fin;
        DefaultTableModel modeloS = (DefaultTableModel) Tabla.getModel();System.out.println("hola2");
        while   (aux!=null){
            String TServicios [] = aux.toString2().split(",");
            modeloS.addRow(TServicios);
            aux =aux.siguiente;
            System.out.println("hola3");
                    
        }Tabla.setModel(modeloS);
    }
        
        
             public void LlenarTabla2() {
        NodoRepuestos aux = new NodoRepuestos();
        aux=fin;
        DefaultTableModel modeloS = (DefaultTableModel) Tabla.getModel();System.out.println("hola2");
        while   (aux!=null){
            String TServicios [] = aux.toString3().split(",");
            modeloS.addRow(TServicios);
            aux =aux.siguiente;
            System.out.println("hola3");
                    
        }Tabla.setModel(modeloS);
    }
        
        
        
        
        
        
    public void GuardarReporteRepuestos(String Extension) throws IOException {
        NodoRepuestos InicioAux =Listas.ListaRepuestosGeneral.getInicio();
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
                + "                    <td>Nombre</td>\n"
                + "                    <td>MARCA</td>\n"
                + "                    <td>MODELO</td>\n"    
                +"                       <td>EXISTENCIAS</td>\n"
                 +"                       <td>PRECIO</td>\n"
                + "                          </tr> \n"
                + "            </thead>\n"
                + "ContenidoTabla\n"//Todas las filas de la tabla 
                + "        </table>   \n"
                + "    </center>\n"
                + "</body>\n"
                + "</html>";

         while (InicioAux != null) {
            System.out.println(InicioAux.getNombreRepuesto());
            FilaTabla += " <tr>\n"
                    + "    <td>" + InicioAux.getIdRepuestos()+ "</td>\n"
                    + "    <td>" + InicioAux.getMarca()+ "</td>\n"
                    + "    <td>" + InicioAux.getModelo()+ "</td>\n"
                    + "    <td>" + InicioAux.getExistencias()+ "</td>\n"
                    + "    <td>" + InicioAux.getPrecio()+ "</td>\n" + "   "
                  
                    
                    
                    + "  </tr>\n";
            InicioAux = InicioAux.getSiguiente();
        } 
         

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
        NodoRepuestos InicioAux = Listas.ListaRepuestosGeneral.getInicio();
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
                + "                    <td>Nombre</td>\n"
                + "                    <td>MARCA</td>\n"
                + "                    <td>MODELO</td>\n"    
                +"                       <td>EXISTENCIAS</td>\n"
                 +"                       <td>PRECIO</td>\n"
                + "                          </tr> \n"
                + "            </thead>\n"
                + "ContenidoTabla\n"//Todas las filas de la tabla 
                + "        </table>   \n"
                + "    </center>\n"
                + "</body>\n"
                + "</html>";

         while (InicioAux != null) {
            System.out.println(InicioAux.getNombreRepuesto());
            FilaTabla += " <tr>\n"
                    + "    <td>" + InicioAux.getIdRepuestos()+ "</td>\n"
                    + "    <td>" + InicioAux.getMarca()+ "</td>\n"
                    + "    <td>" + InicioAux.getModelo()+ "</td>\n"
                    + "    <td>" + InicioAux.getExistencias()+ "</td>\n"
                    + "    <td>" + InicioAux.getPrecio()+ "</td>\n" + "   "
                  
                    
                    
                    + "  </tr>\n";
            InicioAux = InicioAux.getSiguiente();
        } 
         
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

        
        
        
        
        
        
           
    public NodoRepuestos GetRepuesto(Object ID) {
    NodoSevicio S =Listas.ListaServiciosGeneral.fin;
            
        
        NodoRepuestos aux = Listas.ListaRepuestosGeneral.fin;
        while (aux != null) {
            if (aux.getIdRepuestos().toString().equals(ID.toString())) {
                JOptionPane.showMessageDialog(null, ID + "  " + aux.getIdRepuestos());
             
                return aux;
            }
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Repuesto con ID: " + ID + " No encontrado");
        return null;
    }
    
    public Double getRepuesto(Object ID) {
    NodoSevicio S =Listas.ListaServiciosGeneral.fin;
            
        
        NodoRepuestos aux = Listas.ListaRepuestosGeneral.fin;
        while (aux != null) {
            if (aux.getIdRepuestos().toString().equals(ID.toString())) {
                JOptionPane.showMessageDialog(null, ID + "  " + aux.getIdRepuestos());
              Double PrecioTotal= aux.getPrecio();
                return PrecioTotal;
            }
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Repuesto con ID: " + ID + " No encontrado");
        return null;
    }
    public void AgregarAlInicio( String _Nombre,String Modelo, String Marca,Double Precio, int Existencia) {
        contadorRepuestos+=0.01;
 NodoRepuestos NuevoNodo = new NodoRepuestos();
      NuevoNodo.setIdRepuestos(contadorRepuestos);
 NuevoNodo.setNombreRepuesto(_Nombre);
             NuevoNodo.setModelo(Modelo);
        NuevoNodo.setMarca(Marca);
        NuevoNodo.setPrecio(Precio);
NuevoNodo.setExistencias(Existencia);



        if (getInicio() == null) {
            setInicio(NuevoNodo);
        } else {
            NuevoNodo.setSiguiente(getInicio());
            setInicio(NuevoNodo);
        }
    }
        public void Agregar( Object ID,String _Nombre,String Modelo, String Marca,Double Precio, Object Existencia) {
 
 NodoRepuestos NuevoNodo = new NodoRepuestos();
      NuevoNodo.setIdRepuestos(Double.parseDouble(ID.toString()));
 NuevoNodo.setNombreRepuesto(_Nombre);
             NuevoNodo.setModelo(Modelo);
        NuevoNodo.setMarca(Marca);
        NuevoNodo.setPrecio(Precio);
NuevoNodo.setExistencias(Existencia);



        if (getInicio() == null) {
            setInicio(NuevoNodo);
        } else {
            NuevoNodo.setSiguiente(getInicio());
            setInicio(NuevoNodo);
        }
    }
    
  public void Repuestos(Double ID){
      NodoRepuestos aux =Listas.ListaRepuestosGeneral.Inicio;
      
      while (aux != null) {
            if (aux.getIdRepuestos().toString().equals(ID.toString())) {
    aux.setRegistro(aux.getRegistro()+1)
            ;System.out.println(aux.getIdRepuestos());
                System.out.println(ID);
  }
     aux=aux.siguiente; }
  }     
        public void Barras (JPanel _ContenedorGrafica){
            DefaultCategoryDataset Datos = new DefaultCategoryDataset();
            
            NodoRepuestos aux =Listas.ListaRepuestosGeneral.fin;
           
            System.out.println("prueba2");
            while (aux!=null) { System.out.println("prueba ");
               
                Datos.addValue(aux.getIdRepuestos(),aux.getNombreRepuesto() ,aux.getNombreRepuesto());
                aux=aux.siguiente;
            }
            JFreeChart chart = ChartFactory.createBarChart("Repuestos", "Repuestos", "ID", Datos);
            ChartPanel PanelGrafico = new ChartPanel(chart);
        PanelGrafico.setBounds(10, 10, _ContenedorGrafica.getWidth() - 50, _ContenedorGrafica.getHeight() - 50);
        PanelGrafico.setMouseWheelEnabled(true);
        _ContenedorGrafica.add(PanelGrafico);
        _ContenedorGrafica.repaint();
            
        }
        
        
        
        
        
        
        
        
        
        
        
    public void AgregarAlfinal( String _Nombre,String Marca, String Modelo,Double Precio, Object Existencia) {
        contadorRepuestos++;
 NodoRepuestos NuevoNodo = new NodoRepuestos();
      NuevoNodo.setIdRepuestos(contadorRepuestos);
 NuevoNodo.setNombreRepuesto(_Nombre);
             NuevoNodo.setModelo(Modelo);
        NuevoNodo.setMarca(Marca);
        NuevoNodo.setPrecio(Precio);
NuevoNodo.setExistencias(Existencia);



        if (fin == null) {
            fin = NuevoNodo;
        } else {
            NuevoNodo.setSiguiente(fin);
            fin= NuevoNodo;
        }
    }
    
    public String imprimir() {
    NodoRepuestos aux= getInicio();
String R ="Los Repuestos son "+String.valueOf(aux) ;
while (aux != null ) {
    R += aux.toString()+" \n ";
            JOptionPane.showMessageDialog(null, aux);
            aux = aux.siguiente;
            
        }
        System.out.println();
        return R;
    }
        
    public void imprimir2() {
NodoRepuestos aux = getInicio();

while (aux != null) {
            JOptionPane.showMessageDialog(null, aux.toString());
            aux = aux.getSiguiente();
        }
        System.out.println();
    }

    public void Buscar(Object _DPI) {
NodoRepuestos aux = fin;
        while (aux != null) {
            if (aux.getIdRepuestos().toString().equals(_DPI.toString())) {
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

    
    public Object elminarfinal(Object Dpi){
        Dpi= fin.getIdRepuestos();
        if (getInicio()==fin) {
            setInicio(fin=null);
            
            
        }else{
            fin=fin.siguiente;
            fin.setAnterior(null);
            
            
        }
        return Dpi;
    }
    
    
    public Object elminarprincipio(Double Dpi){
        Dpi= getInicio().getIdRepuestos();
        if (getInicio()==fin) {
            setInicio(fin=null);
            
            
        }else{
            setInicio(getInicio().siguiente);
            getInicio().setAnterior(null);
            
            
        }
        return Dpi;
    }
    
 public void Editar(Object ID){
     NodoRepuestos aux = fin;
        while (aux != null) {
            if (aux.getIdRepuestos().toString().equals(ID.toString())) {
            
                int EditarNombre = JOptionPane.showConfirmDialog(null, "Desea Editar el nombre: [" +aux.getNombreRepuesto()+ "]del Repuesto con ID: " + aux.getIdRepuestos(), "Editar Nombre", JOptionPane.YES_NO_OPTION);
                    if (EditarNombre == JOptionPane.YES_OPTION) {
                        String NuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del Repuesto",aux.getNombreRepuesto());
                     aux.setNombreRepuesto(NuevoNombre);
                    }
                     int EditarModelo = JOptionPane.showConfirmDialog(null, "Desea Editar el Modelo: [" +aux.getModelo()+ "]del Repuesto con ID: " + aux.getIdRepuestos(), "Editar Modelo", JOptionPane.YES_NO_OPTION);
                    if (EditarModelo == JOptionPane.YES_OPTION) {
                        String NuevoModelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo del repuesto",aux.getModelo());
                     aux.setModelo(NuevoModelo);
                    }
                    
                     int EditarMarca = JOptionPane.showConfirmDialog(null, "Desea Editar la Marca: [" +aux.getMarca()+ "]del Repuesto con ID: " + aux.getIdRepuestos(), "Editar Marca", JOptionPane.YES_NO_OPTION);
                    if (EditarMarca == JOptionPane.YES_OPTION) {
                        String NuevMarca = JOptionPane.showInputDialog("Ingrese la nueva marca del  repuesto",aux.getNombreRepuesto());
                     aux.setMarca(NuevMarca);
                    }
                    
                     int EditarContraseña = JOptionPane.showConfirmDialog(null, "Desea Editar el precio: [" +aux.getPrecio()+ "]del Repuesto con ID: " + aux.getIdRepuestos(), "Editar Precio", JOptionPane.YES_NO_OPTION);
                    if (EditarContraseña == JOptionPane.YES_OPTION) {
                       String NuevaContra = JOptionPane.showInputDialog("Ingrese el nuevo precio del repuesto",aux.getPrecio());
                     aux.setPrecio(Double.parseDouble(NuevaContra));
                    }
                 JOptionPane.showMessageDialog(null, "Repuesto editado Correctamente");
                return;
            }
            aux = aux.getSiguiente();
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

    /**
     * @return the Inicio
     */
    public NodoRepuestos getInicio() {
        return Inicio;
    }

    /**
     * @param Inicio the Inicio to set
     */
    public void setInicio(NodoRepuestos Inicio) {
        this.Inicio = Inicio;
    }
     
 }   