package dev.chico.javacrud.domain.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProductDTO(
    @NotBlank
    String name, 
    @NotNull
    Integer price_in_cents) {

    
}
