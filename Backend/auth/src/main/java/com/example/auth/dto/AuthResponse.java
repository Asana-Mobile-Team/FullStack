package com.example.auth.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token; // The JWT
    private Long userId;
    private String email;
    private String firstName;
    private String lastName;
    private String message; // Added for success/failure messages
}
