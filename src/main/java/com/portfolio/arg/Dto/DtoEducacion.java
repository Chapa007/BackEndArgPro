package com.portfolio.arg.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author lucad
 */
public class DtoEducacion {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreE, String decripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = decripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDecripcionE(String decripcionE) {
        this.descripcionE = decripcionE;
    }
    
    
    
}
