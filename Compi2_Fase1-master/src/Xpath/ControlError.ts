import { TipoSeleccion } from "./TipoSeleccion"

export class ControlError {
    simbolo: string
    tipo: TipoSeleccion
    linea: any
    columna: any
    entorno: string

    Lista:any= []

    constructor(simbolo: string, tipo: TipoSeleccion, linea: any, columna: any, entorno: string) {
        this.simbolo = simbolo
        this.tipo = tipo
        this.linea = linea
        this.columna = columna
        this.entorno = entorno
    //   this.Agregar(this.simbolo,this.tipo,this.linea,this.columna,this.entorno)

    }  

   public Agregar(simbolo: string, tipo: TipoSeleccion, linea: any, columna: any, entorno: string){
            this.Lista.push(new ControlError(simbolo,tipo,linea,columna,entorno))
   }
    
   

}  

export function graficar(errores:any, errorbusqueda = {
    simbolo: "",
    tipo: "",
    linea: "",
    columna: "",
}):string {
    var text:string = ""
    for (let set of errores) {
        if(set.tipo === TipoSeleccion.ERROR_LEXICO){
            text = text + '\n' + "simbolo de error: " + set.simbolo + " tipo: error lexico" + " "+ set.linea  +" "+ set.columna;
        }else if(set.tipo === TipoSeleccion.ERROR_SINTACTICO){
            text = text + '\n' +"simbolo de error: " +set.simbolo + " tipo: error sintactico" + " "+ set.linea  +" "+ set.columna;
        }
    }
    return text
}