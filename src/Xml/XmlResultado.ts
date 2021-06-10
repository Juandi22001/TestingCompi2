import { Etiqueta } from "./Etiqueta";
import { EtiquetaInicio } from "./EtiquetaInicio";
import { Tabla } from "./Tabla";

export class XmlResultado {
    etiquitaInicio: EtiquetaInicio
    etiquetasCuerpo: Array<Etiqueta>

    constructor(etiquitaInicio: EtiquetaInicio, etiquetasCuerpo: Array<Etiqueta>) {
        this.etiquitaInicio = etiquitaInicio
        this.etiquetasCuerpo = etiquetasCuerpo
    }

    imprimir():string {
        let texto:string = ""
        this.etiquetasCuerpo.forEach(etiqueta => {
            texto += etiqueta.imprimir()
        })
        return texto
    }

    getAsTable():Tabla {
        let tabla:Tabla = new Tabla()
        this.etiquetasCuerpo.forEach(etiqueta => {
            etiqueta.getAsTable().filas.forEach(fila => {
                tabla.addFila(fila)
            })
        })
        return tabla
    }

    getErroresSemanticos():string {
        let texto = ""
        this.etiquetasCuerpo.forEach(etiqueta => {
            texto += etiqueta.getErroresSemanticos()
        })
        return texto
    }

    getCstDotA():string {
        let texto = ""
        texto += "digraph {\n"
        this.etiquetasCuerpo.forEach(etiqueta => {
            texto += etiqueta.getCstDotA(0)
        })
        texto += "}"
        return texto
    }
}