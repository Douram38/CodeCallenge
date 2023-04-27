package com.Pfcti.CodeChallenge.service;

import com.Pfcti.CodeChallenge.dto.ClienteDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ClienteServiceTest {

        @Autowired
        private ClienteService clienteService;
        @Test
        void obtenerClientes() {
            List<ClienteDto> clientesDto = clienteService.obtenerClientes();
            clienteService
                    .obtenerClientes()
                    .forEach(cliente -> System.out.println(">>>>> CLIENTE EXISTENTE: " + cliente.getNombres() +" " + cliente.getApellidos()));

            assertEquals(1,1);
        }

}