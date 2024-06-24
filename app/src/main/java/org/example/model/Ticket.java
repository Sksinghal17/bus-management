package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ticket {

  private Long id;
  private User customer;
  private Seat seat;
  private double price;
  private boolean isCancelled;
  private long tripId;

  public void cancelTicket() {
    this.seat.setOccupied(false);
    this.isCancelled = true;
  }

  public void bookTicket(User customer, Seat seat, double price, int tripId) {
    this.customer = customer;
    this.seat = seat;
    this.price = price;
    this.tripId = tripId;
  }

}
