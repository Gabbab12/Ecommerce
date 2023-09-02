package com.example.podb.Controller;

import com.example.podb.DTO.AuthenticationResponse;
import com.example.podb.DTO.LoginDto;
import com.example.podb.DTO.SignUpDto;
import com.example.podb.Model.LocalUser;
import com.example.podb.Services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class AuthController {
    
    private final UserServices userServices;
    
    @PostMapping("register")
    public ResponseEntity<SignUpDto> registerUser(@RequestBody SignUpDto signUpDto) {
        SignUpDto registeredUser = userServices.registerUser(signUpDto);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
    @PostMapping("login")
    public ResponseEntity<AuthenticationResponse>  loginUser(@RequestBody LoginDto loginDto){
        AuthenticationResponse response = userServices.loginUser(loginDto);
        return  ResponseEntity.ok().body(response);
    }
}
