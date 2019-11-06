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
public class Adapter implements TicketMachine
{
    private TicketMachine tm;
    private String[] travelPlanSplit;
    private String[] travelDateSplit;
    
    public Adapter(Website w)
    {
        travelPlanSplit = w.getTravelPlan().split("-");
        travelDateSplit = w.getTravelDate().split("-");
        Date start = new Date(travelDateSplit[0]);
        Date end = new Date(travelDateSplit[1]);
        
        tm = new PaperTicket(travelPlanSplit[0],travelPlanSplit[1],w.getTicketPeak()+ ";" + w.getTicketAgeCat(), w.getPrice(), start, end);
    }

    @Override
    public String getOrigin() {
        return tm.getOrigin();
    }
    @Override
    public String getDestination() {
        return tm.getDestination();
    }

    @Override
    public String getTicketType() {
        return tm.getTicketType();
    }

    @Override
    public double getPrice() {
        return tm.getPrice();
    }

    @Override
    public Date startDate() {
        return tm.startDate();
    }

    @Override
    public Date endDate() {
        return tm.endDate();
    }
    
}
