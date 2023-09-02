package dev.PodB.Ecommerce.DTO;

import dev.PodB.Ecommerce.Model.Inventory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long productId;
    private String name;
    private String shortDescription;
    private String longDescription;
    private Double price;
    private Inventory inventory;

//    public ProductDTO(Product product){
//        this.productId = product.getId();
//        this.name = product.getName();
//        this.shortDescription = product.getShortDescription();
//        this.longDescription = product.getLongDescription();
//        this.price = product.getPrice();
//        this.inventory = product.getInventory();
//    }
}
