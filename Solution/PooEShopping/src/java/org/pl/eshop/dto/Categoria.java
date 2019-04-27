/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto;

import java.lang.Exception;

public class Categoria {

    private Integer id;
    private String nombre;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(Integer id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException();
        }

        this.id = id;
    }

    public String getNombre() {
        if(id== 0 && nombre.isEmpty() && descripcion.isEmpty() ){
            return " ";
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.equals("") || nombre.equals(" ") || nombre.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (nombre.length() <= 3) {
            throw new IllegalArgumentException();
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
