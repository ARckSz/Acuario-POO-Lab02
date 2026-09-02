package com.example.acuario_consola.vehiculos

fun demoVehiculos() {
    println("===== Vehículo estándar =====")
    val auto1 = Vehiculo(marca = "Toyota", modelo = "Corolla", anio = 2018)
    auto1.imprimirInfo()

    println("\n===== Vehículo con constructor secundario =====")
    val auto2 = Vehiculo("Nissan")
    auto2.imprimirInfo()

    println("\n===== Ajustando precio manualmente =====")
    auto1.precio = 25000.0
    auto1.imprimirInfo()

    println("\n===== Vehículo deportivo (herencia) =====")
    val deportivo = Deportivo("Ferrari", "F8", 2023, 340)
    deportivo.imprimirInfo()

    println("\n===== Personas (abstracción + interfaz) =====")
    val conductor = Conductor("Arold")
    val mecanico = Mecanico("Luis")
    conductor.trabajar()
    mecanico.trabajar()
}

fun main() {
    demoVehiculos()
}