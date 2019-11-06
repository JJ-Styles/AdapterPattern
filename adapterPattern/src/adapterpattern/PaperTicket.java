/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

import java.util.Date;

/**
 *
 * @author t7047098
 */
public class PaperTicket implements TicketMachine 
{
    private String origin;
    private String destinaton;
    private String ticketType;
    private double price;
    private Date startDate;
    private Date endDate;

    public PaperTicket(String origin, String destinaton, String ticketType, double price, Date startDate, Date endDate) {
        this.origin = origin;
        this.destinaton = destinaton;
        this.ticketType = ticketType;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

    @Override
    public String getDestination() {
        return destinaton;
    }

    @Override
    public String getTicketType() {
        return ticketType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Date startDate() {
        return startDate;
    }

    @Override
    public Date endDate() {
        return endDate;
    }  
}
