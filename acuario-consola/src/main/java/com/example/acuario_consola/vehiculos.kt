package com.example.acuario_consola.vehiculos

open class Vehiculo(var marca: String = "Genérico", var modelo: String = "Modelo X", var anio: Int = 2020) {

    constructor(marca: String) : this(marca, "Modelo X", 2024)

    init {
        println("Inicializando vehículo: $marca $modelo")
    }
    init {
        println("Año de fabricación: $anio")
    }

    open var precio: Double
        get() = (2025 - anio) * -500.0 + 20000.0
        set(valor) {
            anio = 2025 - ((valor - 20000.0) / -500.0).toInt()
        }

    open val tipo = "vehículo estándar"

    open fun imprimirInfo() {
        println("Tipo: $tipo")
        println("Marca: $marca | Modelo: $modelo | Año: $anio")
        println("Precio estimado: $${"%.2f".format(precio)}")
    }
}

class Deportivo(marca: String, modelo: String, anio: Int, var velocidadMaxima: Int) :
    Vehiculo(marca, modelo, anio) {

    override val tipo = "deportivo"

    override var precio: Double
        get() = super.precio * 1.8
        set(valor) {
            super.precio = valor / 1.8
        }

    override fun imprimirInfo() {
        super.imprimirInfo()
        println("Velocidad máxima: $velocidadMaxima km/h")
    }
}