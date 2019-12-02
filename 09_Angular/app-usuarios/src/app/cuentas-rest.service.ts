import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { CuentaBanc } from './modelo/CuentaBanc';

// Objeto que Angular se encarga de instanciar como un Singleton
@Injectable({
  providedIn: 'root'
})
export class CuentasRestService {

  //Infiere / deduce a partir del valor ("" es String)
  urlApiRest = "http://localhost:8080/cuentas";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  alCambiar:any;

  constructor(private httpCli: HttpClient) { }

  // nuevaCuenta va sin ID
  public add(nuevaCuenta: CuentaBanc, lambda: any) : Observable<CuentaBanc>{
    return this.httpCli.post<CuentaBanc>(this.urlApiRest, nuevaCuenta,this.httpOptions);
    
  }
  public traerTodos() : Observable<CuentaBanc[]>{
    return this.httpCli.get<CuentaBanc[]>(this.urlApiRest);
  }
  public eliminar(id: Number){
    let urlPeticionDelete = `${this.urlApiRest}/${id}`;
    console.log(urlPeticionDelete);
    this.httpCli.delete(urlPeticionDelete, this.httpOptions).subscribe((datos)=>{
      this.alCambiar(datos);
      console.log("Eliminado " + id);
    })
  }
}
