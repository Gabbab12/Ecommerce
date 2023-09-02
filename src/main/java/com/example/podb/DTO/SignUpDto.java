package dev.PodB.Ecommerce.DTO;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SignUpDto {
    private String username;

    private String password;

    private String email;

    private String firstName;

    private String lastName;
}
