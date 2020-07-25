package com.theredeemed.mylearningjournalservice.entities;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CATEGORY")
@Data
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false, unique = true)
    long id;

    @Column(name = "NAME", nullable = false, updatable = true, length = 100)
    String name;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreationTimestamp
    LocalDateTime createdTimestamp;

    @Column(name = "UPDATED_TIMESTAMP", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedTimestamp;
}
