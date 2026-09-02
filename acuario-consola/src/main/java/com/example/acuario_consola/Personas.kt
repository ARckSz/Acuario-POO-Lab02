package com.example.acuario_consola.vehiculos

abstract class Persona {
    abstract val nombre: String
}

interface Trabajable {
    fun trabajar()
}

class Conductor(override val nombre: String) : Persona(), Trabajable {
    override fun trabajar() {
        println("$nombre está conduciendo el vehículo")
    }
}

class Mecanico(override val nombre: String) : Persona(), Trabajable {
    override fun trabajar() {
        println("$nombre está reparando el vehículo")
    }
}