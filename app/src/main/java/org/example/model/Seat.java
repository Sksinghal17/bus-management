package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.SeatType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Seat {

  private Long id;
  private SeatType seatType;
  private boolean isOccupied;
}
