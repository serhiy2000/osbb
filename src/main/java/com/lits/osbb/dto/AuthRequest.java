package com.lits.osbb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    @NotEmpty
    @Size(max = 64)
    private String email;

    @NotEmpty
    @Size(max = 32)
    private String password;
}
