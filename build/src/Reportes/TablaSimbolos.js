"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const fs = require("fs");
class SimbolsReport {
    constructor() {
        this.Lista = [];
    }
    static Llenado_tabla() {
    }
    static REPORTE() {
        console.log("suuuuu adentro");
        var grafo = "";
        grafo += "<html ><head><title>Reporte </title>    </head>";
        grafo += "<body class=\"MIfondo\">\n";
        grafo += "<div align=\"center\"  class=\"MIfondo\"> \n";
        grafo += "<h1 class = \"tituloTb\">TABLA DE SIMBOLOS </h1>\n";
        grafo += "<table border=\"2\" align=\"center\" class=\"tabl\">\n";
        grafo += "<tr>\n";
        grafo += "<th>Nombre</th>  <th>Tipo</th><th>Ambito</th><th>Fila</th><th>Columna</th><th>Valor</th>\n";
        grafo += "</tr>\n";
        grafo += SimbolsReport.aux;
        grafo += "</table>\n";
        grafo += "</div>\n";
        grafo += "</body>\n";
        grafo += "</html>\n";
        fs.writeFile('./src/Reportes/Simbols.html', '', function (err) {
            if (err) {
                console.log(err);
                return;
            }
        });
        fs.appendFile('./src/Reportes/Simbols.html', grafo, (error) => {
            if (error) {
                console.log("ee");
            }
            else {
                console.log("reporte aceptado");
                /*
              */
            }
        });
    }
}
exports.SimbolsReport = SimbolsReport;
SimbolsReport.aux = "";
