package br.com.otavioluism.todolist.user;


import org.springframework.beans.factory.annotation.Autowired;
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
  public UserModel create(@RequestBody UserModel userModel) { 
        var userCreate = this.userRepository.save(userModel);
        return userCreate;
  }
  
}
