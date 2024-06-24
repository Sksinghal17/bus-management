package org.example.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trip {

  private Long id;
  private Address startLocation;
  private Address endLocation;
  private Date scheduledStartTime;
  private Date scheduledEndTime;
  private Date actualStartTime;
  private Date actualEndTime;
  private Vehicle vehicle;
  private Driver driver;
  private boolean isCancelled;

  public void createTrip(Address startLocation, Address endLocation, Date scheduledStartTime,
      Date scheduledEndTime, Vehicle vehicle, Driver driver) {
    this.startLocation = startLocation;
    this.endLocation = endLocation;
    this.scheduledStartTime = scheduledStartTime;
    this.scheduledEndTime = scheduledEndTime;
    this.vehicle = vehicle;
    this.driver = driver;
  }

  public Address getCurrentLocation() {
    return this.vehicle.getLocation();
  }

  public void cancelTrip() {
    this.isCancelled = true;
  }

}
