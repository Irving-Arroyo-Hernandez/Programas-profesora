/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uamex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uaemex.dao.AlumnoDao;
import mx.uaemex.dao.LibroDao;
import mx.uaemex.dao.PrestamoDao;
import mx.uaemex.dao.ProfesorDao;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;

/**
 *
 * @author Angela
 */
public class Test1 {

    AlumnoDao alumnoDao = new AlumnoDao();
    LibroDao libroDao = new LibroDao();
    PrestamoDao prestamoDao = new PrestamoDao();
    ProfesorDao profesorDao = new ProfesorDao();

    public void testCrearPrestamo(Prestamo prestamo) {
        prestamoDao.Agregar(prestamo);
        System.out.println("Fin agregar prestamo");

    }

    public void testCrearLibro(Libro libro) {
        libroDao.Agregar(libro);
        System.out.println("Fin agregar");

    }
    
    
    public void testCrearAlumno(Alumno alumno){
        alumnoDao.agragarAlumno(alumno);
        System.out.println("agregoalumno");
    }

    public void consultarPrestamo() {

        //si es diferente de nulo que se imprima
        Prestamo p = prestamoDao.Buscar(2);
        System.out.println("Bsqueda por id  " + p.toString());
    }

    public void consultarTodos() {
        List<Prestamo> prestamos = prestamoDao.imprimirtListaPrestamos();
        // forech  NombreClase nombreVariaTemporal : nombre de la lista que se recorre
        for (Prestamo p : prestamos) {
            System.out.println(p.toString());
        }

    }

}
