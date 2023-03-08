/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uamex.dto;

/**
 *
 * @author Angela Rios
 */
public class Alumno  extends Persona{
    private int id;
    private int numeroCuenta;

    
    @Override
    public int getId() {
        return id;
    }

   
    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", numeroCuenta=" + numeroCuenta + '}';
    }
    
}
