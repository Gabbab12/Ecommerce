package dev.PodB.Ecommerce.Repository;


import dev.PodB.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
