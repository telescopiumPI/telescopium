package Telescopium.Telescopium.Services;

import Telescopium.Telescopium.Entities.Role;
import Telescopium.Telescopium.Entities.User;
import Telescopium.Telescopium.Repositories.RoleRepository;
import Telescopium.Telescopium.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        if (!userRepository.existsByUsername((user.getUsername()))) {
            log.info("Saving new user {} to the database", user.getName());
            return userRepository.save(user);
        } else {
            return userRepository.findByUsername(user.getUsername());
        }
    }

    @Override
    public Role saveRole(Role role) {
        if (!roleRepository.existsByName(role.getName())) {
            log.info("Saving new role {} to the database", role.getName());
            return roleRepository.save(role);
        } else {
            return roleRepository.findByName(role.getName());
        }
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user {}", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }
}
