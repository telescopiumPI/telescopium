package Telescopium.Telescopium.Services;

import Telescopium.Telescopium.Entities.Role;
import Telescopium.Telescopium.Entities.User;

import java.util.List;

public interface UserService {
  User saveUser(User user);

  Role saveRole(Role role);

  void addRoleToUser(String username, String roleName);

  User getUser(String username);

  List<User> getUsers();
}
