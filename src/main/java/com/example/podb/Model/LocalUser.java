package dev.PodB.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "local user")
public class LocalUser {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private Long id;


        @Column(name = "username", nullable = false, unique = true)
        private String username;

        @Column(name = "password", nullable = false, length = 1000)
            private String password;

        @Column(name = "email", nullable = false, unique = true, length = 320)
        private String email;

        @Column(name = "first_name", nullable = false)
        private String firstName;

        @Column(name = "last_name", nullable = false)
        private String lastName;

}
