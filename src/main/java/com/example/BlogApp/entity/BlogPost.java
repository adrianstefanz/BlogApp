package com.example.BlogApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "blogPosts")

public class BlogPost {
    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String blogText;

}
