/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_4;

/**
 *
 * @author cesar
 */
public class AdapterWhatsApp implements Notificador{
    private WhatsAppAPI adaptee(){
    WhatsAppAPI TA =new WhatsAppAPI();
    return TA;
    }
    @Override
    public void eviarNotificacion(String Mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
