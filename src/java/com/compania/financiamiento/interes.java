/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compania.financiamiento;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author json
 */
@XmlRootElement(name = "interes")
public class interes implements Serializable{
    int id;
    public interes(){
                                                                                                                                         
    }
    public interes(int id, String socioPrestamo, Float cuotaMensual, Float pagoCredito,  Float tasa, Float tasaInteres, Float montoMaximo) {
        this.id = id;
        this.socioPrestamo = socioPrestamo;
        this.cuotaMensual = cuotaMensual;
        this.pagoCredito = pagoCredito;
        this.tasaInteres = tasaInteres;
        this.tasa = tasa;
        this.montoMaximo = montoMaximo;
    }
    
    
    String socioPrestamo;
    Float cuotaMensual, pagoCredito, tasaInteres;
    Float tasa, montoMaximo;
    
    
    public int getId() {
        return id;
    }
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }
    
    public String getSocioPrestamo() {
        return socioPrestamo;
    }
    @XmlElement
    public void setSocioPrestamo(String socioPrestamo) {
        this.socioPrestamo = socioPrestamo;
    }
    
    public Float getCuotaMensual() {
        return cuotaMensual;
    }
    @XmlElement
    public void setCuotaMensual(Float cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
    
    public Float getPagoCredito() {
        return pagoCredito;
    }
    @XmlElement
    public void setPagoCredito(Float pagoCredito) {
        this.pagoCredito = pagoCredito;
    }
    
    public Float getTasaInteres() {
        return tasaInteres;
    }
    @XmlElement
    public void setTasaInteres(Float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    
    public Float getTasa() {
        return tasa;
    }
    @XmlElement
    public void setTasa(Float tasa) {
        this.tasa = tasa;
    }
    
    public Float getMontoMaximo() {
        return montoMaximo;
    }
    @XmlElement
    public void setMontoMaximo(Float montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
    
}
