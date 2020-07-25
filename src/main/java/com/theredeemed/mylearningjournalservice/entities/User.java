package com.theredeemed.mylearningjournalservice.entities;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "USER")
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false, unique = true)
    long id;

    @Column(name = "FIRST_NAME", nullable = false, updatable = true, length = 50)
    String firstName;

    @Column(name = "LAST_NAME", nullable = false, updatable = true, length = 50)
    String lastName;

    @Column(name = "EMAIL", nullable = false, updatable = false, unique = true)
    String email;

    @Column(name = "CREATED_TIMESTAMP", nullable = false)
    @CreationTimestamp
    LocalDateTime createdTimestamp;

    @Column(name = "UPDATED_TIMESTAMP", nullable = false)
    @UpdateTimestamp
    LocalDateTime updatedTimestamp;
}
