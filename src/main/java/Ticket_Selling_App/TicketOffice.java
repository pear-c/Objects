package Ticket_Selling_App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 매표소 클래스
public class TicketOffice {
    private Long amount;    // 판매 금액
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    // 티켓 판매 메서드 : 편의상 tickets 중 맨 처음 Ticket 반환
    private Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
