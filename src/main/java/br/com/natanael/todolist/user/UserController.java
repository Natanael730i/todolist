package br.com.natanael.todolist.user;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){
        var user = this.userRepository.findByUserName(userModel.getUserName());

        if (user != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário Já Existe");
        }
        var passwordHashered =  BCrypt.withDefaults()
                .hashToString(12, userModel
                        .getPassword()
                        .toCharArray());

        userModel.setPassword(passwordHashered);

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
