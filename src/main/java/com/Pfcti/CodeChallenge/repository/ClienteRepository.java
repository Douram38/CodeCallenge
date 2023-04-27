package com.Pfcti.CodeChallenge.repository;

import com.Pfcti.CodeChallenge.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    Cliente findClienteByIdentificacion(String identificacion);

    @Modifying
    @Query("update Cliente c set c.estado = false where c.id = :clienteId")
    void setInactiveClienteById(Integer clienteId);

}