package Telescopium.Telescopium.controllers;

import Telescopium.Telescopium.Entities.Role;
import Telescopium.Telescopium.Entities.User;
import Telescopium.Telescopium.Services.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
@RequestMapping("/api/users")
@RestController
public class UserController {
    private final UserService userServer;

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userServer.getUsers());
    }

    @PostMapping()
    public ResponseEntity<User> saveUsers(@RequestBody User user) {
        return ResponseEntity.ok().body(userServer.saveUser(user));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        return ResponseEntity.ok().body(userServer.saveRole(role));
    }

    @PostMapping("/role/addtouser")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form) {
        userServer.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

}

@Data
class RoleToUserForm {
    private String username;

    private String roleName;
}