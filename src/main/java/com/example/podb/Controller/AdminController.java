package dev.PodB.Ecommerce.Controller;


import dev.PodB.Ecommerce.DTO.ProductDTO;
import dev.PodB.Ecommerce.Services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequiredArgsConstructor
@RequestMapping("api/v1/admins")
public class AdminController {
    private final AdminService adminService;


    @PostMapping("/addProduct")
    public ResponseEntity<ProductDTO> addProduct (@RequestBody ProductDTO productDTO){
        ProductDTO savedProduct = adminService.addProduct(productDTO);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<ProductDTO> updateProduct (@RequestBody ProductDTO productDTO, Long id){
        ProductDTO updatedProduct = adminService.updateProduct(productDTO, id);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }
    @DeleteMapping("deleteProduct/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        adminService.deleteProduct(id);
        return new ResponseEntity<>("Product deleted!", HttpStatus.OK);
    }

}
