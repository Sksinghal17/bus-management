package org.example.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.VehicleType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicle {

  private Long id;
  private String numberPlate;
  private VehicleType vehicleType;
  private List<Seat> seats;
  private Address location;
}
