/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.calvarez.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String DescripcionE;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String DescripcionE) {
        this.nombreE = nombreE;
        this.DescripcionE = DescripcionE;
    }
    //Getters and Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return DescripcionE;
    }

    public void setDescripcionE(String DescripcionE) {
        this.DescripcionE = DescripcionE;
    }
    
    
}
