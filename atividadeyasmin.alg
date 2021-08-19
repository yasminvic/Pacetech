algoritmo "Conversão"

var
opcaomenu:literal
celsius, fahrenheit, dolar, reais, dinheiro:real
inicio
repita
      escreval("Digite um número do menu:")
      escreval("1 - Coverter celsius para fahrenheit")
      escreval("2 - Converter fahrenheit para celsius")
      escreval("3 - Coverter reais para dólar")
      escreval("4 - Converter dólar para reais")
      leia(opcaomenu)
      
      se opcaomenu = "1" entao
         escreval("Digite a temperatura em graus celsius:")
         leia(celsius)
         fahrenheit <-(celsius*1.8)+32
         escreval(celsius, "ºC em fahrenheit é:", fahrenheit,"ºF")
         escreval("Deseja realizar outra conversão? Responda com 'sim' ou 'não'")
         leia(opcaomenu)

      senao
           se opcaomenu = "2" entao
              escreval("Digite a temperatura em fahrenheit:")
              leia(fahrenheit)
              celsius <- (fahrenheit - 32) / 1.8
              escreval(fahrenheit, "ºF em celsius é:", celsius, "ºC")
              escreval("Deseja realizar outra conversão? Responda com 'sim' ou 'não'")
              leia(opcaomenu)
      senao
           se opcaomenu = "3" entao
               escreval("Informe o valor de 1 dólar em reais hoje:")
               leia(reais)
               escreval("Digite quantos reais você tem:")
               leia(dinheiro)
               dolar <- dinheiro / reais
               escreval("R$", dinheiro, " é US$:", dolar)
               escreval("Deseja realizar outra conversão? Responda com 'sim' ou 'não'")
               leia(opcaomenu)
      senao
           se opcaomenu = "4" entao
              escreval("Informe o valor de 1 dólar em reais hoje:")
              leia(reais)
              escreval("Digite quantos dólares você tem:")
              leia(dinheiro)
              reais <- dinheiro*reais
              escreval("US$", dinheiro, " é R$:",reais)
              escreval("Deseja realizar outra conversão? Responda com 'sim' ou 'não'")
              leia(opcaomenu)

       fimse
       fimse
       fimse
       fimse
ate opcaomenu = "não"
fimalgoritmo
