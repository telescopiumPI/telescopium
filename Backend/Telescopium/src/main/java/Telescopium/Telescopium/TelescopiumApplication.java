package Telescopium.Telescopium;

import Telescopium.Telescopium.Entities.Role;
import Telescopium.Telescopium.Entities.User;
import Telescopium.Telescopium.Services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication  
public class TelescopiumApplication {

  public static void main(String[] args) {
    SpringApplication.run(TelescopiumApplication.class, args);
  }

  @Bean
  CommandLineRunner run(UserService userService) throws Exception {
    return args -> {
      userService.saveRole(new Role(null, "ROLE_DECIDER"));
      userService.saveRole(new Role(null, "ROLE_EMPLOYEE"));
      userService.saveRole(new Role(null, "ROLE_ADMIN"));

      userService.saveUser(new User(null, "Wiem Zahar", "Wiem", "123456789", new ArrayList<>()));
      userService.saveUser(new User(null, "Ala Trabelsi", "Ala", "123456789", new ArrayList<>()));
      userService.saveUser(
          new User(null, "Riadh Daoulatli", "Riadh", "123456789", new ArrayList<>()));
      userService.saveUser(new User(null, "Aziz Kitar", "Aziz", "123456789", new ArrayList<>()));
      userService.saveUser(
          new User(null, "Mohamed Belarbi", "Mohamed", "123456789", new ArrayList<>()));

      userService.addRoleToUser("Wiem", "ROLE_ADMIN");
      userService.addRoleToUser("Wiem", "ROLE_DECIDER");
      userService.addRoleToUser("Ala", "ROLE_DECIDER");
      userService.addRoleToUser("Riadh", "ROLE_EMPLOYEE");
      userService.addRoleToUser("Aziz", "ROLE_EMPLOYEE");
      userService.addRoleToUser("Mohamed", "ROLE_EMPLOYEE");
    };
  }
}
