import { Atributo } from "./Atributo";

export class EtiquetaInicio {
    version:string
    encoding:string
    linea: number
    columna: number
    constructor(listaAtributos: Array<Atributo>, linea: number, columna: number) {
        this.linea = linea
        this.columna = columna
        listaAtributos.forEach(atributo => {
            if (atributo.nombre == "version") {
                this.version = atributo.valor
            } else if (atributo.nombre == "encoding") {
                this.encoding = atributo.valor
            }
        });
    }
}