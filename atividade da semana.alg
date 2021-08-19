algoritmo "Atividade da semana"
var
opcaomenu: literal
celsius:real
fahrenheit:real
f,c:inteiro
inicio
repita
      escreval("Digite um número do menu:")
      escreval("1 - Coverter celsius para fahrenheit")
      escreval("2 - Converter fahrenheit para celsius")
      escreval("3 - Finalizar")
      leia(opcaomenu)
      
se opcaomenu = "1" entao
         escreval("Digite a temperatura em graus celsius:")
         leia(celsius)
         fahrenheit <-(celsius*1.8)+32
         escreval(celsius, "ºC em fahrenheit é:", fahrenheit,"ºF")
         para c de 1 ate 100 passo 1 faca
         fahrenheit<-(c*1.8)+32
         escreval(fahrenheit)
         fimpara


      senao
           se opcaomenu = "2" entao
              escreval("Digite a temperatura em fahrenheit:")
              leia(fahrenheit)
              celsius <- (fahrenheit - 32) / 1.8
              escreval(fahrenheit, "ºF em celsius é:", celsius, "ºC")
              para f de 1 ate 100 passo 1 faca
              celsius<-(f - 32) / 1.8
              escreval(celsius)
              fimpara

              
fimse
fimse
ate opcaomenu = "3"
fimalgoritmo
