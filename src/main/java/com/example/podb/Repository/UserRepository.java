package dev.PodB.Ecommerce.Repository;

import dev.PodB.Ecommerce.Model.LocalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<LocalUser, Long> {
    Optional<LocalUser> findByUsernameIgnoreCase(String username);
    Optional<LocalUser> findByEmail(String email);
}
