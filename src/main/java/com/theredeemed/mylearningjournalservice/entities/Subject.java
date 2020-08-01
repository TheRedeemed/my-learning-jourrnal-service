package com.theredeemed.mylearningjournalservice.entities;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SUBJECT")
@Data
@Builder
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false, unique = true)
    long id;

    @Column(name = "TITLE", nullable = false, updatable = true, length = 100)
    String title;

    @Column(name = "AUTHOR", nullable = false, updatable = true, length = 100)
    String author;

    @Column(name = "SUMMARY", nullable = true, updatable = true, length = 2000)
    String summary;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreationTimestamp
    LocalDateTime createdTimestamp;

    @Column(name = "UPDATED_TIMESTAMP", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedTimestamp;
}
