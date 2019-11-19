let array_A = [1, 2, 3, 4, 5];
let array_B = [2, 3, 4, 5, 6];

let arraySumaAB = operarArrays(array_A, array_B, suma);
arrayEnTabla(arraySumaAB);

let arrayMultAB = operarArrays(array_A, array_B, multiplica);
arrayEnTabla(arrayMultAB);

/*let arrayDivAB = operarArrays(array_A, array_B, divide);
arrayEnTabla(arrayDivAB);*/

let arrayDivAB = operarArrays(array_A, array_B, (x,y)=> x/y);
arrayEnTabla(arrayRestAB);

let arrayRestAB = operarArrays(array_A, array_B, resta);
arrayEnTabla(arrayRestAB);

let arrayPuntosAB = operarArrays(array_A, array_B, hacerPunto);
arrayEnTabla(arrayPuntosAB)

function arrayEnTabla(array) {
    let tabla = "<table border=2><tr>";
    for (let index = 0; index < array.length; index++) {
        const element = array[index];
        tabla += "<td>" + element + "</td>";
    }
    document.getElementById("contenido").innerHTML += tabla + "</tr></table>"
}