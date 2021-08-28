algoritmo "Conversão de temperatura"
var
resposta : literal
temperatura: vetor[1..5] de real
hora: vetor[1..5] de real
i,j:inteiro
aux, outroaux:real

procedimento escolherconversao()
inicio
      escreval("Se deseja converter celsius para fahrenheit digite '1'.")
      escreval("Se deseja converter fahrenheit para celsius digite '2'.")
      leia(resposta)
fimprocedimento

procedimento horarioetemperatura()
inicio
      para i de 1 ate 5 faca
           escreval("Informe a hora em que a temperatura foi medida:")
           leia(hora[i])
           escreval("Informe o valor da temperatura a ser convertida:")
           leia(temperatura[i])
      fimpara
fimprocedimento

procedimento ordenar()
inicio
para i de 1 ate 5 faca
     para j de 1 ate 5 faca
          se temperatura[j] > temperatura[i] entao
             aux <- temperatura[i]
             outroaux <- hora[i]
             temperatura[i] <- temperatura[j]
             hora[i]<- hora[j]
             temperatura[j] <- aux
             hora[j]<-outroaux
          fimse
     fimpara
fimpara
fimprocedimento

funcao fahrenheit(c: real) : real
inicio
           retorne(c *1.8)+32
fimfuncao

funcao celsius(f:real):real
inicio
      retorne (f - 32) / 1.8
fimfuncao

inicio
      escolherconversao()
      horarioetemperatura()
      ordenar()
      limpatela
      se resposta = "1" entao
         para i de 1 ate 5 faca
              Escreval("A temperatura de", temperatura[i], "ºC, registrada as ", hora[i], "h corresponde a", fahrenheit(temperatura[i]), "ºF")
         fimpara
      senao
           se resposta = "2" entao
              para i de 1 ate 5 faca
                   escreval("A temperatura de",temperatura[i], "ºF, registrada as", hora[i], "h corresponde a" , celsius(temperatura[i]), "ºC")
              fimpara
           fimse
      fimse
fimalgoritmo
