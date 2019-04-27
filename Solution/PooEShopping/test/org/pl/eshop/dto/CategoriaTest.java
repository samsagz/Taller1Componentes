/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;
import org.junit.*;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author monob
 */
public class CategoriaTest {

    public CategoriaTest() {
    }

//    @BeforeAll
//    public static void setUpClass() {
//    }
//
//    @AfterAll
//    public static void tearDownClass() {
//    }
//
//    @BeforeEach
//    public void setUp() {
//    }
//
//    @AfterEach
//    public void tearDown() {
//    }

    /*
    Si se pasa un id menor o igual a cero mediante el setter respectivo, deberá
    generarse una IllegalArgumentException o excepción equivalente en el
    lenguaje utilizado
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIdMenorOCero() throws Exception {
        System.out.println("* Test Id Menor o Cero");
        Categoria categoria = new Categoria();

        categoria.setId(0);
        categoria.setId(-1);
    }

    /*
     Si se pasa un id nulo mediante el setter respectivo, deberá generarse una
    IllegalArgumentException o excepción equivalente en el lenguaje
    utilizado.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIdNulo() throws Exception {
        Categoria categoria = new Categoria();

        categoria.setId(null);
    }

    /*
     Si se pasa un nombre vacío mediante el setter respectivo, deberá generarse una
    IllegalArgumentException o excepción equivalente en el lenguaje
    utilizado.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNombreVacio() {
        Categoria categoria = new Categoria();

        categoria.setNombre("");
        categoria.setNombre(" ");

    }

    /*
     Si se pasa un nombre nulo mediante el setter respectivo, deberá generarse una
    IllegalArgumentException o excepción equivalente en el lenguaje
    utilizado.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNombreNulo() {
        Categoria categoria = new Categoria();

        categoria.setNombre(null);
    }

    /*
     Si se pasa un nombre con menos de tres caracteres mediante el setter respectivo,
    deberá generarse una IllegalArgumentException o excepción equivalente
    en el lenguaje utilizado.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNombreCorto() {
        Categoria categoria = new Categoria();
        categoria.setNombre("tes");
    }

    /*
    Al obtener el nombre de un objeto Categoria recién creado sin parámetros en
    su constructor, me deberá devolver una cadena vacía
     */
    @Test
    public void testNombreCategoriaNueva() {
        Categoria categoria = new Categoria();

        assertTrue("Validar Categoria sin parametros", "".equals(categoria.getNombre()));
    }

}
