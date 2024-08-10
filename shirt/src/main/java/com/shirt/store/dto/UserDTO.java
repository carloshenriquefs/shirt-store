package com.shirt.store.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "O campo {name} é obrigatório")
    private String name;

    @NotNull(message = "O campo {lastName} é obrigatório")
    private String lastName;

    @NotNull(message = "O campo {birthday} é obrigatório")
    private String birthday;

    @NotNull(message = "O campo {phoneNumber} é obrigatório")
    private String phoneNumber;

    @NotNull(message = "O campo {notifications} é obrigatório")
    private Boolean notifications;

    private ScheduleDTO scheduleDTO;
}
