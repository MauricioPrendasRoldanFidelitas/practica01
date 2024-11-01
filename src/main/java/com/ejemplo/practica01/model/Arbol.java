package com.ejemplo.practica01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArbol;

    private String nombreComun;
    private String tipoFlor;
    private int durezaMadera;
    private double alturaPromedio;
    private String imagenRuta;

    // Getters y Setters
    public Long getIdArbol() { return idArbol; }
    public void setIdArbol(Long idArbol) { this.idArbol = idArbol; }

    public String getNombreComun() { return nombreComun; }
    public void setNombreComun(String nombreComun) { this.nombreComun = nombreComun; }

    public String getTipoFlor() { return tipoFlor; }
    public void setTipoFlor(String tipoFlor) { this.tipoFlor = tipoFlor; }

    public int getDurezaMadera() { return durezaMadera; }
    public void setDurezaMadera(int durezaMadera) { this.durezaMadera = durezaMadera; }

    public double getAlturaPromedio() { return alturaPromedio; }
    public void setAlturaPromedio(double alturaPromedio) { this.alturaPromedio = alturaPromedio; }

    public String getImagenRuta() { return imagenRuta; }
    public void setImagenRuta(String imagenRuta) { this.imagenRuta = imagenRuta; }
}
