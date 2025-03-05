import random

#Aqui esta nuestra clase la cual define por defecto a todos los personajes
class Heroe:
    def __init__(self, nombre, salud, ataque, defensa, nivel=1, experiencia=0):
        self.nombre = nombre
        self.salud = salud
        self.ataque = ataque
        self.defensa = defensa
        self.nivel = nivel
        self.experiencia = experiencia

    def atacar(self, objetivo):
        golpe = self.ataque - objetivo.defensa
        if golpe > 0:
            print(f"{self.nombre} ataca a {objetivo.nombre} y le inflige {golpe} de daño")
            objetivo.salud = max(0, objetivo.salud - golpe)
        else:
            print(f"{self.nombre} ataca a {objetivo.nombre}, pero la defensa es demasiado fuerte")

    def mostrar_estado(self):
        print(f"{self.nombre} - Nivel: {self.nivel} | Salud: {self.salud} | Ataque: {self.ataque} | Defensa: {self.defensa} | Experiencia: {self.experiencia}")
        print()

    def subir_nivel(self):
        if self.experiencia >= 100:
            self.nivel += 1
            self.experiencia = 0
            self.salud += random.randint(5, 10)
            self.ataque += random.randint(2, 5)
            self.defensa += random.randint(1, 3)
            print(f"{self.nombre} ha subido al nivel {self.nivel}!")

class Guerrero(Heroe):
    def __init__(self, nombre):
        salud = random.randint(50, 100)
        ataque = random.randint(15, 25)
        defensa = random.randint(5, 20)
        super().__init__(nombre, salud, ataque, defensa)

    def habilidad_especial(self, objetivo):
        print(f"{self.nombre} realiza un ataque giratorio devastador!")
        golpe = self.ataque * 2 - objetivo.defensa
        if golpe > 0:
            print(f"{self.nombre} inflige un daño adicional de {golpe} con su habilidad especial")
            objetivo.salud = max(0, objetivo.salud - golpe)

class Mago(Heroe):
    def __init__(self, nombre):
        salud = random.randint(50, 100)
        ataque = random.randint(15, 25)
        defensa = random.randint(5, 20)
        super().__init__(nombre, salud, ataque, defensa)

    def habilidad_especial(self, objetivo):
        print(f"{self.nombre} lanza una bola de fuego poderosa!")
        golpe = self.ataque * 2 - objetivo.defensa
        if golpe > 0:
            print(f"{self.nombre} inflige un daño adicional de {golpe} con su habilidad especial")
            objetivo.salud = max(0, objetivo.salud - golpe)

class Arquero(Heroe):
    def __init__(self, nombre):
        salud = random.randint(50, 100)
        ataque = random.randint(15, 25)
        defensa = random.randint(5, 20)
        super().__init__(nombre, salud, ataque, defensa)

    def habilidad_especial(self, objetivo):
        print(f"{self.nombre} dispara a una lluvia de flechas!")
        golpe = self.ataque * 2 - objetivo.defensa
        if golpe > 0:
            print(f"{self.nombre} inflige un daño adicional de {golpe} con su habilidad especial")
            objetivo.salud = max(0, objetivo.salud - golpe)

def combate(heroe1, heroe2):
    print("¡Comienza el combate!")
    print()
    
    while heroe1.salud > 0 and heroe2.salud > 0:
        # Turno del heroe1
        print(f"Turno de {heroe1.nombre}:")
        print("1. Atacar")
        print("2. Habilidad especial")
        opcion = input("Elige una opción: ")

        if opcion == "1":
            heroe1.atacar(heroe2)
        elif opcion == "2" and hasattr(heroe1, 'habilidad_especial'):
            heroe1.habilidad_especial(heroe2)
        else:
            print("Opción inválida. Seleccionando ataque por defecto.")
            heroe1.atacar(heroe2)

        heroe2.mostrar_estado()

        if heroe2.salud <= 0:
            print(f"{heroe2.nombre} ha sido derrotado. ¡Victoria para {heroe1.nombre}!")
            print()
            break

        # Turno de heroe 2
        print(f"Turno de {heroe2.nombre}:")
        heroe2.atacar(heroe1)
        heroe1.mostrar_estado()

        if heroe1.salud <= 0:
            print(f"{heroe1.nombre} ha sido derrotado. ¡Victoria para {heroe2.nombre}!")
            print()
            break

    heroe1.subir_nivel()
    heroe2.subir_nivel()

# Interacción con el usuario
print("bienvenido al simulador de batallas, porfavor ingresa los siguintes requerimientos")
print("En caso de no escribir algo correcto el programa lo traducira por defecto a un golpe normal")
nombre_heroe1 = input("Ingrese el nombre del primer héroe: ")
print()
heroe1 = Guerrero(nombre_heroe1)
heroe1.mostrar_estado()
print()

nombre_heroe2 = input("Ingrese el nombre del segundo héroe: ")
print()
heroe2 = Mago(nombre_heroe2)
heroe2.mostrar_estado()
print()

combate(heroe1, heroe2)
