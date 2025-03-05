print("Bienvenido a la calculadora de impuestos anuales, con esta podras llorar y darte cuenta de cuanto no roban anualmente :)")

#empezamos con un while para que asi el usuario lo repita hasta que el decida
while True:
 salario=float(input("Porfavor introduce tu salario anual, recuerda que dependiendo del salario cambian los costos: "))
#dependiendo del numero que ponga el usuario sea dirigido a algun elif y se crea la variable impuesto
 if salario <= 10000:
    print("Tu salario al ser minomo no se tiene impuesto")

 elif salario >= 10001 and salario <= 50000:
    impuesto = salario * 0.10
    print("Tu impuesto es de: " + str(impuesto))

 elif salario >= 50001 and salario <= 100000:
    impuesto = salario * 0.20
    print("Tu impuesto es de: " + str(impuesto))

 elif salario >= 100001:
    impuesto = salario * 0.20
    print("Tu impuesto es de: " + str(impuesto))
#creamos la variable repetir para que el while funcione y ponemos que si no es igual que si se acabe el programa
 repetir = input("Deseas repetir la calculadora?")
 if repetir != 'si':
   break





