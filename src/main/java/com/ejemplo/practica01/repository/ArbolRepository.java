package com.ejemplo.practica01.repository;

import com.ejemplo.practica01.model.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbolRepository extends JpaRepository<Arbol, Long> {
}
