package org.example.ejercicioKotlin.sistemaGestionBiblioteca

data class Usuario(val nombre:String, var libro :Libro? = null) {
}