/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Alumno;

/**
 *
 * @author Angela
 */
public class AlumnoDao {
    
     public  List<Alumno> alumnos = new ArrayList<>();

     
    public void agragarAlumno(Alumno alumno) {
        alumnos.add(alumno);

    }

    public void eliminarAlumno( Alumno alumno) {
        alumnos.remove(alumno);
    }

    public Alumno buscarAlumno(int id) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a= alumnos.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarAlumno(Alumno alumno) {
        for (int i = 0; i < alumnos.size(); i++) {
          if(alumnos.get(i).getId()== alumno.getId()){
              alumnos.get(i).setNombre(alumno.getNombre());
               alumnos.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
          }
            }
        }
     
    
    public void imprimirAlumno (ArrayList<Alumno> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
}
