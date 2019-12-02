import { Component, OnInit } from '@angular/core';
import { CuentaBanc } from '../modelo/CuentaBanc';
import { CuentasRestService } from '../cuentas-rest.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-nueva-cuenta',
  templateUrl: './nueva-cuenta.component.html',
  styleUrls: ['./nueva-cuenta.component.css']
})
export class NuevaCuentaComponent implements OnInit {

  cuenta : CuentaBanc;
  recibido: boolean;

  //Angular detecta que el componente necesita el servicio,
  // asi que le inyecta el único que ha creado
  // Como el @Autowire de Spring, es la inyección de dependencias
  constructor(private srvCuentasRest: CuentasRestService) { }

  ngOnInit() {
    this.cuenta = new CuentaBanc(0, "", "");
  }
  crearCuenta(): void{
    let observable: Observable<CuentaBanc>;
    observable = this.srvCuentasRest.add(this.cuenta, (objNoSexual) =>{
      console.log("Datos: " + objNoSexual["iban"]);
      this.recibido = true;
    });
    console.log(this.cuenta.toString());
  }
}
