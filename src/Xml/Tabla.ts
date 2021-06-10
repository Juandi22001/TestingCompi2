import { Fila } from "./Fila";

export class Tabla {
    filas:Array<Fila> = []

    constructor() {
    }

    addFila(fila:Fila) {
        this.filas.push(fila)
    }

}