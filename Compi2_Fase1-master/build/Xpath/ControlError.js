"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const TipoSeleccion_1 = require("./TipoSeleccion");
class ControlError {
    constructor(simbolo, tipo, linea, columna, entorno) {
        this.Lista = [];
        this.simbolo = simbolo;
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.entorno = entorno;
        //   this.Agregar(this.simbolo,this.tipo,this.linea,this.columna,this.entorno)
    }
    Agregar(simbolo, tipo, linea, columna, entorno) {
        this.Lista.push(new ControlError(simbolo, tipo, linea, columna, entorno));
    }
}
exports.ControlError = ControlError;
function graficar(errores, errorbusqueda = {
    simbolo: "",
    tipo: "",
    linea: "",
    columna: "",
}) {
    var text = "";
    for (let set of errores) {
        if (set.tipo === TipoSeleccion_1.TipoSeleccion.ERROR_LEXICO) {
            text = text + '\n' + "simbolo de error: " + set.simbolo + " tipo: error lexico" + " " + set.linea + " " + set.columna;
        }
        else if (set.tipo === TipoSeleccion_1.TipoSeleccion.ERROR_SINTACTICO) {
            text = text + '\n' + "simbolo de error: " + set.simbolo + " tipo: error sintactico" + " " + set.linea + " " + set.columna;
        }
    }
    return text;
}
exports.graficar = graficar;
