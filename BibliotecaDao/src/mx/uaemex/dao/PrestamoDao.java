/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Prestamo;

/**
 *
 * @author Angela
 */
public class PrestamoDao {

    
    //crud
    public List<Prestamo> prestamos = new ArrayList<>();

    public void Agregar(Prestamo prestamo) {
        prestamos.add(prestamo);

    }

    public void Eliminar(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public Prestamo Buscar(int id) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo a = prestamos.get(i);
            if (a.getId() == id) {
//                 System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void Actualizar(Prestamo prestamo) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getId() == prestamo.getId()) {
                prestamos.get(i).setFolio(prestamo.getFolio());
            }
        }
    }

    public List<Prestamo> imprimirtListaPrestamos() {
        return prestamos;
      
    }

}
