let positivo = 0;
let media = 0.0;
let valor = 0.0;
for (let i = 0; i < 6; i++) {
    valor = +gets();

    if (valor > 0) {
        positivo++;
        media = media + valor;
    }
  
}
  media = media/positivo;
  
console.log(positivo + " valores positivos");
var value = media - 0.001;
console.log(value.toFixed(1));