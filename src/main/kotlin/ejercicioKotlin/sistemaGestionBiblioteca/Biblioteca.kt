package org.example.ejercicioKotlin.sistemaGestionBiblioteca

class Biblioteca() {

    private val libros:MutableList<Libro> = mutableListOf()

    fun agregarLibros(libro: Libro):Boolean {
        if (libro !in libros) {
            libros.add(libro)
            return true
        }
        return false
    }

    private fun registrarUsuarioLibro(usuario: Usuario, libro: Libro){
        usuario.libro = libro
        libro.prestado = true
    }

    fun prestrarUsuario(usuario: Usuario, libro: Libro):Boolean {
        if (!libro.prestado) {
            registrarUsuarioLibro(usuario, libro)
            return true
        }
        return false
    }

    fun devolverLibro(usuario: Usuario) :Boolean {
        if (usuario.libro != null) {
            devolverUsuarioLibro(usuario, usuario.libro ?: Libro(""))
            return true
        }
        return false
    }


    private fun devolverUsuarioLibro(usuario: Usuario, libro: Libro) {
        usuario.libro = null
        libro.prestado = false
    }

}