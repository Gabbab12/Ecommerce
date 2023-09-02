package dev.PodB.Ecommerce.Services;


import dev.PodB.Ecommerce.DTO.ProductDTO;
import dev.PodB.Ecommerce.Model.Admin;

public interface AdminService {

    Admin findByUsername(String username);

    Admin saveAdmin(Admin adminDTO);

    ProductDTO addProduct(ProductDTO productDTO);

    ProductDTO updateProduct(ProductDTO productDTO, Long id);

    void deleteProduct(Long id);


}
