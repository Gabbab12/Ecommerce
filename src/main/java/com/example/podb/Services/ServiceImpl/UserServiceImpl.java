package dev.PodB.Ecommerce.Services.ServiceImpl;


import dev.PodB.Ecommerce.DTO.LoginDto;
import dev.PodB.Ecommerce.DTO.SignUpDto;
import dev.PodB.Ecommerce.Exception.BadRequestException;
import dev.PodB.Ecommerce.Model.LocalUser;
import dev.PodB.Ecommerce.Repository.UserRepository;
import dev.PodB.Ecommerce.Services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserServices {

    private final UserRepository userRepository;
    @Override
    public LocalUser registerUser(SignUpDto signUpDto) {
       if (userRepository.findByEmail(signUpDto.getEmail()).isPresent()) {
                   throw new BadRequestException("User already existing", HttpStatus.BAD_REQUEST);
       }
               LocalUser user = new LocalUser();
               user.setUsername(signUpDto.getUsername());
               user.setPassword(signUpDto.getPassword());
               user.setEmail(signUpDto.getEmail());
               user.setFirstName(signUpDto.getFirstName());
               user.setLastName(signUpDto.getLastName());

               return userRepository.save(user);
    }

    @Override
    public Optional<LocalUser> findUserByEmail(LoginDto loginDto) {
        return Optional.empty();
    }
}
