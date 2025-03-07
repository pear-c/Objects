package Ticket_Selling_App;

// 관람객 가방 (소지품) 클래스
public class Bag {
    private Long amount;            // 현금
    private Invitation invitation;  // 초대장
    private Ticket ticket;          // 티켓

    // 초대장 없는 관람객 가방
    public Bag(long amount) {
        this(null, amount);
    }
    // 초대장을 받은 관람객 가방
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        if(hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return amount;
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
