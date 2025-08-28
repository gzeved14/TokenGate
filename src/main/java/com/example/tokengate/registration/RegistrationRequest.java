package com.example.tokengate.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
@NoArgsConstructor

public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
