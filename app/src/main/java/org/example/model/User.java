package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Gender;
import org.example.enums.UserType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

  private Long id;
  private String username;
  private String password;
  private String email;
  private String phoneNumber;
  private Integer age;
  private Gender gender;
  private UserType userType;
}
