/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compania.financiamiento;

import java.io.IOException;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author json
 */
@Path("/intereService")
public class intereService {
    interesDao interesdao = new interesDao();
    @GET
    @Path("/intList")
    @Produces(MediaType.APPLICATION_JSON)
    public List<interes> displayInetres() {
        return interesdao.getAllInteres();
    }
    
    @POST
    @Path("/addInteres")
    @Produces(MediaType.APPLICATION_JSON)
    public String addIntereses(@FormParam("id")int id,
            @FormParam("socioPrestamo")String socioPrestamo,
            @FormParam("cuotaMensual")Float cuotaMensual,
            @FormParam("pagoCredito")Float pagoCredito,
            @FormParam("tasaInteres")Float tasaInteres,
            @FormParam("tasa")Float tasa,
            @FormParam("montoMaximo")Float montoMaximo) throws IOException{
        return interesdao.addInteres(id, socioPrestamo, cuotaMensual, pagoCredito, tasa, tasaInteres, montoMaximo);
        
    }
}
