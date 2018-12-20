/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compania.financiamiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author json
 */
public class interesDao {

    public List<interes> getAllInteres() {
        List<interes> interesList = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/interesDB", "root", "881127son;");
            Statement stmt = com.createStatement();
            ResultSet rs = stmt.executeQuery("select * from interes");
            interesList = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String socioPrestamo = rs.getString(2);
                Float cuotaMensual = rs.getFloat(3);
                Float pagoCredito = rs.getFloat(4);
                Float tasa = rs.getFloat(5);
                Float tasaInteres = rs.getFloat(6);
                Float montoMaximo = rs.getFloat(7);
                interesList.add(new interes(id, socioPrestamo, cuotaMensual, pagoCredito, tasa, tasaInteres, montoMaximo));
            }
            rs.close();
            stmt.close();
            com.close();
            return interesList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interesList;
    }

    public String addInteres(int id, String socioPrestamo, Float cuotaMensual, Float pagoCredito, Float tasa, Float tasaInteres, Float montoMaximo) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/interesDB", "root", "881127son;");
            Statement stmt = com.createStatement();
            int result = stmt.executeUpdate("insert into interes values(" + id + ", '" + socioPrestamo + "','" + cuotaMensual + "','" + pagoCredito + "','" + tasa + "' ,'" + tasaInteres + "','" + montoMaximo + "')");
            if(result ==1){
                return "success";
            }
            stmt.close();
            com.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fail";
    }  
}
