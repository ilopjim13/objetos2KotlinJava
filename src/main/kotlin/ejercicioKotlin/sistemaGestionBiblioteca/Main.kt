package org.example.ejercicioKotlin.sistemaGestionBiblioteca

fun main() {

    val libro = Libro("El señor de los anillos")
    val libro2 = Libro("Harry Potter")

    val usuario = Usuario("Pepe")

    val biblioteca = Biblioteca()

    biblioteca.agregarLibros(libro)
    biblioteca.agregarLibros(libro2)


    if (biblioteca.prestrarUsuario(usuario, libro)) println("Se le ha prestado el libro correctamente.")
    else println("No se ha podido prestar el libro")


    if (biblioteca.devolverLibro(usuario)) println("Se ha devuelto el libro correctamente")
    else println("No se ha podido devolver el libro")

}