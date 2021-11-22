package Telescopium.Telescopium.Repositories;

import Telescopium.Telescopium.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Role findByName(String name);

  Boolean existsByName(String name);
}
