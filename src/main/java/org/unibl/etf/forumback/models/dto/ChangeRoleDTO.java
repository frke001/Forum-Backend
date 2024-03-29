package org.unibl.etf.forumback.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.unibl.etf.forumback.validators.SQLInjectionMatch;
import org.unibl.etf.forumback.validators.XSSMatch;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeRoleDTO {

    @NotBlank
    @Pattern(regexp = "^(Admin|Moderator|Client)$", message = "Invalid role")
    @XSSMatch
    @SQLInjectionMatch
    private String role;
}
