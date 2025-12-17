package com.hieujavahound.daily_english_words.entity;

import com.hieujavahound.daily_english_words.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    private String emailVerificationCode;

    @Column
    private Long emailVerificationCodeGeneratedAt;

    @Column
    private Long resetPasswordCode;

    @Column
    private Long resetPasswordCodeGeneratedAt;

    @Column
    private String emailChangeCode;

    @Column
    private Long emailChangeCodeGeneratedAt;

    @Column
    private String pendingEmail;

    @Column
    private boolean isEnabled = false;
}