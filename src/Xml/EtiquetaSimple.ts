import { EtiquetaDoble } from './EtiquetaDoble'
import { Atributo } from "./Atributo"
import { Etiqueta } from "./Etiqueta"
import { Fila } from "./Fila"
import { Tipos } from "./Tipos"
import { Tabla } from './Tabla'

export class EtiquetaSimple implements Etiqueta  {
    nombreTag:string
    padre:EtiquetaDoble
    listaAtributos:Array<Atributo>
    linea:number
    columna:number
    idSent:number

    constructor(nombreTag:string, listaAtributos:Array<Atributo>, linea:number, columna:number, idSent:number) {
        this.nombreTag = nombreTag
        this.padre = null
        this.listaAtributos = listaAtributos
        this.linea = linea
        this.columna = columna
        this.idSent = idSent
        this.listaAtributos.forEach(atributo => {
            atributo.etiquetaContendora = this
        })
    }

    getName():string {
        return this.nombreTag
    }

    getAmbito():Array<string> {
        let listaAmbito:Array<string> = []
        for(let etiqueta:Etiqueta = this.padre; etiqueta != null; etiqueta = etiqueta.padre) {
            listaAmbito.push(etiqueta.getName())
        }   
        listaAmbito.push("GLOBAL")
        return listaAmbito
    }

    imprimir(): string {
        let texto:string = ""
        texto += "<" + this.nombreTag
        this.listaAtributos.forEach(atributo => {
            texto += " " + atributo.imprimir()
        })
        texto += "/> \n" 
        return texto
    }

    getAsTable():Tabla {
        let tabla = new Tabla()
        tabla.addFila(new Fila(
            this.getName(), 
            Tipos.ETIQUETA_SIMPLE,
            this.getAmbito(),
            this.linea,
            this.columna,
            this.imprimir()
        ))
        this.listaAtributos.forEach(atributo => {
            tabla.addFila(atributo.getAsRowTable())
        })
        return tabla
    }

    getErroresSemanticos():string {
        let texto = ""
        this.listaAtributos.forEach(atributo => {
            let apariciones = 0
            for(let atr2 of this.listaAtributos) {
                if (atributo.nombre == atr2.nombre) {
                    apariciones += 1
                }
                if (apariciones > 1) {
                    texto += `Error(Linea: ${atributo.linea}, Columna: ${atributo.columna}): El atributo '${atributo.nombre}' se encuentra repetido.\n`
                    break
                }
            }
        })
        return texto
    }

    getCstDotA(idPadre:number):string {
        let texto = ""
        return texto
    }
}