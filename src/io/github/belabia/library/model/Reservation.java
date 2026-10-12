package io.github.belabia.library.model;

import java.time.LocalDate;

public class Reservation {
	
	private int id;
	private Member member;
	private Book book;
	private LocalDate reservedAt;
	private LocalDate pickupDeadline;
	private ReservationStatus status;
	
	public Reservation(int id, Member member, Book book) {
        this.id = id;
        this.member = member;
        this.book = book;
        this.reservedAt = LocalDate.now();
        this.pickupDeadline = reservedAt.plusDays(3);
        this.status = ReservationStatus.ACTIVE;
    }
	
	 public int getId() {
	        return id;
    }
	
	    public Member getMember() {
	        return member;
    }
	
	    public Book getBook() {
	        return book;
    }
	
	    public LocalDate getReservedAt() {
	        return reservedAt;
    }
	
	    public LocalDate getPickupDeadline() {
	        return pickupDeadline;
    }
	
	    public ReservationStatus getStatus() {
	        return status;
    }
	
	    public void cancel() {
	        this.status = ReservationStatus.CANCELLED;
    }
	
	    public void pickUp() {
	        this.status = ReservationStatus.PICKED_UP;
    }

	    public void giveBack() {
	        this.status = ReservationStatus.RETURNED;
    }
}
