package org.example.database;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.example.model.Ticket;

public class TicketManager {

  private final Map<Long, Ticket> ticketMap = new HashMap<>();
  private final AtomicLong counter = new AtomicLong();

  public void saveTicket(Ticket ticket) {
    if (Objects.isNull(ticket.getId())) {
      ticket.setId(counter.incrementAndGet());
    }
    ticketMap.put(ticket.getId(), ticket);
  }

  public Optional<Ticket> getTicket(Long id) {
    return Optional.ofNullable(ticketMap.get(id));
  }

  public Collection<Ticket> getAllTickets() {
    return ticketMap.values();
  }

  public void deleteTicket(Long id) {
    ticketMap.remove(id);
  }
}

