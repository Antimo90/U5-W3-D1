package antimomandorino.u5w3d1.controllers;

import antimomandorino.u5w3d1.payloads.LoginDTO;
import antimomandorino.u5w3d1.payloads.LoginResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginDTO body) {
    }

}
