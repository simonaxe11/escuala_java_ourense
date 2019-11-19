function operarArrays(arrX, arrY, operaCllbk) {
    if (arrX.length == arrY.length) {
        var arrayResultado = new Array(arrX.length);
        for (let i = 0; i < arrX.length; i++) {
            arrayResultado[i] = operaCllbk(arrX[i], arrY[i]);
        }
    }
    return arrayResultado;
}