package com.hieujavahound.daily_english_words.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "idiom")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Idiom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String idiom;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String meaning;
}