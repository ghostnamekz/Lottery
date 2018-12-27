package com.epam;

import java.util.*;

public class GameRunner {
    public static void main(String[] args) {
        TicketFactory ticketFactory = new TicketFactory();
        ticketFactory.createAllTickets(10,6);
        ticketFactory.printAllTickets();

        int roundNumber;
        Wheel wheel = new Wheel();
        wheel.numbersOfWheel();
        ArrayList<Integer> gameNumbers = wheel.getNewWheelNumbers();
        List<Ticket> winnersList = new ArrayList<Ticket>();

        int index = 0;
        int round = 0;
        while (winnersList.size() < 1) {
            round++;
            roundNumber = gameNumbers.get(index);
            System.out.print(roundNumber + " ");
            for (Ticket ticket:ticketFactory.getAllTickets()) {
                for (Integer number: ticket.getTicketNumbers()) {
                    if (roundNumber == number) {
                        int temp = ticket.getCountDown() - 1;
                        System.out.print("-> " + roundNumber + " Now countDown of " + ticket.getId()+ "=" + temp + "<- ");
                        ticket.setCountDown(temp);
                    }
                }
                if (ticket.getCountDown() == 0) {
                    System.out.print("Winner " + ticket.getId());
                    winnersList.add(ticket);
                }
            }
            index++;
        }
        System.out.println();
        System.out.print("In the " + round + " round won ticket : ");
        for (Ticket ticket:winnersList) {
            System.out.println(ticket.getId() + " with numbers: " + ticket.getTicketNumbers() );
        }
    }
}