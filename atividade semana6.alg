algoritmo "Ordenação"

var
numeros: vetor [1..6] de real
i:inteiro

procedimento lernumeros()
inicio
para i de 1 ate 6 faca
     escreval("Digite um número:")
     leia(numeros[i])
fimpara
fimprocedimento

procedimento OrdenacaoNumeros()
var
aux: real
j: inteiro
inicio

para i de 1 ate 6 faca
   para j de 1 ate 6 faca
      se numeros[j]<numeros[i] entao
         aux <- numeros [i]
         numeros [i] <- numeros [j]
         numeros [j] <- aux
      fimse
   fimpara
fimpara
fimprocedimento

procedimento mostrarnatela()
inicio
para i de 1 ate 6 faca
      escreval(numeros[i])
fimpara
fimprocedimento

inicio

lernumeros()
limpatela
OrdenacaoNumeros()
escreval("Os números informados em ordem decrescente:")
mostrarnatela()

fimalgoritmo
