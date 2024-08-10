package com.shirt.store.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CredentialsDTO {

    @Email
    @NotNull(message = "O campo {email} é obrigatório")
    private String email;

    @NotNull(message = "O campo {password} é obrigatório")
    private String password;
}
