/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fattahpour.uap.messages;

/**
 *
 * @author peyman
 */
public class UssdUnBindResp extends MessageBase {

    public UssdUnBindResp() {
        this.CommandID = CommandIDs.UssdUnBindResp;
    }

    @Override
    protected boolean dencode() {
        return super.dencode(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
