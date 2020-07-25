package com.theredeemed.mylearningjournalservice.entities;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "JOURNAL_ENTRY")
@Data
@Builder
public class JournalEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false, unique = true)
    long id;

    @Column(name = "TITLE", nullable = false, updatable = true, length = 100)
    String title;

    @Column(name = "ENTRY", nullable = false, updatable = true, length = 4000)
    String entry;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreationTimestamp
    LocalDateTime createdTimestamp;

    @Column(name = "UPDATED_TIMESTAMP", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedTimestamp;
}
