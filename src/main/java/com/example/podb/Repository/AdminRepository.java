package dev.PodB.Ecommerce.Repository;


import dev.PodB.Ecommerce.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
