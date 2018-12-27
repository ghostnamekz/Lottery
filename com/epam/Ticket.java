package com.epam;

import java.util.HashSet;
import java.util.Set;

public class Ticket {
    private int ticketSize;
    private int countDown;
    private int id;
    private Set<Integer> ticketNumbers = new HashSet<Integer>();

    public Ticket(int ticketSize, int id) {
        this.ticketSize = ticketSize;
        this.countDown = ticketSize;
        this.id = id;
        ticketFiller();
    }

    private void ticketFiller() {
        while (ticketNumbers.size() < ticketSize) {
            ticketNumbers.add(Generator.numberGenerator());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
    }

    public int getTicketSize() {
        return ticketSize;
    }

    public void setTicketSize(int ticketSize) {
        this.ticketSize = ticketSize;
    }

    public Set<Integer> getTicketNumbers() {
        return ticketNumbers;
    }

    public void setTicketNumbers(Set<Integer> ticketNumbers) {
        this.ticketNumbers = ticketNumbers;
    }

    @Override
    public String toString() {
        return "com.epam.Ticket{" +
                "ticketNumbers=" + ticketNumbers +
                '}';
    }
}