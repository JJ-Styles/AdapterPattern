/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author t7047098
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Setting data of a new ETicket to Travel Plan: A-B, Travel Date: 11/11/2011-12/12/2012, "
                + "Price: £40.05, Ticket Peak: non, Ticket Age Catagory: Student");
        Website w = new ETicket("A-B","11/11/2011-12/12/2012",40.05,"non","Student");
        System.out.println("New Adapter is created passing through the ETicket");
        Adapter a = new Adapter(w);
        System.out.println("The Adapter gives the following values:");
        System.out.println("Origin: " + a.getOrigin());
        System.out.println("Destination: " + a.getDestination());
        System.out.println("Ticket Type: " + a.getTicketType());
        System.out.println("Price: £" + a.getPrice());
        System.out.println("Start Date: " + a.startDate());
        System.out.println("End Date: " + a.endDate());     
    }
    
}
