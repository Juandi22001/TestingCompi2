"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const Tabla_1 = require("./Tabla");
class XmlResultado {
    constructor(etiquitaInicio, etiquetasCuerpo) {
        this.etiquitaInicio = etiquitaInicio;
        this.etiquetasCuerpo = etiquetasCuerpo;
    }
    imprimir() {
        let texto = "";
        this.etiquetasCuerpo.forEach(etiqueta => {
            texto += etiqueta.imprimir();
        });
        return texto;
    }
    getAsTable() {
        let tabla = new Tabla_1.Tabla();
        this.etiquetasCuerpo.forEach(etiqueta => {
            etiqueta.getAsTable().filas.forEach(fila => {
                tabla.addFila(fila);
            });
        });
        return tabla;
    }
    getErroresSemanticos() {
        let texto = "";
        this.etiquetasCuerpo.forEach(etiqueta => {
            texto += etiqueta.getErroresSemanticos();
        });
        return texto;
    }
    getCstDotA() {
        let texto = "";
        texto += "digraph {\n";
        this.etiquetasCuerpo.forEach(etiqueta => {
            texto += etiqueta.getCstDotA(0);
        });
        texto += "}";
        return texto;
    }
}
exports.XmlResultado = XmlResultado;
