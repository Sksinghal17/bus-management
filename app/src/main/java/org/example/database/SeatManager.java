package org.example.database;


import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.example.model.Seat;

public class SeatManager {

  private final Map<Long, Seat> seatMap = new HashMap<>();
  private final AtomicLong counter = new AtomicLong();

  public void saveSeat(Seat seat) {
    if (Objects.isNull(seat.getId())) {
      seat.setId(counter.incrementAndGet());
    }
    seatMap.put(seat.getId(), seat);
  }

  public Optional<Seat> getSeat(Long id) {
    return Optional.ofNullable(seatMap.get(id));
  }

  public Collection<Seat> getAllSeats() {
    return seatMap.values();
  }

  public void deleteSeat(Long id) {
    seatMap.remove(id);
  }
}
