package com.epam;

import java.util.ArrayList;
import java.util.List;

public class TicketFactory {
    private List<Ticket> allTickets = new ArrayList<Ticket>();
    public List<Ticket> createAllTickets(int ticketCount, int ticketSize) {
        for (int i=0; i<ticketCount; i++) {
            allTickets.add(new Ticket(ticketSize, i));
        }
        return allTickets;
    }

    public void printAllTickets() {
        for (Ticket element: allTickets) {
            System.out.print("com.epam.Ticket: ");
            for (Integer numbers: element.getTicketNumbers()) {
                System.out.print(numbers + "\t");
            }
            System.out.println();
        }
    }

    public List<Ticket> getAllTickets() {
        return allTickets;
    }
}