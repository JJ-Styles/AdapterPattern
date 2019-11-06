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
public interface Website 
{
    public abstract String getTravelPlan();
    public abstract String getTravelDate();
    public abstract double getPrice();
    public abstract String getTicketPeak();
    public abstract String getTicketAgeCat();
}
