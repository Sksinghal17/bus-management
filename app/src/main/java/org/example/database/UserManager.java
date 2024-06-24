package org.example.database;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import org.example.model.User;

public class UserManager {

  private final Map<Long, User> userMap = new HashMap<>();
  private final AtomicLong counter = new AtomicLong();

  public void saveUser(User user) {
    if (Objects.isNull(user.getId())) {
      user.setId(counter.incrementAndGet());
    }
    userMap.put(user.getId(), user);
  }

  public Optional<User> getUser(Long id) {
    return Optional.ofNullable(userMap.get(id));
  }

  public Collection<User> getAllUsers() {
    return userMap.values();
  }

  public void deleteUser(Long id) {
    userMap.remove(id);
  }
}

