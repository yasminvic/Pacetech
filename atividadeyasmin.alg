algoritmo "Convers�o"

var
opcaomenu:literal
celsius, fahrenheit, dolar, reais, dinheiro:real
inicio
repita
      escreval("Digite um n�mero do menu:")
      escreval("1 - Coverter celsius para fahrenheit")
      escreval("2 - Converter fahrenheit para celsius")
      escreval("3 - Coverter reais para d�lar")
      escreval("4 - Converter d�lar para reais")
      leia(opcaomenu)
      
      se opcaomenu = "1" entao
         escreval("Digite a temperatura em graus celsius:")
         leia(celsius)
         fahrenheit <-(celsius*1.8)+32
         escreval(celsius, "�C em fahrenheit �:", fahrenheit,"�F")
         escreval("Deseja realizar outra convers�o? Responda com 'sim' ou 'n�o'")
         leia(opcaomenu)

      senao
           se opcaomenu = "2" entao
              escreval("Digite a temperatura em fahrenheit:")
              leia(fahrenheit)
              celsius <- (fahrenheit - 32) / 1.8
              escreval(fahrenheit, "�F em celsius �:", celsius, "�C")
              escreval("Deseja realizar outra convers�o? Responda com 'sim' ou 'n�o'")
              leia(opcaomenu)
      senao
           se opcaomenu = "3" entao
               escreval("Informe o valor de 1 d�lar em reais hoje:")
               leia(reais)
               escreval("Digite quantos reais voc� tem:")
               leia(dinheiro)
               dolar <- dinheiro / reais
               escreval("R$", dinheiro, " � US$:", dolar)
               escreval("Deseja realizar outra convers�o? Responda com 'sim' ou 'n�o'")
               leia(opcaomenu)
      senao
           se opcaomenu = "4" entao
              escreval("Informe o valor de 1 d�lar em reais hoje:")
              leia(reais)
              escreval("Digite quantos d�lares voc� tem:")
              leia(dinheiro)
              reais <- dinheiro*reais
              escreval("US$", dinheiro, " � R$:",reais)
              escreval("Deseja realizar outra convers�o? Responda com 'sim' ou 'n�o'")
              leia(opcaomenu)

       fimse
       fimse
       fimse
       fimse
ate opcaomenu = "n�o"
fimalgoritmo
