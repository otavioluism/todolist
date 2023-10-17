package br.com.otavioluism.todolist.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController { 

  @Autowired //anotation para realizar a construcao da clase 
  private IUserRepository userRepository;

  @PostMapping("/create")
  public ResponseEntity create(@RequestBody UserModel userModel) { 
        UserModel user = this.userRepository.findByUsername(userModel.getUsername());
        
        if (user != null) {
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario ja existe!");
        }

        var userCreate = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreate);

  }
  
}
