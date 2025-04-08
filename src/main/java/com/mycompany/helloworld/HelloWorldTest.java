/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    public void testMensagem() {
        HelloWorld hello = new HelloWorld();
        String resultado = hello.Mensagem();
        // Verifica se o método Mensagem() retorna "Hello, World!"
        assertEquals("Hello, World!", resultado, "O método deve retornar 'Hello, World!'");
    }

    private void assertEquals(String hello_World, String resultado, String o_método_deve_retornar_Hello_World) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
