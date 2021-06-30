const readlineSync = require('readline-sync');//Baixe a depêndencia usando 'npm i readline-sync'.
let NumerosPrimosDaLista = [];
let NumerosPrimosLocais = [];

const n =  readlineSync.question('Insira um número: ');
const K =  readlineSync.question('Quantidade de números primos da lista: ');


for(let i=1;i<=K;i++){
    const k = readlineSync.question(`${i}º número primo: `)
    NumerosPrimosDaLista.push(k);
}

for(let i=1;i<=n;i++){
    let multiplo= false;
    for(let j=0;j<NumerosPrimosDaLista.length;j++){
        if((i%NumerosPrimosDaLista[j])==0){
            multiplo = true;
            break;
        }
    }
    if(!multiplo){
        NumerosPrimosLocais.push(i);
    }
}

console.log(`A quantidade de números não divisíveis é: ${NumerosPrimosLocais.length}`);
//console.log(NumerosPrimosLocais); Printar os números 'primos locais'
