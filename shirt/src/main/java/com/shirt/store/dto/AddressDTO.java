package com.shirt.store.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    @NotNull(message = "O campo {address} é obrigatório")
    private String address;

    @NotNull(message = "O campo {number} é obrigatório")
    @Positive(message = "O campo {number} deve ser positivo")
    private String number;
}
