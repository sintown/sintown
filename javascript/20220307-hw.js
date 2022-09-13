var pGasolina, pAlcool;
const resultText = ["Álcool", "Gasolina"];
const percentual = 70 / 100;

while(true) { // repete o programa

  // o preço precisa ser maior do que zero
  do {
    pAlcool = parseFloat(prompt('Informe o preço do Álcool:'));
    pGasolina = parseFloat(prompt('Informe o preço da Gasolina:'));
  }
  while(pAlcool <= 0 || pGasolina <= 0)

  let pResult = pAlcool / pGasolina;

  if (pResult == percentual) {
    alert(pResult.toFixed(2) + '\n\nTanto o álcool quanto a gasolina são vantajosos.')
  }
  else {
    let index = pResult > percentual ? 1 : 0 // 1 => gasolina, 0 => alcool 
    alert(pResult.toFixed(2) +'\n\n' + resultText[index] + ' é o combustível mais vantajoso')
  }

  let resposta = window.confirm('Deseja fazer um novo cálculo?');

  if (!resposta) {
    console.log('programa encerrado.')
    break;
  }
}
