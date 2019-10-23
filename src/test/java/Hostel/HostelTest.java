/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hostel;
import Exceptions.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author neido
 */
public class HostelTest {
    
    public HostelTest() {
    }

    @Test
    public void ninePlusTen(){
        assertEquals(19,9+10);
    }
    
    @Test
    public void addCustomer(){
        Hostel hostel=Hostel.getHostel();
        hostel.createCustomer("Berto", "berti", "1984-02-11", "rua AB", "ZIP123",
                "CIDADE", "ESTADO", "PAÍS", "rogerinhoespiga@hotmail.com");
        try{
        Customer bali=hostel.searchCustomerByName("Berto","berti");
        }
        catch(CustomerNotFoundException e){
            fail("customer not inserted");
        }
        
        
    }
    
    @Test
    public void addCustomer_graciousFailure(){
        
    }
}
