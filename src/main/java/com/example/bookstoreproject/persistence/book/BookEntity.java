package com.example.bookstoreproject.persistence.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.UUID;

@Table(name = "books")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BookEntity {
    @Id
    private UUID id;
    private String title;
    private String author;
    private String description;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String image;
    private UUID userId;
}