package com.ejemplo.practica01.controller;

import com.ejemplo.practica01.model.Arbol;
import com.ejemplo.practica01.repository.ArbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/arboles")
public class ArbolController {

    @Autowired
    private ArbolRepository arbolRepository;

    // Obtener la lista de árboles
    @GetMapping
    public List<Arbol> getAllArboles() {
        return arbolRepository.findAll();
    }

    // Crear un nuevo árbol
    @PostMapping
    public Arbol createArbol(@RequestBody Arbol arbol) {
        return arbolRepository.save(arbol);
    }

    // Actualizar un árbol existente
    @PutMapping("/{id}")
    public Arbol updateArbol(@PathVariable Long id, @RequestBody Arbol arbolDetalles) {
        Arbol arbol = arbolRepository.findById(id).orElseThrow();
        arbol.setNombreComun(arbolDetalles.getNombreComun());
        arbol.setTipoFlor(arbolDetalles.getTipoFlor());
        arbol.setDurezaMadera(arbolDetalles.getDurezaMadera());
        arbol.setAlturaPromedio(arbolDetalles.getAlturaPromedio());
        arbol.setImagenRuta(arbolDetalles.getImagenRuta());
        return arbolRepository.save(arbol);
    }

    // Eliminar un árbol
    @DeleteMapping("/{id}")
    public void deleteArbol(@PathVariable Long id) {
        arbolRepository.deleteById(id);
    }
    
    @GetMapping("/listar")
    public String listarArboles(Model model) {
    List<Arbol> arboles = arbolRepository.findAll();
    model.addAttribute("arboles", arboles);
    return "listar";
    }

}
