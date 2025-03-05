class Banco:
    def __init__(self, nombre):
        self.nombre = nombre
        self.saldo_total = 0

    def mostrar_saldo(self):
        print(f"Banco: {self.nombre} - Saldo Total: ${self.saldo_total}")


class Cuenta:
    def __init__(self, titular, saldo_inicial, tipo_cuenta):
        if saldo_inicial < 0:
            raise ValueError("El saldo inicial no puede ser negativo")
        self.titular = titular
        self.saldo = saldo_inicial
        self.tipo_cuenta = tipo_cuenta

    def depositar(self, cantidad):
        if cantidad > 0:
            self.saldo += cantidad
            print(f"Depósito de ${cantidad} en la cuenta de {self.titular}. Nuevo saldo: ${self.saldo}")
        else:
            print("La cantidad a depositar debe ser mayor que 0")

    def retirar(self, cantidad):
        if cantidad > 0:
            if cantidad <= self.saldo:
                self.saldo -= cantidad
                print(f"Retiro de ${cantidad} en la cuenta de {self.titular}. Nuevo saldo: ${self.saldo}")
            else:
                print("Saldo insuficiente para realizar el retiro")
        else:
            print("La cantidad a retirar debe ser mayor que 0")


class Cliente:
    def __init__(self, nombre, cuentas):
        self.nombre = nombre
        self.cuentas = cuentas


# Programa principal
if __name__ == "__main__":
    # Crear una instancia de la clase Banco
    banco_principal = Banco("Banco XYZ")

    # Crear varias instancias de la clase Cuenta
    cuenta1 = Cuenta("Juan Perez", 1000, "Ahorro")
    cuenta2 = Cuenta("Maria Rodriguez", 5000, "Cheques")

    # Crear una instancia de la clase Cliente con una lista de cuentas
    cliente1 = Cliente("Cliente1", [cuenta1, cuenta2])

    # Realizar depósitos y retiros en las cuentas del cliente y mostrar el saldo actual
    cuenta1.depositar(500)
    cuenta1.retirar(200)

    cuenta2.depositar(1000)
    cuenta2.retirar(600)

    # Mostrar el saldo total del banco después de todas las transacciones
    banco_principal.mostrar_saldo()
