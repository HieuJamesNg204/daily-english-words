package com.hieujavahound.daily_english_words.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "word")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String word;

    @Column(nullable = false)
    private String typeOfSpeech;

    @Column(nullable = false)
    private String ipaPronunciation;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String meaning;
}