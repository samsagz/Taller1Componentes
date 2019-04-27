/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author monob
 */
public class CategoriaTest {
    
    public CategoriaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /*
    Si se pasa un id menor o igual a cero mediante el setter respectivo, deberá
    generarse una IllegalArgumentException o excepción equivalente en el
    lenguaje utilizado
    */
     @Test
     public void testIdMenorOCero() {
     }
     
     /*
     Si se pasa un id nulo mediante el setter respectivo, deberá generarse una
    IllegalArgumentException o excepción equivalente en el lenguaje
    utilizado.
     */
    @Test
     public void testIdNulo() {
     }
     
     /*
     Si se pasa un nombre vacío mediante el setter respectivo, deberá generarse una
    IllegalArgumentException o excepción equivalente en el lenguaje
    utilizado.
     */
    @Test
     public void testNombreVacio() {
     }
     
     /*
     Si se pasa un nombre nulo mediante el setter respectivo, deberá generarse una
    IllegalArgumentException o excepción equivalente en el lenguaje
    utilizado.
     */
    @Test
     public void testNombreNulo() {
     }
     
     /*
     Si se pasa un nombre con menos de tres caracteres mediante el setter respectivo,
    deberá generarse una IllegalArgumentException o excepción equivalente
    en el lenguaje utilizado.
     */
    @Test
    public void testNombreCorto() {
    }
     
     /*
    Al obtener el nombre de un objeto Categoria recién creado sin parámetros en
    su constructor, me deberá devolver una cadena vacía
     */
    @Test
    public void testCategoriaNueva() {
    }
}
