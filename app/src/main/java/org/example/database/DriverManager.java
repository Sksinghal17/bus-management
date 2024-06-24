package org.example.database;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import org.example.model.Driver;

public class DriverManager {

  private final Map<Long, Driver> driverMap = new HashMap<>();
  private final AtomicLong counter = new AtomicLong();

  public void saveDriver(Driver driver) {
    if (Objects.isNull(driver.getId())) {
      driver.setId(counter.incrementAndGet());
    }
    driverMap.put(driver.getId(), driver);
  }

  public Optional<Driver> getDriver(Long id) {
    return Optional.ofNullable(driverMap.get(id));
  }

  public Collection<Driver> getAllDrivers() {
    return driverMap.values();
  }

  public void deleteDriver(Long id) {
    driverMap.remove(id);
  }
}
