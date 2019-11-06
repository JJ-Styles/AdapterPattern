package adapterpattern;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t7047098
 */
public interface TicketMachine 
{
    public abstract String getOrigin();
    public abstract String getDestination();
    public abstract String getTicketType();
    public abstract double getPrice();
    public abstract Date startDate();
    public abstract Date endDate();
}
