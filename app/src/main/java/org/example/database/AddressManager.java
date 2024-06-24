package org.example.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import org.example.model.Address;


public class AddressManager {

  private final Map<Long, Address> addressMap = new HashMap<>();
  private final AtomicLong counter = new AtomicLong();

  public void saveAddress(Address address) {
    if (Objects.isNull(address.getId())) {
      address.setId(counter.incrementAndGet());
    }
    addressMap.put(address.getId(), address);
  }

  public Optional<Address> getAddress(Long id) {
    return Optional.ofNullable(addressMap.get(id));
  }

  public Collection<Address> getAll() {
    return addressMap.values();
  }

  public void deleteAddress(Long id) {
    addressMap.remove(id);
  }
}
