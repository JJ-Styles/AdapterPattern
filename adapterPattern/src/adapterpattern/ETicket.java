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
public class ETicket implements Website 
{
    private String travelPlan;
    private String travelDate;
    private double price;
    private String ticketPeak;
    private String ticketAgeCat;

    public ETicket(String travelPlan, String travelDate, double price, String ticketPeak, String ticketAgeCat) {
        this.travelPlan = travelPlan;
        this.travelDate = travelDate;
        this.price = price;
        this.ticketPeak = ticketPeak;
        this.ticketAgeCat = ticketAgeCat;
    }

    @Override
    public String getTravelPlan() {
        return travelPlan;
    }

    @Override
    public String getTravelDate() {
        return travelDate;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getTicketPeak() {
        return ticketPeak;
    }

    @Override
    public String getTicketAgeCat() {
        return ticketAgeCat;
    }
    
    @Override
    public String toString()
    {
        return getTravelPlan() + " " +  getTravelDate() + " " + getPrice() + " " + getTicketPeak() + " " + getTicketAgeCat();
    }
}
