import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
import { Analisis_D, Analizar_XML } from './../../Backend/src_backend/index'
import { ReporteGramatica } from 'src/Backend/src_backend/Reportes/ReporteGramatica';
//import { Analizar_XML } from '../Backend/src_backend/index';
@Injectable({
  providedIn: 'root'
})
export class CompiladorService {
  constructor(private http: HttpClient) { }

  analizar(codigo: string , texto_xpath:string) {
    console.log(codigo)



    Analizar_XML(codigo,texto_xpath)
    var alv = {
      simbolo: Analizar_XML(codigo,texto_xpath).simbolo,
      cst:Analizar_XML(codigo,texto_xpath).cst,
      consulta:Analizar_XML(codigo,texto_xpath).consulta,
      ReporteGramatica:Analizar_XML(codigo,texto_xpath).ReporteGramatica,
      Error:Analizar_XML(codigo,texto_xpath).Error
      
      
    }
    return alv
  }


  analizarD(codigo: string , texto_xpath:string) {
    console.log(codigo)



    Analisis_D(codigo,texto_xpath)
    var alv = {
      simbolo: Analisis_D(codigo,texto_xpath).simbolo,
      cst:Analisis_D(codigo,texto_xpath).cst,
      consulta:Analisis_D(codigo,texto_xpath).consulta,
      ReporteGramatica:Analisis_D(codigo,texto_xpath).ReporteGramatica,
      Error:Analisis_D(codigo,texto_xpath).Error
      
      
    }
    return alv
  }

  getAstBase64(ast: any): Observable<any> {
    const json = { ast: ast }
    return this.http.post<any>('http://localhost:3000/getAstBase64', json);
  }

}
