package dev.PodB.Ecommerce.Services;

import dev.PodB.Ecommerce.DTO.LoginDto;
import dev.PodB.Ecommerce.DTO.SignUpDto;
import dev.PodB.Ecommerce.Model.LocalUser;

import java.util.Optional;

public interface UserServices {
    LocalUser registerUser(SignUpDto signUpDto);
    Optional<LocalUser> findUserByEmail(LoginDto loginDto);

}
