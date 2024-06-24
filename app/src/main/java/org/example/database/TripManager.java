package org.example.database;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.example.model.Trip;

public class TripManager {

  private final Map<Long, Trip> tripMap = new HashMap<>();
  private final AtomicLong counter = new AtomicLong();

  public void saveTrip(Trip trip) {
    if (Objects.isNull(trip.getId())) {
      trip.setId(counter.incrementAndGet());
    }
    tripMap.put(trip.getId(), trip);
  }

  public Optional<Trip> getTrip(Long id) {
    return Optional.ofNullable(tripMap.get(id));
  }

  public Collection<Trip> getAllTrips() {
    return tripMap.values();
  }

  public void deleteTrip(Long id) {
    tripMap.remove(id);
  }
}
