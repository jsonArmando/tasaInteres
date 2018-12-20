/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compania.financiamiento;

import com.sun.xml.internal.txw2.annotation.XmlElement;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author json
 */
@XmlRootElement(name = "intereseSocio")
public class interesesSocio implements Serializable {

    private int id;

    public interesesSocio() {

    }

    public interesesSocio(int id, String socio, Float tasa, Float montoMaximo) {
        this.id = id;
        this.socio = socio;
        this.tasa = tasa;
        this.montoMaximo = montoMaximo;
    }
    private String socio;
    private Float tasa;
    private Float montoMaximo;

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public void setSocio(String socio) {
        this.socio = socio;
    }

    @XmlElement
    public void setTasa(Float tasa) {
        this.tasa = tasa;
    }

    @XmlElement
    public void setMontoMaximo(Float montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
}
