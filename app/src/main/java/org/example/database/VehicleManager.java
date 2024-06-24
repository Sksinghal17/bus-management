package org.example.database;


import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.example.model.Vehicle;

public class VehicleManager {

  private final Map<Long, Vehicle> vehicleMap = new HashMap<>();
  private final AtomicLong counter = new AtomicLong();

  public void saveVehicle(Vehicle vehicle) {
    if (Objects.isNull(vehicle.getId())) {
      vehicle.setId(counter.incrementAndGet());
    }
    vehicleMap.put(vehicle.getId(), vehicle);
  }

  public Optional<Vehicle> getVehicle(Long id) {
    return Optional.ofNullable(vehicleMap.get(id));
  }

  public Collection<Vehicle> getAllVehicles() {
    return vehicleMap.values();
  }

  public void deleteVehicle(Long id) {
    vehicleMap.remove(id);
  }
}

