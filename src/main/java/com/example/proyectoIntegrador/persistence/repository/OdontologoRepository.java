package com.example.proyectoIntegrador.persistence.repository;

import com.example.proyectoIntegrador.persistence.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo,Integer> {


}
