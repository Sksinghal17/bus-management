package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

  private Long id;
  private String street;
  private String city;
  private String state;
  private String country;
  private Integer pinCode;
  private double latitude;
  private double longitude;
}
