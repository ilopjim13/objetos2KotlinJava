package ejercicioJava.SistemaGestionEstudiantes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Matemáticas", 8);
        Curso curso2 = new Curso("Historia", 9);
        Curso curso3 = new Curso("Biología", 7);
        Curso curso4 = new Curso("Química", 8);
        Curso curso5 = new Curso("Física", 9);
        Curso curso6 = new Curso("Literatura", 8);

        Profesor profesor = new Profesor("Manolin");

        Estudiante pepe = new Estudiante("Pepe", new ArrayList<>());

        if(profesor.asignarCurso(pepe, curso1)) {
            System.out.println("Se le ha asignado correctamente la asignatura " + curso1.getNomCurso());
        }
        if(profesor.asignarCurso(pepe, curso2)) {
            System.out.println("Se le ha asignado correctamente la asignatura " + curso2.getNomCurso());
        }
        if(profesor.asignarCurso(pepe, curso3)) {
            System.out.println("Se le ha asignado correctamente la asignatura " + curso3.getNomCurso());
        }
        if(profesor.asignarCurso(pepe, curso4)) {
            System.out.println("Se le ha asignado correctamente la asignatura " + curso4.getNomCurso());
        }
        if(profesor.asignarCurso(pepe, curso5)) {
            System.out.println("Se le ha asignado correctamente la asignatura " + curso5.getNomCurso());
        }
        if(profesor.asignarCurso(pepe, curso6)) {
            System.out.println("Se le ha asignado correctamente la asignatura " + curso6.getNomCurso());
        }

        int notaMedia = profesor.calificarEstudiante(pepe);

        System.out.println("La nota media de " + pepe.getNombre() + " es de: " + notaMedia);
    }
}

