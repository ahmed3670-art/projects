/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author MaaDy
 */
public class authoriznon implements iauthorizebehavior {

    @Override
    public String authorized() {
        return "authorized non  " ; 
    }
    
    
}
